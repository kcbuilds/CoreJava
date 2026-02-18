package DSA.Basic;

import java.util.Scanner;

public class DayFour {
    public static void main(String[] args) {

//        Take N integers input and print them

        Scanner sc = new Scanner(System.in);
//        int arr[] = new int[5];
//        System.out.println("Enter Array number: ");
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = sc.nextInt();
//        }
//        for (int value : arr){
//            System.out.print(value +" ");
//        }
//


//Find sum of all array elements
        int arr2[] = {1,2,3,4,6,8};
        int sum = 0;

        for (int i = 0; i < arr2.length; i++) {
            sum += arr2[i];
        }
        System.out.println(sum);


//Find maximum and minimum element
        int max = arr2[0];
        int min = arr2[0];

        for (int i = 1; i < arr2.length; i++) {
            if (max < arr2[i]){
                max = arr2[i];
            }
            if (min > arr2[i]){
                min = arr2[i];
            }
        }

        System.out.println(max);
        System.out.println(min);

//Count even and odd numbers
    int evenCount = 0;
    int oddCount = 0;

        for (int i = 0; i < arr2.length; i++) {
            if (arr2[i] % 2 == 0){
                evenCount++;
            }else {
                oddCount++;
            }
        }

        System.out.println(evenCount);
        System.out.println(oddCount);

//Search a number in array (Linear Search)

    int search = 10;
    boolean flag = false;
        for (int i = 0; i < arr2.length; i++) {
            if (arr2[i] == search){
                flag = true;
                break;
            }
        }

        String result = (!flag) ? "Absent" : "Present";
        System.out.println(result);

    }
}
