public class FixedDeposit extends Account {
    private String matureDate;

    public FixedDeposit(int accNo, Customer customerDetails, double amount, String matureDate) {
        super(accNo, customerDetails, amount);
        this.matureDate = matureDate;
    }

    @Override
    public void withdraw(double withdrawAmount) {
        withdrawAmount = getAmount();
        setAmount(0);
        System.out.println("withdraw amount = " + withdrawAmount);
    }
}
