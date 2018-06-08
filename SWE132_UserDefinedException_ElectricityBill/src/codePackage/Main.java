package codePackage;

public class Main {

    public static void main(String[] args) {

        try {
            Electricity e = new Electricity(200.0, -5.0);
            System.out.println(e.billCalculation());
        } catch (NegativeValueException ex) {
            if (ex.unit < 0) {
                System.out.println("Sorry, Unit Cannot Be Negative Like : " + ex.getUnit());
            } else {
                System.out.println("Sorry, Price Cannot Be Negative Like : " + ex.getPrice());
            }
        }
    }

}
