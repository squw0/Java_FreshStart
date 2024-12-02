package lab3;
import java.util.ArrayList;
import java.util.List;

// Klasa Buffer do przechowywania liczb
class Buffer {
    private List<Integer> list = new ArrayList<>();
    private final int CAPACITY = 10; // Maksymalna liczba elementów w buforze

    // Metoda do produkcji liczb
    public synchronized void produce(int number) throws InterruptedException {
        while (list.size() == CAPACITY) { // Sprawdzamy czy buffor nie jest przepełniony
            System.out.println("Bufor pełny, producent czeka...");
            wait(); // Czekaj, aż będzie miejsce
        }

        list.add(number);
        System.out.println("Wyprodukowano: " + number);

//        System.out.println("Powiadom konsumenta, że są nowe elementy");
        notify();
    }

    // Metoda do konsumpcji liczb
    public synchronized Integer consume() throws InterruptedException {
        while (list.isEmpty()) { // Sprwadzamy czy Buffor nie jest pusty
            System.out.println("Bufor pusty, konsument usypia");
            wait(); // Czekaj, aż producnet doda element do Bufora
        }

        Integer number = list.remove(0);

//        System.out.println("Wybudzanie producenta jest miejsce w buforze");
        notify();
        return number;
    }
}

// Wątek producenta
class Producer implements Runnable {
    private Buffer buffer;
    private int start, end;

    public Producer(Buffer buffer, int start, int end) {
        this.buffer = buffer;
        this.start = start;
        this.end = end;
    }

    @Override
    public void run() {
        try {
            for (int i = start; i <= end; i++) {
                buffer.produce(i);
                Thread.sleep(2000); // Symulacja opóźnienia produkcji
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}

// Wątek konsumenta
class Consumer implements Runnable {
    private Buffer buffer;

    public Consumer(Buffer buffer) {
        this.buffer = buffer;
    }

    // Sprawdzanie, czy liczba jest liczbą pierwszą
    private boolean isPrime(int number) {
        if (number <= 1) return false;
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) return false;
        }
        return true;
    }

    @Override
    public void run() {
        try {
            while (true) {
                Integer number = buffer.consume();

                if (isPrime(number)) {
                    System.out.println("Liczba pierwsza: " + number);
                } else {
                    System.out.println("Liczba nie jest pierwsza: " + number);
                }

                Thread.sleep(3000); // Symulacja opóźnienia konsumpcji
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}

// Klasa główna
public class EasySieveExample {
    public static void main(String[] args) {
        int start = 2;
        int end = 50;

        Buffer buffer = new Buffer();
        Thread producerThread = new Thread(new Producer(buffer, start, end));
        Thread consumerThread1 = new Thread(new Consumer(buffer));
//        Thread consumerThread2 = new Thread(new Consumer(buffer));

        producerThread.start();
        consumerThread1.start();
//        consumerThread2.start();
    }
}