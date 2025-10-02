package com.corejava.multiThreading;

class SharedResource{
    private int data;
    private boolean hasDate;

    public void producer(int value){

    }

    public int consumer(){
        return 1;
    }
    
}

class Producer implements Runnable{
    private SharedResource resource;

    public Producer(SharedResource resource) {
        this.resource = resource;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            resource.producer(i);
        }
    }
}

class Consumer implements Runnable{
    private SharedResource resource;

    public Consumer(SharedResource resource) {
        this.resource = resource;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            int value = resource.consumer();

        }
    }
}


public class ThreadCommunication {
    public static void main(String[] args) {
        SharedResource sharedResource = new SharedResource();
        Thread producerThread = new Thread(new Producer(sharedResource));
        Thread comsumerThread = new Thread(new Consumer(sharedResource));

        producerThread.start();
        comsumerThread.start();
    }
}
