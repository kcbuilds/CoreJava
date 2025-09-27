package com.corejava.Exceptions;

import java.io.FileReader;
import java.io.IOException;

public class practiceQues {
    public static void main(String[] args) {
//        int numerators = 5;
//        int denominators = 0;
//
//        try {
//            System.out.println(numerators/denominators);
//        }catch (ArithmeticException e){
//            System.out.println("Cannot divide by Zero");
//        }

//        int[] numerators = {10,200,30,40};
//        int[] denominators = {1,2,0,4};
//
//        for (int i = 0; i < 10; i++){
//            try{
//                System.out.println(numerators[i]/denominators[i]);
//            }catch (ArrayIndexOutOfBoundsException e){
//                System.out.println("Index out of range. Please check array size.");
//            }catch (ArithmeticException e){
//                System.out.println("Error: Cannot divide by zero " + e);
//            }
//        }

//        FileReader fileReader = null;
//        try {
//            // Trying to open a file
//            fileReader = new FileReader("test.txt");
//            System.out.println("File opened successfully.");
//        } catch (IOException e) {
//            System.out.println("Exception: " + e);
//        } finally {
//            System.out.println("File closed.");
//        }

//        double balance = 2000;
//        double withdrawal = 5000;
//
//        try {
//            if (withdrawal > balance) {
//                // Throw custom exception
//                throw new LowBalanceException();
//            } else {
//                balance -= withdrawal;
//                System.out.println("Withdrawal successful. Remaining Balance: " + balance);
//            }
//        } catch (LowBalanceException e) {
//            System.out.println(e.getMessage()); // prints custom message
//        }

        try {
            validateAge(19); // Example: passing age 5
            System.out.println("Age validated. Access granted.");
        } catch (Exception e) {
            System.out.println("Exception: " + e.getMessage());
        }

    }

    public static void validateAge(int age) throws Exception {
        if (age < 18){
            throw new Exception("Not eligible: Age must be 18 or above.");
        }
    }

}
