package com.corejava.interfaces;

interface Car{
    public void start();
}

class ElectricCar implements Car{

    @Override
    public void start() {
        System.out.println("Electric Car Starts");
    }
}

class DieselCar implements Car{

    @Override
    public void start() {
        System.out.println("Diesel Car Starts");
    }
}


public class InterfaceDemo {
    public static void main(String[] args) {
        Car electricCar = new ElectricCar();
        Car dieselCar = new DieselCar();

        electricCar.start();
        dieselCar.start();

        Car car = new Car() {
            @Override
            public void start() {
                System.out.println("Love");
            }
        };
        car.start();
    }
}
