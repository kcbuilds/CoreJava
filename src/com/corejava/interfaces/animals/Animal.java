package com.corejava.interfaces.animals;

public interface Animal {

    public static final int max = 150;

    public abstract void eat();
    void sleep();

    public static void display(){
        System.out.println("Hello World");
    }

    public default void displayone(){
        System.out.println("THis is default Method");
    }
}
