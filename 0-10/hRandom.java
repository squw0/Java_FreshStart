import java.util.Random;
import java.util.Scanner;

public class hRandom {
    public static void main(String[] args) {
        
        Random random = new Random();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj range: ");
        int range = scanner.nextInt();

        int x = random.nextInt(range); // random number between 0-5
        System.out.println("range wynosi: " + range + " oraz twoja random liczba to: "+x);
        //double y = random.nextDouble();
        //boolean z = random.nextBoolean();

        //System.out.println(x);
    }
}