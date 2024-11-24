import java.util.Scanner;

public class cDynamicPolymorphism {
    public static void main(String[] args) {
        
        // polimorphism = many shapes/forms
        // dynamic = agter comilation (durin runtime)
        // ex. A corvette is a: corvette, and a car. and a vehicle, and an object

        Scanner scanner = new Scanner(System.in);
        Animal animal;

        System.out.println("What animal do you want?");
        System.out.print("(1=Dog) or (2=Cat): ");
        int choice = scanner.nextInt();

        if(choice==1){
            animal = new Dog();
            animal.speak();
        }
        else if (choice==2){
            animal = new Cat();
            animal.speak();
        }
        else{
            animal = new Animal();
            System.out.println("That choice was invalid");
            animal.speak();
        }

        
    }
}
