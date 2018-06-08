package LOOP;

public class Enhanced_for_loop {

    public static void main(String[] args) {

        int array[] = {3, 5, 7, 2, 9, 6, 1, 34, 56, 90};
        int total = 0;

        for (int x : array) {
            System.out.print(x + " ");
            total += x;
        }
        System.out.println("\nSummation of the array is " + total);
    }

}
