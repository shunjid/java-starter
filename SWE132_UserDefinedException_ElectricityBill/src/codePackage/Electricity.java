package codePackage;

public class Electricity {

    private final double unit;
    private final double price;
    private double bill;

    public Electricity(double unit, double price) {
        this.unit = unit;
        this.price = price;
    }

    public double billCalculation() throws NegativeValueException {
        if (unit < 0 || price < 0) {
            throw new NegativeValueException(unit, price);
        } else {
            bill = unit * price;
            return bill;
        }
    }
}
