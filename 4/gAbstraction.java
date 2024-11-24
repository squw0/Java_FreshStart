public class gAbstraction {
      public static void main(String[] args) {
        
        // abstract = abstract classes cannot be instantiated but they can have a subclass
        //              abstract methods are declared without an implementation

        Car car = new Car(null);
        //Vehicle vehicle = new Vehicle();
        car.go();
      }
}
