package swe_132_java_file;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class File_Input_Output_1 {

    public static void main(String[] args) {

        // writing in the file
        Scanner myscanner = new Scanner(System.in);
        // making File type object to create a new file. this file will be store in the project folder
        File file = new File("output.txt");
        FileWriter fw;  // creating FileWriter type object to write in the file
        String name, id, firstsubject = null, secondsubject = null, thirdsubject = null; // initializing variable.
        try {
            fw = new FileWriter(file);
            System.out.print("Enter name : ");
            name = myscanner.next();
            System.out.print("Enter id : ");
            id = myscanner.next();
            System.out.print("Number of first subject : ");
            myscanner.nextLine();
            firstsubject = myscanner.nextLine();
            System.out.print("Number of second subject : ");
            secondsubject = myscanner.nextLine();
            System.out.print("Number of third subject : ");
            thirdsubject = myscanner.nextLine();
            fw.write(name + "\r\n" + id + "\r\n" + firstsubject + "\r\n" + secondsubject + "\r\n" + thirdsubject);  // \r is used for storing data in the file in a new line
            fw.close();
        } catch (IOException e) {

            System.err.println("Something went wrong!!");
        }

        // reading from the file
        double sum;
        sum = +(Double.parseDouble(firstsubject) + Double.parseDouble(secondsubject) + Double.parseDouble(thirdsubject));
        System.out.println("\n\n");

        try {
            File readfile = new File("output.txt");
            Scanner sc = new Scanner(readfile);  // making scanner type object to get data from the file

            while (sc.hasNext()) {
                System.out.println("Name is : " + sc.nextLine());
                System.out.println("ID is : " + sc.nextLine());
                System.out.println("First subject is : " + sc.nextLine());
                System.out.println("Second subject is : " + sc.nextLine());
                System.out.println("Third subject is : " + sc.nextLine());
            }

        } catch (IOException e) {

            System.err.println("Something went wrong");

        }
        System.out.println("Average is : " + (sum / 3));

    }

}
