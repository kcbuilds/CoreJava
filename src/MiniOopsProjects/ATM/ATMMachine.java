package MiniOopsProjects.ATM;

import java.util.Scanner;
import java.util.SortedMap;

class ATM{
    float Balance = 5000;
    int PIN = 4022;

    ATM (){
        System.out.println("Enter your PIN: ");
        Scanner sc = new Scanner(System.in);
        int enteredPIN = sc.nextInt();

        if (enteredPIN == PIN){
            Menu();
        } else {
            System.out.println("Incorrect PIN");
            ATM atm = new ATM();
        }
    }

    public void Menu(){
        System.out.println();
        System.out.println("Enter Your Choice: ");
        System.out.println("1. Check A/C Balance");
        System.out.println("2. Withdraw Money");
        System.out.println("3. Deposit Money");
        System.out.println("4. EXIT");

        Scanner sc = new Scanner(System.in);
        int enteredOpt = sc.nextInt();

        switch (enteredOpt){
            case 1:
                System.out.println("Account Balance " +Balance);
                Menu();
                break;
            case 2:
                withdrawCash();
                break;
            case 3:
                depositCash();
                break;
            case 4:
                break;

        }

    }

    private void depositCash() {
        System.out.println();
        System.out.println("Enter Deposit Amount");

        Scanner sc = new Scanner(System.in);
        int enteredAmount = sc.nextInt();

        if (enteredAmount <= 0){
            System.out.println("Enter Valid Amount");
            Menu();
        } else {
            System.out.println("Amount Deposit Completed");
            Balance += enteredAmount;
            Menu();
        }
    }

    private void withdrawCash() {
        System.out.println();
        System.out.println("Enter Withdrawal Amount");

        Scanner sc = new Scanner(System.in);
        int enteredAmount = sc.nextInt();

        if (enteredAmount > Balance){
            System.out.println("Insufficient Balance");
        } else {
            System.out.println("Withdrawal Completed");
            Balance -= enteredAmount;
        }
        Menu();

    }

}

public class ATMMachine {
    public static void main(String[] args) {
        System.out.println("***** Welcome To Kotak ATM *****");
        System.out.println();
        ATM atm = new ATM();
    }
}
