package com.corejava.oops.Polymorphism;

public class test {
    public static void main(String[] args) {
        Employee employee = new Employee();
        Employee employee1 = new Developer();
        Employee employee2 = new Tester();

        employee.work();
        employee1.work();
        employee2.work();
    }




}
