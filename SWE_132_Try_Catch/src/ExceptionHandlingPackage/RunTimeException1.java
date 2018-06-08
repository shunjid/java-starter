package ExceptionHandlingPackage;
import java.util.InputMismatchException;
import java.util.Scanner;

        public class RunTimeException1 {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int userInput = 0,allSum = 0;
        try {
            System.out.println("Give A Integer Number : ");
            userInput = sc.nextInt();
            while (userInput < 100) {
                System.out.println(100 + " Divided By " + userInput + " Is :" + (100 / userInput));
                System.out.println("Enter Points : ");
                String num2 = sc.next();
                allSum += Integer.parseInt(num2);
                System.out.println("Give Another Integer Number : ");
                userInput = sc.nextInt();
            }
        } catch (NumberFormatException | InputMismatchException | ArithmeticException e) {
            System.out.println();
            System.out.println(e.toString());
        } finally {
            System.out.println("\n\nTotal Point Was : " + allSum);
            System.out.println("Came Out of try-catch BLOCK\n");
        }}}

//INPUT MISMATCH EXCEPTION
/*
Give A Integer Number : 
3
100 Divided By 3 Is :33
Enter Points : 
10
Give Another Integer Number : 
5
100 Divided By 5 Is :20
Enter Points : 
20
Give Another Integer Number : 
a

java.util.InputMismatchException


Total Point Was : 30
Came Out of try-catch BLOCK
 */
//ARITHMETIC EXCEPTION
/*
Give A Integer Number : 
10
100 Divided By 10 Is :10
Enter Points : 
5
Give Another Integer Number : 
20
100 Divided By 20 Is :5
Enter Points : 
10
Give Another Integer Number : 
0

java.lang.ArithmeticException: / by zero


Total Point Was : 15
Came Out of try-catch BLOCK
 */
//NUMBER FORMAT EXCEPTION
/*
Give A Integer Number : 
5
100 Divided By 5 Is :20
Enter Points : 
10
Give Another Integer Number : 
3
100 Divided By 3 Is :33
Enter Points : 
20
Give Another Integer Number : 
6
100 Divided By 6 Is :16
Enter Points : 
a

java.lang.NumberFormatException: For input string: "a"


Total Point Was : 30
Came Out of try-catch BLOCK
*/
