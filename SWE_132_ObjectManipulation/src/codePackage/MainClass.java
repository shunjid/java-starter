package codePackage;

public class MainClass
{
    public static void main(String[] args) {
         ObjectTester obj1 = new ObjectTester(80, 10);
         System.out.println("Sum : "+obj1.showSummation());
         
         obj1 = obj1.inTest();
         System.out.println("Sum : "+obj1.showSummation());
         
         obj1 = obj1.moreInTest();
         System.out.println("Sum : "+obj1.showSummation());
    }
           
}


/*
Sum : 74
Sum : 4
Sum : 24
*/