package com.corejava.oops.Constructor;

public class constStudent {
    private String name;
    private int rollNo;
    private int age;

    public constStudent(String name,int rollNo,int age){
        this.name = name;
        this.rollNo = rollNo;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getRollNo() {
        return rollNo;
    }

    public int getAge() {
        return age;
    }
}
