package com.corejava.oops.Inheritance;

class Animal{
    String colour = "Black";

    void sound(){
        System.out.println("Animal Sound");
    }

    Animal(){
        System.out.println("Animal Constructor");
    }
}

class Dog extends Animal{
    String colour = "White";

    void printColour(){
        System.out.println(colour);
        System.out.println(super.colour);
    }

     void sound(){
        System.out.println("Dog sound");
    }

    void whosSound(){
        super.sound();
        sound();
    }

    Dog(){
        super();     // Default present does not need to write.
        System.out.println("Dog constructor");
    }

}




public class SuperKeywords {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.printColour();

        dog.whosSound();


//        Animal animal = new Animal();
//        System.out.println(animal.colour);
    }
}
