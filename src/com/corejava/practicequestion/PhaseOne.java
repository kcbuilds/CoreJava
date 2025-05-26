package com.corejava.practicequestion;

public class PhaseOne {
    public static void main(String[] args) {

        // Question 1
        int firstNumber = 10;
        int secondNumber = 20;
        char operators = '=';

        System.out.println("First number is : "+firstNumber);
        System.out.println("Second number is : "+secondNumber);
        System.out.println("Character is : "+operators);

        //Question 2
        int num1 = 6;
        int num2 = 5;

        System.out.println(Integer.toBinaryString(num1));
        System.out.println(Integer.toBinaryString(num2));

        int andResult = num1 & num2;
        System.out.println(andResult);

        int orResult = num1 | num2;
        System.out.println(orResult);

        int xorResult = num1 ^ num2;
        System.out.println(xorResult);

        int notA = ~num1;
        System.out.println(notA);

        System.out.println(num1 << 2);
        System.out.println(num2 >> 2);

        // Question 4
        System.out.print("A");
        System.out.print("B");
        System.out.println("C");
        System.out.printf("Value of PI : %.2f", 3.1452);
        System.out.println();

        //Question 5
        String s1 = "karan";
        String s2 = new String("karan");
        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));
        System.out.println(s1.length());
        System.out.println(s1.charAt(2));
        System.out.println(s1.compareTo(s2));
        System.out.println(s1.toLowerCase());
        System.out.println(s1.toUpperCase());
        System.out.println(s1.replace('a','b'));
        System.out.println(s1.substring(2,4));
        String[] arr = s1.split("a",2);


        for (String a : arr){
            System.out.println(a);
        }

        // Question 6

        int date = 9;
        switch (date){
            case 1:{
                System.out.println("Monday");
                break;
            }
            case 2:{
                System.out.println("Tuesday");
                break;
            }
            case 3:{
                System.out.println("Wednesday");
                break;
            }
            case 4:{
                System.out.println("Thursday");
                break;
            }
            case 5:{
                System.out.println("Friday");
                break;
            }
            case 6:{
                System.out.println("Saturday");
                break;
            }
            case 7:{
                System.out.println("Sunday");
                break;
            }
            default:{
                System.out.println("Invalid Number");
            }
        }

        int factorial = 6;
        int total = 1;

        while (factorial > 0){
            total *= factorial;
            factorial--;
        }
        System.out.println(total);
    }
}
