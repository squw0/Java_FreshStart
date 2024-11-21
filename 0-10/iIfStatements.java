import java.util.Scanner;

public class iIfStatements {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your age: ");
        int age = scanner.nextInt();
        scanner.close();

        if(age>60){
            System.out.println("You are super old.");
        }
        else if(age>=18 && age <= 60){
            System.out.println("You are an adult.");
        }
        else if(age>=13) {
            System.out.println("You are a teenager.");
        }
        else{
            System.out.println("You are a baby.");
        }
    }
}
