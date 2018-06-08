package UserDefinedException;

class InsufficientFundsException extends Exception {

    private final double amount;

    public InsufficientFundsException(double amount) {
        this.amount = amount;
    }

    public double getAmount() {
        return amount;
    }

}
