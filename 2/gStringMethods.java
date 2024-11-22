public class gStringMethods {
    public static void main(String[] args) {
        
        // String = a reference data type that can store one or more characters
        //          reference data types have access to useful methods

        String name = "Adam";

        //boolean result = name.equals("Adam"); // true or false

        //boolean result = name.equalsIgnoreCase("Adam"); // can type adam or Adam

        //int result = name.length(); // length of name

        //char result = name.charAt(0); // character 0 in name

        //int result = name.indexOf("d"); // possition of d in name

        //boolean result = name.isEmpty(); // is name empty true or false

        //String result = name.toUpperCase(); // name is uppercased
        //String result = name.toLowerCase(); // name is lowercased

        //String result = name.trim(); // if name = "   Adam  " it would delete spaces
        
        String result = name.replace('m', 's'); // replace m with s

        System.out.println(result);
    }
}
