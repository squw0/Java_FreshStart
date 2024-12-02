
import java.util.ArrayList;
import java.util.List;

public class Sito{
    public static void main(String[] args) {
        
        int start = 2;
        int end = 100;
        Buffor buffor = new Buffor();

        Thread generator = new Thread(new Generator(buffor, start, end));
        Thread konsument = new Thread(new Konsument(buffor));

        generator.start();
        konsument.start();
    }
}

class Buffor {
    private List<Integer> lista = new ArrayList<>();
    private final int capacity = 10;

    public synchronized void produce(int number) throws InterruptedException{
        while(number==capacity){
            System.out.println("Buffor jest pełny zatrzymanie generatora.");
            wait();
        }
        lista.add(number);
        System.out.println("Cyfra dodana do buffora: "+number);
        notify();

    }

    public synchronized Integer consume() throws InterruptedException{
        while(lista.isEmpty()){ 
            System.out.println("Buffor jest pusty!!!!");
            wait();
        }
        Integer number = lista.remove(0);
        notify();
        return number;
    }
}

class Generator implements Runnable {
    private Buffor buffor;
    private int start;
    private int end;

    public Generator(Buffor buffor, int start, int end){
        this.buffor = buffor;
        this.start = start;
        this.end = end;
    }

    @Override
    public void run(){
        try {
            for (int i = start; i <= end; i++) {
                buffor.produce(i);
                Thread.sleep(1000);
            }
        } catch (Exception e) {
        }
    }
}

class Konsument implements Runnable {

    private Buffor buffor;

    public Konsument(Buffor buffor){
        this.buffor = buffor;
    }

    private boolean isPrime(int number){
        if(number <= 1) return false;
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if(number % 2 == 0) return false;
        }
        return true;
    }

    @Override
    public void run(){
        try {
            while (true) { 
                Integer number = buffor.consume();
                if(isPrime(number)){
                    System.out.println("cyfra jest liczba pierwsza: "+number);
                }
                else{
                    System.out.println("cyfra nie jest liczba pierwsza: "+number);
                }
                Thread.sleep(1000);
            }
        } catch (Exception e) {
        }
    }
}