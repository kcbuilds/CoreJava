package com.corejava.oops.Inheritance;

public class Test {
    public static void main(String[] args) {
        child c = new child("karan", 10);


        parent p = new parent("Ramesh",30);
//        p.setName("Ramesh");
//        p.setAge(30);

        System.out.println(c.getName());
        System.out.println(p.getAge());

        Vehicle vehicle = new Vehicle();
        vehicle.drive();

        Car car = new Car();
        car.drive();

    }
}
