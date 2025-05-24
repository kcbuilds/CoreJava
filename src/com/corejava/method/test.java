package com.corejava.method;

public class test {
    public static void main(String[] args) {



       /* Car.setSpeed(40);
        Car.accelerate(2);
        System.out.println(Car.getSpeed());

        car ani = new car();
        ani.setName("Blue");

        System.out.println(ani.getName());*/



      /*  makecat(a);
        System.out.println(a);

        System.out.println(sum(1,2,3,4));

        System.out.println(isPrime(2));*/

    }

    /*public static void makecat(cat C){
        C.breed = C.breed.toUpperCase();
    }*/

    public static int sum(int... a){
        int total = 0;

        for (int i : a){
            total += i;
        }

        return total;
    }

    public static boolean isPrime(int n){
        int res = 0;

        for(int i = 1; i < n/2; i++){
            if (n % i == 0){
                res++;
            }

        }

        return res == 1;
    }

}
