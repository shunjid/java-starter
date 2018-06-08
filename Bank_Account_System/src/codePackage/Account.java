package codePackage;

public class Account {

    public String UserName;
    public String Address;
    public String NationalID;
    public String BankAccountID;
    public Double CurrentBalance=0.0;

    /*
    ** Parameterized Constructor to Initialize 
    ** Attribute Values For Each of The Objects
    */
    public Account(String UserName, String Address, String NationalID, String BankAccountID, Double InitialAmount) {
        this.UserName = UserName;
        this.Address = Address;
        this.NationalID = NationalID;
        this.BankAccountID = BankAccountID;
        this.CurrentBalance += InitialAmount;
    }

    // Deposite Amount To Main Account Balance For Each Object
    public void depositeAmountInBalance(Double amountToDeposite) {
        CurrentBalance += amountToDeposite;
    }

    // WithDraw Amount From Main Account Balance For Each Object
    public void withDrawAmountFromBalance(Double amountToWithdraw) {
        if (CurrentBalance > 100 && CurrentBalance > amountToWithdraw) {
            CurrentBalance -= amountToWithdraw;
        } else {
            System.out.println("Withdraw is not possible !!!");
        }
    }

    // Calculate Montly Interest Amount Based On Each Object Current Balance
    public Double calculateMonthlyInterestAmount() {
        if (CurrentBalance > 100000.0) {
            return CurrentBalance * 0.02;
        } else {
            return CurrentBalance * 0.01;
        }
    }
    
    // Calculate Yearly Interest Amount Based On Each Object Current Balance
    public Double calculateYearlyInterestAmount(){
        return calculateMonthlyInterestAmount()*12;
    }

    public void displayInfo(){
        System.out.println("User Name            : "+UserName);
        System.out.println("Account ID           : "+BankAccountID);
        System.out.println("Current Balance      : "+CurrentBalance +" Taka");
        System.out.println("Monthly Interest     : "+calculateMonthlyInterestAmount() +" Taka");
        System.out.println("Yearly Interest      : "+calculateYearlyInterestAmount()+" Taka");
    }
}
