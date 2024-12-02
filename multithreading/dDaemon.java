public class dDaemon {
    public static void main(String[] args) {
        
    }
}

class DaemonHelper implements Runnable{

    @Override
    public void run(){
        int count = 0;
        while(count < 500){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
            }
            count++;
            System.out.println("Daemon helper running");
        }
    }
}

class UserThreadHelper implements Runnable{
    @Override
    public void run(){
        
    }
}