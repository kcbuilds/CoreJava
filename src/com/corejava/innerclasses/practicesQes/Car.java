package com.corejava.innerclasses.practicesQes;

public class Car {

    class Engine {   // non-static inner class
        public void start() {
            System.out.println("Engine is starting...");
        }
    }

    public static void main(String[] args) {
        Car car = new Car();              // Outer class object
        Car.Engine engine = car.new Engine(); // Inner class object using outer class
        engine.start();                   // Call inner class method
    }
}

