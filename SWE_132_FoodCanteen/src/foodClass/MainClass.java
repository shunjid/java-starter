package foodClass;

import java.util.Scanner;

public class MainClass {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        CanteenClass c1 = new CanteenClass("101", "Burger", 20, 100.0, 150.0);

        while (c1.Quantity != 0) {
            System.out.println("Quantity ? :");
            int item = sc.nextInt();

            if (item > c1.Quantity) {
                System.out.println("Can't Sell , Because " + c1.Quantity + " Item Remaining !!!");
            } else {
                System.out.println("Bill Is : " + c1.bill(item));
            }
        }
        System.out.println("Profit Is : " + c1.profit());

    }

}
