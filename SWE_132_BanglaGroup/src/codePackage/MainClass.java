package codePackage;

import java.util.Scanner;

public class MainClass {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        System.out.println("Name  , Designation , Id:");
        String name = sc.nextLine();
        String designation = sc.nextLine();
        int id = sc.nextInt();

        Employees emp1 = new Employees(id, name, designation);
        emp1.setSalary();
        emp1.displayInfo();
        System.out.println("Bonus Monthly :" + emp1.bonus());
        System.out.println("Yearly Salary:" + emp1.yearlySalary());

    }
}
