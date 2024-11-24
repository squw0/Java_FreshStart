public class bPolymorphism {
    public static void main(String[] args) {

    // polimorphism = greek word for poly-"many", morph-"form"
    // the ability of an object to identyfy as more than one type

    Car car = new Car();
    Bicycle bicycle = new Bicycle();
    Boat boat = new Boat();

    Vehicle[] racers = {car,bicycle,boat};

    //car.go();
    //bicycle.go();
    //boat.go();

    for (Vehicle x : racers) {
        x.go();
    }
    }
}
