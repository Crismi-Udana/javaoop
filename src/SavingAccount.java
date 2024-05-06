public class SavingAccount extends Account{
    public SavingAccount(int accNo, Customer customerDetails, double amount) {
        super(accNo, customerDetails, amount);
    }

    @Override
    public void withdraw(double withdrawAmount) {
        setAmount(getAmount() - withdrawAmount);
        System.out.println("Withdraw amount = "+ withdrawAmount);
        System.out.println("Available amount = "+ getAmount());

    }
}
