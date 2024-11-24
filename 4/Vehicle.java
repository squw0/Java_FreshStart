public abstract class Vehicle {
    
    double speed;

    abstract void goo();

    void go(){
        System.out.println("This vehicle is moving");
    }
    void stop(){
        System.out.println("This vehicle is stopped");
    }
}
