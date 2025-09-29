package com.corejava.multiThreading;

public class Threads extends Thread {

    @Override
    public void run() {
        try {
            Thread.sleep(2000);
            System.out.println("RUNNING");
        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }

    public static void main(String[] args) throws InterruptedException {

        Threads threads = new Threads();    // NEW State
        System.out.println(threads.getState());

        threads.start();        // RUNNABLE
        System.out.println(threads.getState());

        System.out.println(Thread.currentThread().getName());
        Thread.sleep(100);

        System.out.println(threads.getState());
        threads.join();

        System.out.println(threads.getState());


    }
}
