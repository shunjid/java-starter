package codePackage;

public class Employees {

    public int id;
    public String name;
    public String designation;
    private double salaryMonthly;

    //Constructor
    public Employees(int id, String name, String designation) {
        this.id = id;
        this.name = name;
        this.designation = designation;
    }

    //set monthly salary
    public void setSalary() {
        if (this.designation.equalsIgnoreCase("Manager")) {
            salaryMonthly = 20000.00;
        } else {
            salaryMonthly = 10000.00;
        }
    }

    //yearly salary
    public double yearlySalary() {
        return 12 * salaryMonthly;
    }

    //bonus Calculation
    public double bonus() {
        if (designation.equalsIgnoreCase("Manager")) {
            return salaryMonthly * 0.20;
        } else {
            return salaryMonthly * 0.05;
        }
    }

    //display info
    public void displayInfo() {
        System.out.println("Id : " + id + " ,Name: " + name);
        System.out.println("Salary Monthly :" + salaryMonthly);
    }
}
