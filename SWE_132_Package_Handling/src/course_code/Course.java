package course_code;

import java.util.Scanner;

public class Course {

    public String java_course_code;

    public Course() {

    }
    Scanner myscanner = new Scanner(System.in);

    public void getCourse() {
        java_course_code = myscanner.next();
    }
}
