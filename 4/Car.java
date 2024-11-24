public class Car extends Vehicle{
    
    int wheels = 4;
    int doors = 4;
    String name;

    Car(String name){
        this.name = name;
    }

    void goo(){
        System.out.println("The driver is driving the car");
    }
}
