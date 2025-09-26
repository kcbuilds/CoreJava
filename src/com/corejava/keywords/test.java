package com.corejava.keywords;

public class test {
    public static void main(String[] args) {
        Student str = new Student();


        str.setId(20);
        str.setName("Karan");

        System.out.println(Student.count);

        System.out.println(sum(2,5));
    }

    public static int sum(int a, int b){
        return a+b;
    }
}
