package com.corejava.interfaces;

import com.corejava.interfaces.animals.Animal;
import com.corejava.interfaces.animals.cat;
import com.corejava.interfaces.animals.dog;

public class test {
    public static void main(String[] args) {
        System.out.println(Animal.max);

        dog Dog = new dog();
        Dog.eat();

        cat Cat = new cat();
        Cat.eat();

        Animal.display();
        Dog.displayone();

    }
}
