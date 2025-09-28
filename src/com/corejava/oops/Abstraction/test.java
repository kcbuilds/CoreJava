package com.corejava.oops.Abstraction;

public class test {
    public static void main(String[] args) {
        Animal animal = new Dog();
        Animal animal1 = new Cat();

        animal1.makeSound();
        animal.makeSound();
    }
}
