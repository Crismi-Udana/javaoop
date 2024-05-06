abstract public class Account {
    private int accNo;
    private Customer customerDetails;
    private double amount;

    public Account (int accNo, Customer customerDetails, double amount){
        this.accNo = accNo;
        this.customerDetails = customerDetails;
        this.amount = amount;
    }

    public int getAccNo() {
        return accNo;
    }

    public void setAccNo(int accNo) {
        this.accNo = accNo;
    }

    public Customer getCustomerDetails() {
        return customerDetails;
    }

    public void setCustomerDetails(Customer customerDetails) {
        this.customerDetails = customerDetails;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public void deposit(double depositAmount){
        amount = amount +depositAmount;
        System.out.println("Deposit Amount = "+ depositAmount);
    };
    abstract public void withdraw(double withdrawAmount);



}
