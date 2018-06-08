package String;

import java.util.Scanner;

public class Undefined_String_Array {

    public static void main(String[] args) {

        Scanner myscanner = new Scanner(System.in);
        System.out.println("Enter array limit");
        int limit = myscanner.nextInt();

        // integer type array
        String array[] = new String[limit];
        for (int i = 0; i < array.length; i++) {
            System.out.println("Enter the value into array index " + i);
            array[i] = myscanner.next();
        }
        System.out.println("\n\nArray values are \n");

        for (String x : array) {
            System.out.println(x + " ");
        }

    }
}
