public class waitAndNotifyDemo {
    private static final Object LOCK = new Object();

    public static void main(String[] args) {
        Thread one = new Thread(() -> {
            try {
                one();
            } catch (Exception e) {
            }

        });

        Thread two = new Thread(() -> {
            try {
                two();
            } catch (Exception e) {
            }
        });
        one.start();
        two.start();
    }
    public static void one() throws InterruptedException{
        synchronized (LOCK) {
            System.out.println("Hello from the method one...");
            LOCK.wait();
            System.out.println("Back again in the method one");
        }
    }
    private static void two() throws InterruptedException{
        synchronized (LOCK) {
            System.out.println("Hello from the method two...");
            LOCK.notify();
            System.out.println("Hello from method two even after notyfying...");
        }
    }
}
