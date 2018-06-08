package codePackage;

import java.util.Scanner;

public class OneDimensionalArray_BinarySearch {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] myArray;
        System.out.println("Array Size :");
        int myArraySize = sc.nextInt();
        myArray = new int[myArraySize];
        System.out.println("Enter Values :");
        for (int i = 0; i < myArraySize; ++i) {
            myArray[i] = sc.nextInt();
        }

        System.out.println("Data to Search :");
        int searchData = sc.nextInt();
        searchInArray(myArray, searchData);
    }

    private static void searchInArray(int[] arr, int searchData) {
        int minimum = 0;
        int maximum = arr.length - 1;
        int mid = (minimum + maximum) / 2;
        int location = -1;
        while (minimum <= maximum) {
            if (searchData == arr[mid]) {
                location = mid + 1;
                System.out.println("\n\nThe index number of searching number is:" + mid);
                break;
            } else {
                if (searchData > arr[mid]) {
                    minimum = mid + 1;
                    mid = (minimum + maximum) / 2;

                } else {
                    maximum = mid - 1;
                    mid = (minimum + maximum) / 2;
                }
            }
        }
        if (location == -1) {
            System.out.println("\n\nData Not Found !!!!!!!!!!");
        }

    }

}
