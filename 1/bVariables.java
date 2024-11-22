/*
       * boolean | 1bit   | primitive | true or false
       * byte    | 1byte  | primitive | -128 to 127
       * short   | 2bytes | primitive | -32768 to 32767
       * int     | 4bytes | primitive | -2bilion to 2bilion
       * long    | 8bytes | primitive | more than int
       * 
       * float   | 4bytes | primitive | up to 6-7 digits
       * double  | 8bytes | primitive | up to 15 digits
       * 
       * char    | 2bytes | primitive | one character
       * String  | varies | reference | sequence of characters
       */

public class bVariables {
   public static void main(String[] args) {
      
      //int x; // declaration
      //x = 123; // assignment
      int x = 123; // initialization
      System.out.println(x);
      System.out.println("My number is: " + x);

      byte t = 100;
      long y = 123456789L; // L at the end

      float z = 3.14f; // f at the end
      double g = 3.14;

      boolean k = true;
      char symbol = '@';
      System.out.println(symbol);
      String name = "Adam";
      System.out.println("Hello " + name);
 }   
}