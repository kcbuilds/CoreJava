package com.corejava.interfaces.animals;

public class cat implements Animal{
    @Override
    public void eat() {
        System.out.println("Cat eating");
    }

    @Override
    public void sleep() {
        System.out.println("Cat sleeping");
    }
}
