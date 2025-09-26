package com.corejava.innerclasses;

public class ShoppingCard {
    private double totalAmount;

    public ShoppingCard(double totalAmount) {
        this.totalAmount = totalAmount;
    }

    public void processPayment(Payment paymentMethod){
        paymentMethod.pay(totalAmount);
    }
}
