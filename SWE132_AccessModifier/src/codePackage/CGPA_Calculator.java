package codePackage;

public class CGPA_Calculator {

    static String DepartmentName;
    private Double SWE132Marks;
    private Double SWE211Marks;
    private Double SWE213Marks;
    final int SWE132Credit = 4, SWE211Credit = 4, SWE213Credit = 4;

    //static
    public static void setDepartmentName(String name) {
        CGPA_Calculator.DepartmentName = name;
    }
    
    //Setter Methods
    public void setSWE132Marks(Double SWE132Marks) {
        this.SWE132Marks = SWE132Marks;
    }

    public void setSWE211Marks(Double SWE211Marks) {
        this.SWE211Marks = SWE211Marks;
    }

    public void setSWE213Marks(Double SWE213Marks) {
        this.SWE213Marks = SWE213Marks;
    }

    public Double getCGPA() {
        return ((getGPAforEachSubject(SWE132Marks) * SWE132Credit) + (getGPAforEachSubject(SWE211Marks) * SWE211Credit)
                + (getGPAforEachSubject(SWE213Marks) * SWE213Credit)) / (SWE132Credit + SWE211Credit + SWE213Credit);
    }

    private Double getGPAforEachSubject(Double Marks) {
        if (Marks >= 80) {
            return 4.00;
        } else if (Marks >= 75 && Marks <= 79) {
            return 3.75;
        } else if (Marks >= 70 && Marks <= 74) {
            return 3.50;
        } else if (Marks >= 65 && Marks <= 69) {
            return 3.25;
        } else if (Marks >= 60 && Marks <= 64) {
            return 3.00;
        } else if (Marks >= 55 && Marks <= 59) {
            return 2.75;
        } else if (Marks >= 50 && Marks <= 54) {
            return 2.50;
        } else if (Marks >= 45 && Marks <= 49) {
            return 2.25;
        } else if (Marks >= 40 && Marks <= 44) {
            return 2.00;
        } else {
            return 0.00;
        }
    }

}
