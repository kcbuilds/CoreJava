package com.corejava.oops.Encapsulation;

public class encapCustomer {
    public static void main(String[] args) {
        encapBankAcc bankAcc = new encapBankAcc();
        bankAcc.setAccNumber(6575150);
        bankAcc.deposit(100);
        bankAcc.withdraw(1000);
        bankAcc.withdraw(50);

        System.out.println(bankAcc.getAccBalance());
    }
}
