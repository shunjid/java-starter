package codePackage;

import java.util.Scanner;

public class MainClass {

    public static void main(String[] args) {

        Scanner myScanner = new Scanner(System.in);
        System.out.println("Family head name");
        String name = myScanner.nextLine();
        System.out.println("Enter monthly income");
        double Mincome = myScanner.nextDouble();

        FamilyClass obj = new FamilyClass(name, Mincome);

        System.out.println("Enter the unit of electricity");
        int eunit = myScanner.nextInt();
        System.out.println("Enter the unit of water");
        int wunit = myScanner.nextInt();
        System.out.println("Enter the total number of family members");
        int fmember = myScanner.nextInt();

        obj.TotalMonthlyCost(eunit, wunit, fmember);
        System.out.println("Monthly Savings is " + obj.MonthlySavings());

    }
}
