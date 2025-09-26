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
    }
}
