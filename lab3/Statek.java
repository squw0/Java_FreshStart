import java.util.*;
import java.util.concurrent.*;

class Prom implements Runnable {
    private final int maxCapacity;
    private final int waitTime;
    private final Semaphore onBoard;
    private final Object lock = new Object();
    private boolean atEastBank = true;
    private List<String> carsOnBoard = new ArrayList<>();

    public Prom(int maxCapacity, int waitTime) {
        this.maxCapacity = maxCapacity;
        this.waitTime = waitTime;
        this.onBoard = new Semaphore(maxCapacity);
    }

    public void board(String car) throws InterruptedException {
        onBoard.acquire();
        synchronized (lock) {
            carsOnBoard.add(car);
            System.out.println(car + " wjechał na prom.");
        }
    }

    public void unboard() {
        synchronized (lock) {
            for (String car : carsOnBoard) {
                System.out.println(car + " zjechał z promu.");
            }
            carsOnBoard.clear();
        }
        onBoard.release(maxCapacity);
    }

    @Override
    public void run() {
        while (true) {
            try {
                System.out.println("Prom czeka na brzegu " + (atEastBank ? "wschodnim" : "zachodnim"));
                Thread.sleep(waitTime * 1000);

                System.out.println("Prom odpływa z brzegu " + (atEastBank ? "wschodniego" : "zachodniego"));
                unboard();
                atEastBank = !atEastBank;
                Thread.sleep(2000); 
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                break;
            }
        }
    }
}

class Samochod implements Runnable {
    private final String id;
    private final Prom prom;
    private final Random random = new Random();

    public Samochod(String id, Prom prom) {
        this.id = id;
        this.prom = prom;
    }

    @Override
    public void run() {
        while (true) {
            try {
                System.out.println("Samochód " + id + " czeka na prom.");
                prom.board(id);

                Thread.sleep(2000);

                System.out.println("Samochód " + id + " jest na brzegu.");
                Thread.sleep((random.nextInt(5) + 1) * 1000);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                break;
            }
        }
    }
}
public class Statek {
    public static void main(String[] args) {
        int maxCars = 5;
        int waitTime = 10;
        Prom prom = new Prom(maxCars, waitTime);

        Thread promThread = new Thread(prom);
        promThread.start();

        for (int i = 1; i <= 10; i++) {
            new Thread(new Samochod("Samochód " + i, prom)).start();
        }
    }
}
