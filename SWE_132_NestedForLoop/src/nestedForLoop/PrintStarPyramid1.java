package nestedForLoop;

import java.util.Scanner;

public class PrintStarPyramid1 {

    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Number Of Rows? :");
        int n = input.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*" + " ");
            }
            System.out.println();
        }
    }
}
