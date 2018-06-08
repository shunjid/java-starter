package ExceptionHandlingPackage;

public class ArrayException1 {

    public static void main(String[] args) {
        int[][] twoDimensionalArray = new int[2][2];

        twoDimensionalArray[0][0] = 5;
        twoDimensionalArray[0][1] = 6;
        twoDimensionalArray[1][0] = 7;
        twoDimensionalArray[1][1] = 8;

        try {
            System.out.println("Values Of 2D array :\n");
            for (int i = 0; i < 2; i++) {
                for (int j = 0; j < 7; j++) {
                    System.out.print(twoDimensionalArray[i][j] + "  ");
                }
                System.out.println();
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("\n\n" + e.toString());
            System.out.println("\n");
        }

    }

}
