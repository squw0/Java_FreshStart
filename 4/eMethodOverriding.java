public class eMethodOverriding {
    public static void main(String[] args) {
        
        // method overriding = Declaring a method in sub class,
        //                      whis is already present in parent class.
        //                      done so that a child class can give tis own implementation

        Animal animal = new Animal();
        Dog dog = new Dog();

        dog.speak();
        animal.speak();
    }
}
