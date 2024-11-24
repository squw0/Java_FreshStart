
public class dMultithreading {
    public static void main(String[] args) throws InterruptedException{
        
        // ver 1 Create a subclass of Thread
        MyThreads thread1 = new MyThreads();
        
        // ver 2 Implement Runnable interface and pass instace as an argument to Thread()
        MyRunnable runnable1 = new MyRunnable();
        Thread thread2 = new Thread(runnable1);



        //thread1.setDaemon(true);
        //thread2.setDaemon(true);

        thread1.start();
        //thread1.join(3000); // thread2 zacznie po 3sekundach
        thread2.start();

        //System.out.println(1/0);

        
    }
}