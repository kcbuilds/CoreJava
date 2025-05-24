package com.corejava.oops.Inheritance;

public class parent extends grandparent {

    public parent(String name,int age) {
        super(name,age);
        System.out.println("parent");
    }


    @Override
    public void sayhello() {
       System.out.println("Parent");
    }
}
