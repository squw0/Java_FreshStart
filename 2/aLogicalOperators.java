import java.util.Scanner;

public class aLogicalOperators {
    public static void main(String[] args) {
        
        // && = (and) - both conditions must be true
        // || = (or) - either condition must be true
        // !  = (not) - reverses boolean value of condition


        // int temp = 15;
        // if(temp > 30) {
        //     System.out.println("It is hot outside");
        // }
        // else if(temp >=20 && temp <= 30){
        //     System.out.println("It is warm outside");
        // }
        // else {
        //     System.out.println("It is cold outside");
        // }


        // Scanner scanner = new Scanner(System.in);
        // System.out.println("Press q or Q to quit.");
        // String response = scanner.next();
        // if (response.equals("q" ) || response.equals("Q")) {
        //     System.out.println("You quit the game");
        // }
        // else{
        //     System.out.println("You didnt quit");
        // }
        
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Press q or Q to quit.");
        String response = scanner.next();
        if (!response.equals("q" ) && !response.equals("Q")) {
            System.out.println("You didnt quit");
        }
        else{
            System.out.println("You quit the game");
        }
    }
}
