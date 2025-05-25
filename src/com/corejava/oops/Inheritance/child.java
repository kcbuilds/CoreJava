package com.corejava.oops.Inheritance;

public class child extends parent {

    public child(String name, int age) {
        super(name, age);
        System.out.println("cChild");
    }

    @Override
    public void sayhello() {
        System.out.println("Parent love");
    }
}
