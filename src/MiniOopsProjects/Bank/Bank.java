package MiniOopsProjects.Bank;

public class Bank {
    public static void main(String[] args) {


        Account acc = new SavingsAccount(1001,7.7);
        Account acc1 = new CurrentAccount(2001,7000);

        acc.showBalance();
        acc.deposit(5000);
        acc.withdraw(500);

        acc1.showBalance();
        acc1.deposit(5000);
        acc1.withdraw(500);






    }
}
