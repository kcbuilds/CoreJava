package com.corejava.oops.Encapsulation;

public class Student {
    private String name;
    private int marks;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        if (marks <= 100 && marks >= 0){
            this.marks = marks;
        }else {
            System.out.println("Invalid marks");
            this.marks = -1;
        }
    }

    public static void main(String[] args) {
        Student student = new Student();
        student.setName("Karan");
        student.setMarks(80);

        System.out.println(student.getName());
        System.out.println(student.getMarks());
    }
}
