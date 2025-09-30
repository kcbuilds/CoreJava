package com.corejava.multiThreading;

public class Threads extends Thread {

    public Threads(String name){
        super(name);
    }


    @Override
    public void run() {
//        try {
//            Thread.sleep(2000);
//            System.out.println("RUNNING");
//        } catch (InterruptedException e) {
//            System.out.println(e);
//        }
        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getName() + "- Priority: "+ Thread.currentThread().getState());

        }
    }

    public static void main(String[] args) throws InterruptedException {

         Threads threads = new Threads("low");    // NEW State
         Threads threads2 = new Threads("mediun");    // NEW State
         Threads threads3 = new Threads("high");    // NEW State
//        System.out.println(threads.getState());
//
//        threads.start();        // RUNNABLE
//        System.out.println(threads.getState());
//
//        System.out.println(Thread.currentThread().getName());
//        Thread.sleep(100);
//
//        System.out.println(threads.getState());
//        threads.join();
//
//        System.out.println(threads.getState());


        threads.setPriority(Thread.MIN_PRIORITY);
        threads2.setPriority(Thread.NORM_PRIORITY);
        threads3.setPriority(Thread.MAX_PRIORITY);

        threads.start();
        threads2.start();
        threads3.start();

    }
}
