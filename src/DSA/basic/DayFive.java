package DSA.basic;

import java.lang.reflect.Array;

public class DayFive {

    public static void PrintArray(int[] arr){
        System.out.print("[ " );
        for (int i : arr){
            System.out.print(i + " ");
        }
        System.out.print("]" );
        System.out.println();
    }

    public static void main(String[] args) {

//      Reverse an array (in place)
        int[] array = {-10,-3,-6,-8};
        for (int i = 0; i < array.length/2; i++) {
            int storage = array[i];
            array[i] = array[array.length-i-1];
            array[array.length-i-1] = storage;
        }
        PrintArray(array);

        // Cleaner Version (Two Pointer Style)

        int left = 0;
        int right = array.length - 1;

        while (left < right) {
            int temp = array[left];
            array[left] = array[right];
            array[right] = temp;

            left++;
            right--;
        }



//        Find 2nd largest number in array

        int max = Integer.MIN_VALUE;
        int secMax = Integer.MIN_VALUE;

        for (int i = 0; i < array.length; i++) {
            if (array[i] > max){
                secMax = max;
                max = array[i];
            }else if (secMax < array[i] && array[i] != max){
                secMax = array[i];
            }
        }
        System.out.println(max);
        System.out.println(secMax);

//        Find missing number from 1 to N


//        Move all zeroes to end

//        Merge two arrays
    }
}
