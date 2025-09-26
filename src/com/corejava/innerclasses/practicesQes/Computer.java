package com.corejava.innerclasses.practicesQes;

public class Computer {

    // Non-static inner class
    class Memory {
        void memoryInfo() {
            System.out.println("Memory available: 8GB");
        }
    }

    // Static nested class
    static class Processor {
        void process() {
            System.out.println("Processor Working");
        }
    }

    public static void main(String[] args) {
        // Creating outer class object
        Computer computer = new Computer();

        // Creating inner class object (needs outer object)
        Computer.Memory memory = computer.new Memory();
        memory.memoryInfo();

        // Creating static nested class object (no outer object needed)
        Processor processor = new Processor();
        processor.process();
    }
}
