package com.corejava.multiThreading;

public class Test {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName());

        World world = new World();
        Thread thread = new Thread(world);
        thread.start();

        for (; ;) {
            System.out.println("Hello");
        }
    }
}
