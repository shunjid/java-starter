package String;

import java.util.Arrays;

public class String_Compare {

    public static void main(String[] args) {

        String array1[] = {"a", "b", "c", "d"};
        String array2[] = {"a", "b", "c", "d"};

        // method 1 (right)
        if (Arrays.equals(array1, array2)) {
            System.out.println("Both string are mathced");
        } else {
            System.out.println("String not matched");
        }

        // mehtod 2 (error)
        if (array1 == array2) {
            System.out.println("Both string are matched");
        } else {
            System.out.println("String not matched");
        }
        /**
         * In Java, arrays are first class objects. In the above program, array1
         * and array2 are two references to two different objects. So when we
         * compare array1 and array2, two reference variables are compared,
         * therefore we get the output as “String not matched”
         */
    }

}
