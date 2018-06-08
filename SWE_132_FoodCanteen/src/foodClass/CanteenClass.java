package foodClass;

public class CanteenClass {

    public String foodID;
    public String foodName;
    public int Quantity;
    public double unitPrice;
    public double sellingPrice;
    private double inCash = 0.0;
    private int soldItem = 0;

    public CanteenClass(String i, String N, int Q, double u, double S) {
        foodID = i;
        foodName = N;
        Quantity = Q;
        unitPrice = u;
        sellingPrice = S;
    }

    public void remainingItem(int n) {
        Quantity -= n;
        soldItem += n;
    }

    public double isDiscount(double bill) {
        if (bill > 150.00) {
            return 10.0;
        } else {
            return 0.0;
        }
    }

    public double bill(int item) {
        double tempBill = item * sellingPrice;
        remainingItem(item);
        tempBill -= isDiscount(tempBill);
        inCash += tempBill;
        return tempBill;
    }

    public double profit() {
        return (inCash - (soldItem * unitPrice));
    }
}
