package codePackage;
        
import java.util.Scanner;

public class MainClass {

    public static void main(String[] args) {
        Scanner scanf = new Scanner(System.in);

        System.out.println("Your Name                     :");
        String name = scanf.next();
        System.out.println("Going From                    :");
        String from = scanf.next();
        System.out.println("Going To                      :");
        String to = scanf.next();

        System.out.println("Distance     (In Meter)       :");
        Double distance = scanf.nextDouble();
        System.out.println("Train Acceleration (In m/s^2) :");
        Double acceleration = scanf.nextDouble();
        //Creating Object
        Journey passenger1 = new Journey(name, from, to, distance, acceleration);
        passenger1.DisplayInfo();
    }
}

        //  ------------- Input -------------
        /*
        Your Name                     :ABC
        Going From                    :Dhaka
        Going To                      :Gazipur
        Distance     (In Meter)       :36500
        Train Acceleration (In m/s^2) :0.0022
        */
        
        
        //  ------------- Output -------------
        /*
        --------Info-----------

        Passenger      :       ABC
        From           :       Dhaka
        To             :       Gazipur
        Distance       :       36.5 KiloMeter
        Time to Travel :       96.00610249964174 Minutes

        --------Thanks-----------
         */
