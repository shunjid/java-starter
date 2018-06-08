package codePackage;

import java.util.Scanner;

/*

Input Should Be Number of Row = Number Of Column


** Expected Output:

The diagonal of Array[3][3] is:
1
     5
          9

*/

public class TwoDimensionalArray_DiagonalPrint {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int array[][] = new int[5][5];
        /*initialize the size of the 2D array*/
        int i, j;

        /*For getting a diagonal the 2D aarray must be Square Matrix*/
        System.out.println("How many rows you want:");
        int r = input.nextInt();
        System.out.println("How many Column you want:");
        int c = input.nextInt();

        if (r == c) {
            for (i = 0; i < r; i++) {
                for (j = 0; j < c; j++) {
                    System.out.println("Enter the values of(" + i + "," + j + ") Index: ");
                    array[i][j] = input.nextInt();
                    /*Input the values of an array*/
                }
            }

            System.out.println("The diagonal of Array[" + r + "][" + c + "] is:");

            for (i = 0; i < r; i++) {
                for (j = 0; j < c; j++) {
                    if (i == j) {
                        System.out.println(array[i][j]);
                    }
                    for (int k = 0; k <= i; k++) {
                        System.out.print(" ");
                    }
                }
            }
        } else {
            System.out.println("Please insert equal rows and columns number.");
        }
    }
}
