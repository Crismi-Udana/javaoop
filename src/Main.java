//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Customer customer1 = new Customer();
        System.out.println(customer1.toString());

        customer1.setCusId(001);
        customer1.setName("crismi");
        customer1.setAddress("kegalle");
        customer1.setNic("20004563");

        System.out.println(customer1.toString());

        Customer customer2 = new Customer(002, "umesh" ,"12345v", "kegalle");
        System.out.println(customer2.toString());

        Customer customer3 = new Customer(003 );
        System.out.println(customer3.toString());


        System.out.println("Account1");

        SavingAccount savingAcc1 = new SavingAccount(0001, customer1, 1000.00);

        System.out.println(savingAcc1.getAmount());

        savingAcc1.deposit(100);

        System.out.println(savingAcc1.getAmount());

        savingAcc1.withdraw(200);

        System.out.println(savingAcc1.getAmount());


        System.out.println("Account2");

        FixedDeposit savingAcc2 = new FixedDeposit(002, customer2, 5000, "12/12/2024");

        System.out.println(savingAcc2.getAmount());

        savingAcc2.deposit(100);

        System.out.println(savingAcc2.getAmount());

        savingAcc2.withdraw(200);

        System.out.println(savingAcc2.getAmount());



    }
}