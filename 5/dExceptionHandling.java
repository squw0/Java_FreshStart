import java.util.InputMismatchException;
import java.util.Scanner;

public class dExceptionHandling {
    public static void main(String[] args) {
        
        // exeptions = and event that occurs during the execution of a program that
        //              disrupts the normal flow of instructions

        Scanner scanner = new Scanner(System.in);
        
        try {

            System.out.println("Enter a whole number to divide: ");
            int x = scanner.nextInt();

            System.out.println("Enter a whole number to divide: ");
            int y = scanner.nextInt();

            int z = x/y;

            System.out.println("Result: "+z);
        }
        catch(ArithmeticException e){
            System.out.println("You can't divide by 0");
        }
        catch(InputMismatchException e){
            System.out.println("You didn't enter a number");
        }
        catch(Exception e){
            System.out.println("Something went wrong");
        }
        finally {
            System.out.println("This will always print");
            scanner.close();
        }
    }
}
