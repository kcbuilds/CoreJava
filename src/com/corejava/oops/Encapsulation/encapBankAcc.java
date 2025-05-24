package com.corejava.oops.Encapsulation;

public class encapBankAcc {

    private long accNumber;
    private double accBalance;

    public void deposit(double amount){
        if (amount > 0){
            accBalance += amount;
            System.out.println("Deposited " + amount);
        }else {
            System.out.println("Invalid Amount");
        }
    }

    public void withdraw(int amount){
        if (amount > 0 && amount <= accBalance){
            accBalance -= amount;
            System.out.println("Withdraw Successfully");
        }else {
            System.out.println("Insufficient Balance");
        }
    }

    public double getAccBalance() {
        return accBalance;
    }

    public long getAccNumber() {
        return accNumber;
    }

    public void setAccNumber(long accNumber) {
        this.accNumber = accNumber;
    }
}
