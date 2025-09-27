package com.corejava.Exceptions;

public class BankAccount {
    private double balance;

    public BankAccount(double amount) {
        this.balance = amount;
    }

    public void withdraw(double amount) throws InsufficentFundsException {
        if (amount > balance){
            throw new InsufficentFundsException("error",5);
        }
        balance -= amount;
    }


    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount(15);
        try {
            bankAccount.withdraw(16);
        }catch (InsufficentFundsException e){
            e.amount();
            System.out.println(e);
        }

    }

}
