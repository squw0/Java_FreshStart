
public class p2dArrays {
    public static void main(String[] args) {
        
        // 2d array = an array of arrays

        // String[][] cars = new String[3][3];
        // cars[0][0] = "Camaro"; // row = 0 column = 1
        // cars[0][1] = "Corvette";
        // cars[0][2] = "BMW";
        // cars[1][0] = "Mustang";
        // cars[1][1] = "Ranger";
        // cars[1][2] = "Tesla";
        // cars[2][0] = "Ferrari";
        // cars[2][1] = "Lambo";
        // cars[2][2] = "Opel";

        String[][] cars = { 
            {"Camaro","Corvette","BMW"},
            {"Mustang","Ranger","Tesla"},
            {"Ferrari","Lambo","Opel"}
        };
        

        for (int i = 0; i<=cars.length; i++) {
            System.out.println();
            for (int j = 0; j < cars[i].length; j++) {
                System.out.print(cars[i][j]+ " ");
            }
        }
    }
}