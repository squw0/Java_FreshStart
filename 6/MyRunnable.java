public class MyRunnable implements Runnable{
    
    @Override
    public void run(){
        for (int i = 0; i<10; i++) {
            System.out.println("Thread #1: "+i);
            try{
            Thread.sleep(1000);
            }
            catch(InterruptedException e) {
                System.out.println("Error");
            }
        }
        System.out.println("Thread #1 is finished");
    }
}
