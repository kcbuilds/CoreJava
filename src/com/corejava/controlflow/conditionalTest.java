package com.corejava.controlflow;

public class conditionalTest {
    public static void main(String[] args) {
        int num = 3;

        if(num % 2 == 0){
            System.out.println("Even");
        }else {
            System.out.println("Odd");
        }

        int num1 = 0;

        if (num1 == 0){
            System.out.println("Zero");
        } else if (num1 > 0) {
            System.out.println("Postive");
        }else {
            System.out.println("Negative");
        }
        
        int marks = 70;
        
        if (marks >= 90){
            System.out.println("Grade A");
        } else if (marks >= 80) {
            System.out.println("Grade B");
        } else if (marks >= 70) {
            System.out.println("Grade C");
        } else if (marks >= 60) {
            System.out.println("Grade D");
        } else {
            System.out.println("Grade E");
        }
    }
}
