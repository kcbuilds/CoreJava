package MiniOopsProjects.Bank;

public abstract class Account {
    public long accountNumber;
    public double balance = 500.00;

    public Account(long accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void showBalance(){
        System.out.println(balance);
    }

    public abstract void deposit(double amount);
    public abstract void withdraw(double amount);

}
