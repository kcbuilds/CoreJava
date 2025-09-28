package com.corejava.oops.Polymorphism;

public class Calculator {


    public static void main(String[] args) {
        System.out.println(multiply(2,5));
        System.out.println(multiply(2.5,5.5));
        System.out.println(multiply(Integer.valueOf(5),Integer.valueOf(6)));      // Integer version
    }

    public static int multiply(int a, int b){
        return a*b;
    }

    public static double multiply(double a, double b){
        return a*b;
    }

    public static Integer multiply(Integer a, Integer b){
        return a*b;
    }

}
