package com.corejava.multiThreading;

public class threadsMethods extends Thread{

    public threadsMethods(String name){
        super(name);
    }

    @Override
    public void run() {
//        try {
//            Thread.sleep(1000);
//            System.out.println("Thread is running...");
//        } catch (InterruptedException e) {
//            System.out.println("Thread Interrupted: " + e);
//        }

//        for (int i = 0; i < 5; i++) {
//            System.out.println(Thread.currentThread().getName() + " is running");
//            Thread.yield();
//        }

        while (true){
            System.out.println("Hello World");
        }
    }

    public static void main(String[] args) {
        threadsMethods th = new threadsMethods("1");
//        threadsMethods th1 = new threadsMethods("2");
        th.setDaemon(true);
        th.start();
        System.out.println("Main WorkDone");
//        th1.start();


//        th.interrupt();
    }
}
