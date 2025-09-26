package com.corejava.innerclasses;

public class test {
    public static void main(String[] args) {
        car Car = new car("Tvs");
        car.Engine engine = Car.new Engine();

        engine.start();
        engine.stop();

        computer com = new computer("HP504","HP","Window");
        com.getOs().displayInfo();

        computer.USB usb = new computer.USB("32GB");
        usb.display();

        ShoppingCard shoppingCard = new ShoppingCard(10500);

        // CreditCard creditCard = new CreditCard("12345678");
        // shoppingCard.processPayment(creditCard);

        shoppingCard.processPayment(new Payment() {

            @Override
            public void pay(double amount) {
                System.out.println("Paid " +amount+ " using Credit Card.");
            }
        });
        shoppingCard.processPayment(new Payment() {

            @Override
            public void pay(double amount) {
                System.out.println("Paid " +amount+ " using PayPal.");
            }
        });

        Hotel hotel = new Hotel("SonaliHotel",10,5);
        hotel.reserveRoom("Karan",6);
    }
}
