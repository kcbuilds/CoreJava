package com.corejava.oops.Inheritance;

public class grandparent {
    private String name;
    private int age;

    public grandparent(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("Grandparent");
    }

    public String getName() {
        return name;
    }



    public int getAge() {
        return age;
    }




    public void sayhello() {
        System.out.println(" ");
    }
}
