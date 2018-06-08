package swe_132_java_file;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class File_Input_Output_2 {

    public static void main(String[] args) {

        Scanner myscanner = new Scanner(System.in);
        System.out.println("Enter the total profit of the project");
        int profit = myscanner.nextInt();

        try {
            File file = new File("Profit.txt");
            try (FileWriter fw = new FileWriter(file)) {
                fw.write("\r\n" + profit);
            }
            System.out.println("File created successfully");

        } catch (IOException e) {

            System.out.println("File not found");
        }

        try {
            File file = new File("Profit.txt");
            Scanner sc = new Scanner(file);
            String str = null;
            while (sc.hasNextLine()) {
                str = sc.nextLine();
                System.out.println(str);

            }
            int p = Integer.parseInt(str);
            if (p < 5000) {
                System.out.println("Good profit");
            } else {
                System.out.println("Not good way");
            }
        } catch (FileNotFoundException | NumberFormatException e) {

            System.out.println("File did not read successfully");
        }

    }

}
