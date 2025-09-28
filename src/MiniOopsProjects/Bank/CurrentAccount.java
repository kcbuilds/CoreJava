package MiniOopsProjects.Bank;

public class CurrentAccount extends Account{

    public double overdraftLimit;

    public CurrentAccount(long accountNumber, double overdraftLimit) {
        super(accountNumber);
        this.overdraftLimit = overdraftLimit;
    }

    public void checkOverdraft(){
        System.out.println("Overdraft limit: "+overdraftLimit);
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
        if (amount > 0 && amount <= (balance + overdraftLimit)){
            balance -= amount;
            System.out.println("Withdrawal successful. Updated Balance: " + balance);
        }else{
            System.out.println("Invalid Amount or Exceeds Overdraft Limit..");
        }
    }
}
