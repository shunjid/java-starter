package Basic;
// importing scanner 

import java.util.Scanner;

public class Value_Initialize_By_Scanner {

    public static void main(String[] args) {
        // making scanner type object
        Scanner myscanner = new Scanner(System.in);

        System.out.println("\n\nPlease enter your name");
        String name = myscanner.nextLine();
        System.out.println("Please enter your age");
        int age = myscanner.nextInt();
        System.out.println("Please enter your id");
        String id = myscanner.next();
        System.out.println("Please enter your SGPA");
        float semesterGPA = myscanner.nextFloat();
        System.out.println("Please enter your CGPA");
        double cgpa = myscanner.nextDouble();
    }

}
