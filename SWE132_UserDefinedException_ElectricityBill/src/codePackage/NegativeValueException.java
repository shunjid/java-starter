package codePackage;

public class NegativeValueException extends Exception {

    public double unit;
    public double price;

    public NegativeValueException(double unit, double price) {
        this.unit = unit;
        this.price = price;
    }

    public double getUnit() {
        return this.unit;
    }

    public double getPrice() {
        return this.price;
    }
}
