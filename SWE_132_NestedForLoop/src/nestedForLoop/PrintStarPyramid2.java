package nestedForLoop;

import java.util.Scanner;

public class PrintStarPyramid2 {

    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Number Of Rows? :");
        int n = input.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= 2 * (n - i); j++) {
                System.out.print(" ");
            }

            for (int k = 1; k <= i; ++k) {
                System.out.print("*" + " ");
            }
            System.out.println();
        }
    }
}
