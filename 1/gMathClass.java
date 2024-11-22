import java.util.Scanner;

public class gMathClass {
    public static void main(String[] args) {
         
        /* 
        double x = 3.14;
        double y = -10;

        double a = Math.max(x, y); // która większa
        double b = Math.min(x, y); // która mniejsza
        double c = Math.abs(y);  // wartość bezwzględna
        double d = Math.sqrt(x); // pierwiastek
        double e = Math.round(x); // zaokrąglenie
        double f = Math.ceil(x); // zaokrąglenie w górę
        double g = Math.floor(x); // zaokrąglenie w dół

        System.out.println(z);
        */

        double x;
        double y;
        double z;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter side x: ");
        x = scanner.nextDouble();

        System.out.println("Enter side y: ");
        y = scanner.nextDouble();

        z = Math.sqrt((x*x) + (y*y));
        System.out.println("The hypotenuse is : " + z);
        scanner.close();
    }
}
