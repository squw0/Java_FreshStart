import java.util.Scanner;

public class A {
    public static void main(String[] args) {
        int a;
        int b;
        String operacja;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj liczbe A:");
        a = scanner.nextInt();

        System.out.println("Podaj liczbe B:");
        b = scanner.nextInt();

        System.out.println("Jaką operację chcesz wykonać (+/-)");
        operacja = scanner.next();

        if (null == operacja){
            System.out.println("Nieznana operacja");
            return;
        }
        else switch (operacja) {
            case "+":
                Sum sum = new Sum();
                System.out.println("A + B = " + sum.sum(a, b));
                break;
            case "-":
                Sub sub = new Sub();
                System.out.println("A - B = " + sub.sub(a, b));
                break;
            default:
                System.out.println("Nieznana operacja");
                break;
        }
        
    }
}

class Sum {
    public int sum(int a, int b) {
        return a + b;
    }
}

class Sub {
    public int sub(int a, int b){
        return a - b;
    }
}

