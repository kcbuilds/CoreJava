package com.corejava.keywords;

public class Student {
    private int id;
    private String name;

    public static int count = 3;


    static {
        if (count == 3){
            System.out.println("count lover");
        }
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
