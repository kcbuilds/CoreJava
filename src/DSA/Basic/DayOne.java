package DSA.Basic;

import java.util.Scanner;

public class DayOne {
    public static void main(String[] args) {

        // Print numbers 1 to 100
        for (int i = 1; i <= 100; i++) {
            System.out.print(i + " ");
        }
        System.out.println();

        //Print even numbers up to N
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 2; i <= n; i+=2) {
            System.out.print(i +" ");
        }
        System.out.println();

        //Print sum of first N natural numbers
        int size = sc.nextInt();

        int sum = 0;
        for (int i = 1; i <= size; i++) {
            sum += i;
        }
        System.out.println(sum);

        //Print table of any number
        int table = 2;
        for (int i = 1; i <= 10; i++) {
            System.out.println(table +" * "+ i +" = " +table*i);
        }

        //Reverse a number (e.g. 123 → 321)
        int num = 123;
        int res = 0;

        while (num > 0){
            int rem = num%10;
            res = (res * 10) + rem;
            num /= 10;
        }
        System.out.println(res);
    }
}
