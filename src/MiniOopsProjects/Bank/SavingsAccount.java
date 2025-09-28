package MiniOopsProjects.Bank;

public class SavingsAccount extends Account{
    public double interestRate;

    public SavingsAccount(long accountNumber, double interestRate) {
        super(accountNumber);
        this.interestRate = interestRate;
    }

    public void calculateInterest(){
        double interest = balance * interestRate / 100;
        System.out.println("Interest : "+interest);
    }

    @Override
    public void deposit(double amount) {
        if (amount > 0){
            balance+=amount;
            System.out.println("Updated Balance : " + balance);
        }else {
            System.out.println("Invalid Amount");
        }
    }

    @Override
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance){
            balance -= amount;
            System.out.println("Withdrawal successful. Updated Balance: " + balance);
        } else {
            System.out.println("Invalid Amount or Insufficient Balance..");
        }
    }
}
