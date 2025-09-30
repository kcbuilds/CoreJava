package com.corejava.multiThreading;

public class Main {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount();

        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                bankAccount.withdraw(50);
            }
        };

        Thread t1 = new Thread(runnable,"T1");
        Thread t2 = new Thread(runnable,"T2");

        t1.start();
        t2.start();
    }
}
