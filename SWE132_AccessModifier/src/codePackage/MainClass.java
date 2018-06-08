package codePackage;

public class MainClass 
{
    public static void main(String[] args) 
    {
        CGPA_Calculator student1 = new CGPA_Calculator();
        student1.setSWE132Marks(80.0);
        student1.setSWE211Marks(82.0);
        student1.setSWE213Marks(85.0);
        CGPA_Calculator.setDepartmentName("Software Engineering");
        
        System.out.println("Department Name   :"+CGPA_Calculator.DepartmentName);
        System.out.println("CGPA              :"+student1.getCGPA()+"\n\n");
    }
    
}
