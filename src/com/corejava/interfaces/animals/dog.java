package com.corejava.interfaces.animals;

public class dog implements Animal{
    @Override
    public void eat() {
        System.out.println("dog eating");
    }

    @Override
    public void sleep() {
        System.out.println("Dog sleeping");
    }
}
