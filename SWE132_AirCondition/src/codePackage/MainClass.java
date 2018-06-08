package codePackage;

import java.util.Scanner;

public class MainClass 
{
    public static void main(String[] args) {
		Scanner myScanner = new Scanner(System.in);
		System.out.println("Weather Type? :");
		String Weather = myScanner.next();
		
		AirCondition room1= new AirCondition();
		room1.AssignValue(Weather);
		System.out.println("Temperature :"+room1.getValue());
		
	}
}
