package switch_case;

import java.util.Scanner;

public class switch_case_1 {

    public static void main(String[] args) {

        Scanner myscanner = new Scanner(System.in);
        int totalbill = 0;
        System.out.println("1. Burger\n2. Pizza\n3. Roll\n4. Chips");
        System.out.println("How many items do you need? ");
        int limit = myscanner.nextInt();
        for (int i = 0; i < limit; i++) {
            System.out.println("\nEnter the menu number");
            int menuNumber = myscanner.nextInt();
            switch (menuNumber) {
                case 1:
                    System.out.println("How many burger do you need? ");
                    int amountOfBurger = myscanner.nextInt();
                    totalbill += (40 * amountOfBurger);
                    break;

                case 2:
                    System.out.println("How many pizza do you need? ");
                    int amountOfPizza = myscanner.nextInt();
                    totalbill += (90 * amountOfPizza);
                    break;

                case 3:
                    System.out.println("How many roll do you need? ");
                    int amountOfRoll = myscanner.nextInt();
                    totalbill += (35 * amountOfRoll);
                    break;

                case 4:
                    System.out.println("How many chips do you need?");
                    int amountOfChips = myscanner.nextInt();
                    totalbill += (10 * amountOfChips);
                    break;
            }
        }

        System.out.println("Total bill is " + totalbill);
    }
}
