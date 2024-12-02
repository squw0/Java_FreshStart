

public class eSynchronisationDemo {
    private static int counter = 0;
    public static void main(String[] args) {
        Thread one = new Thread(() -> {
            for(int i =0; i < 10000; i++){
                increment();
            }
        });

        Thread two = new Thread(() -> {
            for (int i = 0; i < 10000; i++) {
                increment(); // counter = counter + 1
            }
        });

        one.start();
        two.start();

        try {
            one.join();
            two.join();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        System.out.println("coutner value: "+counter);
    }

    private synchronized static void increment(){ // synchronized == only one can axcess at the time
        counter++;
    }

}
/*
 * 1. load
 * 2. increment
 * 3. set back the value
 * counter = 0; incrementValue = 1; setting back the value to counter = 1 <- thread 1
 * counter = 0; incrementValue = 1; <- thread 2
 */
 