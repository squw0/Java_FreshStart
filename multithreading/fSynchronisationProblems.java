public class fSynchronisationProblems {
    private static int counter1 = 0;
    private static int counter2 = 0;
    public static void main(String[] args) {
        Thread one = new Thread(() -> {
            for(int i =0; i < 10000; i++){
                increment1();
            }
        });

        Thread two = new Thread(() -> {
            for (int i = 0; i < 10000; i++) {
                increment2(); // counter = counter + 1
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
        System.out.println("coutner value: "+counter1 + " --- " + counter2);
    }

    private synchronized static void increment1(){ // synchronized == only one can axcess at the time
        counter1++;
    }

    private synchronized static void increment2(){ // synchronized == only one can axcess at the time
        counter2++;
    }


}
/*
 * 1. load
 * 2. increment
 * 3. set back the value
 * counter = 0; incrementValue = 1; setting back the value to counter = 1 <- thread 1
 * counter = 0; incrementValue = 1; <- thread 2
 */


