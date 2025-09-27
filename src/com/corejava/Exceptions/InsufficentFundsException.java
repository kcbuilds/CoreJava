package com.corejava.Exceptions;

public class InsufficentFundsException extends Exception{
    private double amount;
    private String message;


    public InsufficentFundsException(String message, double amount) {
        super(message);
        this.amount = amount;
    }

    public double amount() {
        return amount;
    }
}
