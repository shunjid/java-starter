package swe_132_java_file;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class File_Input_output_3 {

    public static void main(String[] args) {

        Double sum = 0.0;
        String str;
        try {
            String id, name, java, algo, db;
            File f = new File("Exam.txt");
            try (FileWriter fw = new FileWriter(f)) {
                Scanner input = new Scanner(System.in);
                System.out.println("Enter ID:");
                id = input.nextLine();
                fw.write("\r\n" + id);
                System.out.println("Name:");
                name = input.nextLine();
                fw.write("\r\n" + name);
                System.out.println("Marks in java:");
                java = input.nextLine();
                fw.write("\r\n" + java);
                System.out.println("Marks in Algorith:");
                algo = input.nextLine();
                fw.write("\r\n" + algo);
                System.out.println("Marks in ");
                db = input.nextLine();
                fw.write("\r\n" + db);
            }

        } catch (IOException e) {
            System.out.println(".........");
        }
        try {
            int count = 0;
            File f = new File("Exam.txt");
            Scanner s1;
            s1 = new Scanner(f);
            while (s1.hasNextLine()) {
                str = s1.nextLine();
                String[] parts = str.split(" ");
                if (parts.length == 2) {
                    count++;
                    sum += Double.parseDouble(parts[1]);
                }
            }
            System.out.println("Average:" + sum / count);
        } catch (FileNotFoundException e) {
            System.out.println("File not fount");
        }
    }
}
