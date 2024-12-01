public class basic {
    public static void main(String[] args) {
        
        Thread one = new Thread(new ThreadOne());
        Thread two = new Thread(new ThreadTwo());
        Thread three = new Thread(() -> {
            try {
                for(int i = 0; i<20; i++){
                    System.out.println("Thread three: "+i);
                    Thread.sleep(1000);
                }
            } catch (Exception e) {}
        });

        one.start();
        two.start();
        three.start();
    }
}

class ThreadOne implements Runnable{

    @Override
    public void run(){
        try {
        for(int i = 0; i<20; i++){
            System.out.println("Thread one: "+i);
            Thread.sleep(1000);
        }
        } catch (Exception e) {}
    }
}

class ThreadTwo implements Runnable{

    @Override
    public void run(){
        try{
        for(int i = 0; i < 15; i++){
            System.out.println("Thread two: "+i);
            Thread.sleep(1000);
        }
        } catch (Exception e) {}
    }
}