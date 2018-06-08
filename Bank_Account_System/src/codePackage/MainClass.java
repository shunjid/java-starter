package codePackage;

import java.util.Scanner;

public class MainClass 
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
       
        System.out.println("Your Name         : ");
        String Name = sc.next();
        System.out.println("Your Address      : ");
        String Address = sc.next();
        System.out.println("Your NID          : ");
        String NationalID = sc.next();
        System.out.println("Bank Account ID   : ");
        String BankAccountID = sc.next();
        System.out.println("Initial Amount    : ");
        Double initialAmount = sc.nextDouble();
        
        /*
        ** Creating Object Of Account Class
        ** And Passing Values Through Constructor For That Specific Object
        */
        Account account1=new Account(Name, Address, NationalID, BankAccountID, initialAmount);
        account1.displayInfo();
        
        System.out.println("\n----------------------------\n");
        
        System.out.println("Amount to Deposit  :");
        Double amountToDeposit = sc.nextDouble();
        account1.depositeAmountInBalance(amountToDeposit);
        account1.displayInfo();
        
        System.out.println("\n----------------------------\n");
        
        System.out.println("Amount to WithDraw :");
        Double amountToWithDraw = sc.nextDouble();
        account1.withDrawAmountFromBalance(amountToWithDraw);
        account1.displayInfo();
        
        System.out.println("\n----------------------------\n");
    }
    
}
