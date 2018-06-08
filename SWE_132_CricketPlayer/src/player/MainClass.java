package player;

import java.util.Scanner;
import java.text.DecimalFormat;

public class MainClass {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        DecimalFormat dec = new DecimalFormat("#0.00");
        Scanner sc = new Scanner(System.in);
        System.out.println("Name , Age , Number Of Matches :");
        String Name = sc.next();
        int Age = sc.nextInt();
        int numberOfMatches = sc.nextInt();
        Player p1 = new Player(Name, Age);
        p1.setPrizeMoney(numberOfMatches);
        p1.displayInfo();
        System.out.println("Prize Money : $" + p1.getPrizeMoney());
        System.out.println("Bonus       : $" + p1.bonus(numberOfMatches));
        System.out.println("Total       : $" + dec.format(p1.getPrizeMoney() + p1.bonus(numberOfMatches)));
        
    }

}
