package filePackage;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/*Output
 *
 * Moin Ali
   171-35-1111
   Average Is :85
 */
public class ReadingClass {
    
    private static boolean isNumeric(String str) {
        return str.matches("-?\\d+(\\.\\d+)?");
    }

    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);
        String num = "";
        boolean isNoNumeric = true;
        int sum = 0, counter = 0;
        try 
        {
            File file = new File("DataFile.txt");
            Scanner fscanf = new Scanner(file);

            while (fscanf.hasNextLine()) {
                num = fscanf.nextLine();

                String[] parts = num.trim().split(" ");

                if (parts.length == 1) {
                    System.out.println(num);
                } 
                else {
                    for (int i = 0; i < parts.length; ++i) {
                        if (isNumeric(parts[i])) {
                            sum += Integer.parseInt(parts[i]);
                            ++counter;
                            isNoNumeric = false;
                        }
                    }
                }

                if (isNoNumeric == true && parts.length > 1) {
                    System.out.println(num);
                    isNoNumeric = true;
                }
            }

            System.out.println("Average Is :" + sum / counter);

        } 
        catch (FileNotFoundException | NumberFormatException e) {
            System.out.println(e.toString());
        }
    }
}
