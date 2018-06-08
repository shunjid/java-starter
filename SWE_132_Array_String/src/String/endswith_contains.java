package String;

import java.util.Scanner;

public class endswith_contains {

    public static void main(String[] args) {

        Scanner myscanner = new Scanner(System.in);
        System.out.println("Enter array limit");
        int limit = myscanner.nextInt();
        int count = 0;

        // integer type array
        String array[] = new String[limit];
        for (int i = 0; i < array.length; i++) {
            System.out.println("Enter the value into array position " + (++count));
            array[i] = myscanner.next();
        }

        // printing array
        System.out.println("\nPrinting array\n");
        for (int j = 0; j < array.length; j++) {
            if (array[j].endsWith("tion")) {
                System.out.println(array[j]);
            } else if (array[j].contains("ab")) {
                System.out.println(array[j]);
            } else {
                System.out.println("Condition not matched");
            }
        }
    }

}
