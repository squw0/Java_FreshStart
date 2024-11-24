public class MyThreads extends Thread{
    
    @Override
    public void run(){
        for (int i = 10; i>0; i--) {
            System.out.println("Thread #2: "+i);
            try{
            Thread.sleep(1000);
            }
            catch(InterruptedException e) {
                System.out.println("Error");
            }
        }
        System.out.println("Thread #2 is finished");
    }
}
