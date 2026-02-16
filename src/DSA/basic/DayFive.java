package DSA.basic;

import java.lang.reflect.Array;
import java.util.Arrays;

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
        int[] array = {0,1,0,3,12};
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

//      Find missing number from 1 to N
        int totalNum = array.length + 1;
        for (int i = 1; i <= array.length; i++) {
            totalNum = totalNum + i;
        }

        int presentSum = 0;
        for (int i = 0; i < array.length; i++) {
            presentSum += array[i];
        }
        System.out.println("Missing Number is: " +(totalNum-presentSum));

        // Optimized
        int N = array.length + 1;
        int totalSum = N * (N + 1) / 2;

        int Sum = 0;
        for (int i = 0; i < array.length; i++) {
            Sum += array[i];
        }

        System.out.println("Missing Number is: " + (totalSum - Sum));


//        Move all zeroes to end

        int[] arr = {0,0,1};

        int first = 0;
        int last = arr.length - 1;

        while (first < last){
            if (arr[first] == 0){
                int extras = arr[first];
                arr[first] = arr[last];
                arr[last] = extras;

                last--;
            }else {
                first++;
            }

            PrintArray(arr);
        }





//        Merge two arrays
    }
}
