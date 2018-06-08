package Class_Object_2;

import java.util.Scanner;

public class MainClass {

    public static void main(String[] args) {

        Scanner myScanner = new Scanner(System.in);
        System.out.println("Enter car manufacturer name");
        String manuName = myScanner.next();
        myScanner.nextLine();
        System.out.println("Enter car owner name");
        String ownerName = myScanner.nextLine();
        System.out.println("Enter price of the car");
        int price = myScanner.nextInt();

        Car obj = new Car(manuName, ownerName, price);

        System.out.println("Car name is " + obj.carName);
        System.out.println("Car owner name is " + obj.ownerName);
        System.out.println("Price of the car is " + obj.price);
        // private access modifier can only used in the same class. to get the value of 
        // private access modifier a method is made which returns the value of the private 
        // access modifier.
        //System.out.println("Car code is "+obj.carCode);

        System.out.println("Car code is " + obj.getCarCode());

        myScanner.close();
    }
}
