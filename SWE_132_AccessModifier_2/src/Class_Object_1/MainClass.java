package Class_Object_1;

import java.util.Scanner;

public class MainClass {

    public static void main(String[] args) {

        Scanner myScanner = new Scanner(System.in);
        System.out.println("Enter flavour name");
        String flavour = myScanner.next();
        System.out.println("How many icecream do you want?");
        int amount = myScanner.nextInt();
        Ice_Cream obj = new Ice_Cream();
        obj.calculatebill(flavour.toLowerCase());
        System.out.println("Cost of one " + flavour + " flavour is " + obj.flavourCost);
        obj.TotalCost(amount);
    }
}
