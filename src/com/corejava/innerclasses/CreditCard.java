package com.corejava.innerclasses;

public class CreditCard implements Payment{

    private String creditCardNum;

    public CreditCard(String creditCardNum) {
        this.creditCardNum = creditCardNum;
    }

    @Override
    public void pay(double amount) {
        System.out.println("Paid " +amount+ " using Credit Card.");
    }
}
