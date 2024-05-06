abstract public class Account {
    private int accNo;
    private Customer customerDetails;
    private double amount;

    public Account (int accNo, Customer customerDetails, double amount){
        this.accNo = accNo;
        this.customerDetails = customerDetails;
        this.amount = amount;
    }
    public void deposit(double depositAmount){
        this.amount =+ depositAmount;
        System.out.println("Deposit Amount = "+ depositAmount);
    };
    abstract public void withdraw(double withdrawAmount);
}
