/* Problem Text:

------------------------------------------
** Take an Array List of Integer Type
** Add these values 2,3,5,7,9
** Create a method Which Checks every number of that Array-List and
** Print if the number is a Prime number or, Not.
*/


package codePackage;

import java.util.ArrayList;

public class ArrayListToGetPrimeNumber {

    public static void main(String[] args) {
        /*
        ** To Declare an ArrayList
        */
        ArrayList<Integer> myArrayList = new ArrayList<>();

        /*
        ** Add Values In An Array List
        ** You Can also Do this using for loop
        */
        myArrayList.add(2);
        myArrayList.add(3);
        myArrayList.add(5);
        myArrayList.add(7);
        myArrayList.add(9);

        /*
        ** Check if a number of ArrayList is Prime or, Not
        ** Using Enhaned For Loop
        */
        for (int data : myArrayList) {
            if (isAPrimeNumber(data)) 
            {
                System.out.println(data + " is A Prime Number");
            } 
            else 
            {
                System.out.println(data + " is not A Prime Number");
            }
        }

    }

    private static boolean isAPrimeNumber(int number) {
        if (number <= 1) {
            return false;
        }
        for (int k = 2; k <= Math.sqrt(number); ++k) {
            if (number % k == 0) {
                return false;
            }
        }
        return true;
    }
}
