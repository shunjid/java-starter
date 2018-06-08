package nestedForLoop;

import java.util.Scanner;

public class TrianglePyramid2 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Number Of Rows? :");
        int n = in.nextInt();
        for (int i = 1; i <= n; ++i) {
            int j = i - 1;
            while (j != 0) {
                System.out.print(" ");
                j--;
            }

            for (int k = 1; k <= (2 * (n - i) + 1); k++) {
                System.out.print("*");
            }
            System.out.println();
        }

        in.close();
    }
}
