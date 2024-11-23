public class dPrintF {
    public static void main(String[] args) {
        
        // printf() = an optional method to control, format, and display text to the console window
        //            two arguments = format string + (object/variable/value)
        //            % [flags] [precision] [width] [conversion-character]


        // %d = decimal number
        //System.out.printf("This is a format string %d", 123); // This is a format string 123
        //System.out.printf("%d This is a format string ", 123); // 123 This is a format string 

        
        boolean myBoolean = true;
        char myChar = '@';
        String myString = "Adam";
        int myInt = 50;
        double myDouble = 1000; 

        // [conversion-character]
        //System.out.printf("%b", myBoolean); // %b = boolean
        //System.out.printf("%c", myChar); // %c = character
        //System.out.printf("%s", myString); // %s = string
        //System.out.printf("%d", myInt); // %d = decimal
        //System.out.printf("%f", myDouble); // %f = double/float

        // [width]
        // minimum number of characters to be written as output
        //System.out.printf("Hello %10s",myString); // Hello       Adam{6 spaces + Adam = 10 = width}
        //System.out.printf("Hello %-10s",myString); // Hello Adam      {Adam + 6spaces = 10 = width}

        // [precision]
        // sets number of digits of precision when outputting floating-point values
        //System.out.printf("You have this much money %f", myDouble); // You have this much money 1000,000000
        //System.out.printf("You have this much money %.2f", myDouble); // You have this much money 1000,00

        // [flags]
        // adds an effect to output based on the flag added to format specifier
        // - : left-justify
        // + : output a plus ( + ) or minus ( - ) sign for a numeric value
        // 0 : numeric values are zero-padded
        // , : comma grouping separator if numbers > 1000

        //System.out.printf("You have this much money %20f", myDouble); // You have this much money          1000,000000
        //System.out.printf("You have this much money %+f", myDouble); // You have this much money +1000,000000
        //System.out.printf("You have this much money %020f", myDouble); // You have this much money 0000000001000,000000
        //System.out.printf("You have this much money %,f", myDouble); // You have this much money 1 000,000000
    }
}
