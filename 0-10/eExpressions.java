public class eExpressions {
    public static void main(String[] args) {
        // expression = operands & operators 
        // operands = values, variables, nubers, quantity
        // operators = + - * / %

        //int friends = 10;
        //friends = friends + 1;
        //friends = friends - 1;
        //friends = friends * 2;
        //friends = friends / 2;
        //friends = friends % 1;

        //friends++;
        //friends--;

        double friends = 10;
        //friends = friends / 3; // wynik = 3 ponieważ nie ma liczb po przecinku
        friends = (double)friends / 3; // wynik z przecinkiem

        System.out.println(friends);
    }
}
