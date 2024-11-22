public class bJavaMethods {

    //  method = a block of code that is executed whenever it is called upon

    // public static void main(String[] args) {

    

    //     String name = "Adam";
    //     int age = 21;
    //     hello(name,age);

    // }

    // static void hello(String name, int age){
    //     System.out.println("Hello " + name + " you are " + age);
    // }

    public static void main(String[] args) {
        
        int x = 3;
        int y = 4;

        //int z = add(x,y);
        //System.out.println(z);

        System.out.println(add(x,y));

    }

    static int add(int x, int y) {
        
        //int z = x + y;
        return x + y;

    }
}