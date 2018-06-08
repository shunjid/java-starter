package swe_132_condition;

public class Break {

    public static void main(String[] args) {

        for (int i = 0; i < 30; i++) {
            System.out.println(i);
            if (i == 20) {
                break; // this will break the loop and come out from the for loop
            }
        }
        System.out.println("i has been printed 20 times");
    }

}
