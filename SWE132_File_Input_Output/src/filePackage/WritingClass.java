package filePackage;
import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class WritingClass 
{

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		try
		{
			File file = new File("DataFile.txt");
			FileWriter fw = new FileWriter(file);
            System.out.println("Name : ");
            String name = input.next();
            System.out.println("Id :");
            String id = input.next();
            fw.write(name+"\r\n"+id+"\r\n");
            
            fw.write("Java "+80);
            fw.write("\r\nAlgo "+85);
            fw.write("\r\nDB   "+90);
            
            fw.close();
            input.close();
		} 
		catch (Exception e)
		{
			System.out.println(e.toString());
		}
	}

}
