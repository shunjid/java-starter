package student;

import course_code.Course;  // importing course package to get the data from the other package
import java.util.Scanner;

public class Student {

    public static void main(String[] args) {

        Scanner myscanner = new Scanner(System.in);
        System.out.println("Enter student name");
        String name = myscanner.nextLine();
        System.out.println("Enter java course code ");
        // creating object of Course class of course package
        Course obj = new Course();
        // calling getCourse() method by Course object.
        obj.getCourse();

        System.out.println("\n\n");
        // printing data
        System.out.println("Student name is " + name);
        System.out.println("Course code is " + obj.java_course_code);

    }

}
