package codePackage;

public class FamilyClass {

    String Hname;
    double monthlyIncome;
    double monthlyCost;

    FamilyClass(String Hname, double monthlyIncome) {
        this.Hname = Hname;
        this.monthlyIncome = monthlyIncome;
    }

    public void TotalMonthlyCost(double Eunit, double Wunit, int familyMember) {
        double tempECost = ElectricityBill(Eunit);                   //Electricty Bill
        double tempWCost = Wunit * 3 + (VatCalculation(Wunit));      //Water Bill 3 Taka Per Unit + Vat
        final double gasBill = 800.00;                               //Gas Bill
        double tempMarketingCost = MarketCost(familyMember);         //Marketing Cost
        monthlyCost = (tempECost + tempWCost + gasBill + tempMarketingCost);
        printinfo(tempECost, tempWCost, gasBill, tempMarketingCost);
    }

    public double ElectricityBill(double unit) {
        double tempBill;
        if (unit <= 150) {
            tempBill = unit * 4.50;
        } else if (unit > 150 && unit <= 300) {
            tempBill = unit * 5.50;
        } else {
            tempBill = unit * 7.50;
        }

        tempBill += VatCalculation(tempBill);
        return tempBill;
    }

    public double VatCalculation(double tempBill) {
        if (tempBill <= 500) {
            return tempBill * .15;
        } else {
            return tempBill * .20;
        }
    }

    public double MarketCost(int familyMember) {
        return familyMember * 2500;
    }

    public void printinfo(double ecost, double wcost, double gcost, double mcost) {
        System.out.println("Electricity Cost is " + ecost);
        System.out.println("Water Cost is " + wcost);
        System.out.println("Gas BIll is " + gcost);
        System.out.println("Marketing Cost is " + mcost);
        System.out.println("Total Cost of the month is " + monthlyCost);
    }

    public double MonthlySavings() {
        return monthlyIncome - monthlyCost;
    }

}
