public class cJoin {
    public static void main(String[] args) throws InterruptedException {
        Thread one = new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                System.out.println("Thread one: "+i);
            }
        });

        Thread two = new Thread(() -> {
            for (int i = 0; i < 20; i++) {
                System.out.println("Thread two: "+i);
            }
        });

        System.out.println("before executing the threads");
        one.start();
        two.start();
        one.join();
        two.join();
        System.out.println("done executing the threads");
    }
}
