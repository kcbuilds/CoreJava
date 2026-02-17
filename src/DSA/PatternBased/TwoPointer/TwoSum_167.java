package DSA.PatternBased.TwoPointer;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;


public class TwoSum_167 {

    public static void BruteForce(int[] num, int target) {
        boolean flag = false;
        
        for (int i = 0; i < num.length-1; i++) {
            for (int j = 1; j < num.length; j++) {
                if ((num[i] + num[j]) == target){
                    System.out.println(STR."Founded: \{i + 1} & \{j + 1}");
                    flag = true;
                    break;
                }
            }
            if (flag){
                break;
            }

        }
    }

    public static int[] twoSum(int[] numbers, int target) {

            int indexOne = 0;
            int indexTwo = numbers.length - 1;

            while (indexOne < indexTwo) {
                int sum = numbers[indexOne] + numbers[indexTwo];
                if (sum == target) {
                    return new int[]{indexOne + 1, indexTwo + 1};
                } else if (sum > target) {
                    indexTwo--;
                } else {
                    indexOne++;
                }


            }
                return new int[]{-1, -1};
        }


    public static void main(String[] args) {
        int[] num = {1,2,3,5,7};
        int target = 6;

        // Better Approach --> Hashmap

        int[] ints = twoSum(num, target);


    }
}
