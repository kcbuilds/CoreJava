package com.corejava.Exceptions;

public class basicTwo {
    public static void main(String[] args) {
        try{
            level1();
        }catch (Exception o){
            o.printStackTrace();
        }
    }

    public static void  level1() {
        level2();
    }

    public static void  level2(){
        int[] array = new int[5];
        array[5] = 10;
    }

}
