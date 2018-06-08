package Basic;

public class Data_Type {

    public static void main(String[] args) {

        String name = "abcdef"; // string 
        int age = 30; // int can store 16 bit
        float sgpa = 2.5f; // float can store 16 bit. here f is used after 2.5. its because in java 0.0 format is used for only double type variable 
        // so when 2.5 is written it will show and error because float can store 16 bit but 2.5 is 32 bit as this format is for double type variable

        double cgpa = 4.0; // double can store 32 bit
        char section = 'A'; // single char can store 1 bit

        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("sgpa and cgpa is: " + sgpa + " , " + cgpa);
        System.out.println("Section is " + section);
    }

}
