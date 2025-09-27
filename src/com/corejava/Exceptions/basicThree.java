package com.corejava.Exceptions;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.logging.FileHandler;

public class basicThree {
    public static void main(String[] args) throws FileNotFoundException {
//        try {
//            FileReader fileReader = new FileReader("a.txt");
//        }catch (Exception e){
//            throw new FileNotFoundException("message");
//        }
        System.out.println(divide(2,0));
    }

    private static int divide(int a, int b) {
        try {
            return a / b;
        }catch (Exception e){
            return -1;
        }finally {
            System.out.println("Good Bye");
        }
    }

//    public static void method1() throws FileNotFoundException {
//        FileReader fileReader = new FileReader("a.txt");
//    }


}
