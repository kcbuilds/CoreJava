package practicesQes.Array;

public class MaxArray {
    public static void main(String[] args) {

//      OneD Array1
        int[] arr = {2, 6, 10, 15, 9};
        int max = arr[0];
        System.out.println(arr[3]);
        Maximum(max,arr);

        int[][] arr2 = new int[3][3];
        int[][] nums = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };

        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                System.out.print(nums[i][j] +" ");
            }
            System.out.println();
        }

        for (int i : arr){
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println(arr[3]);

    }

//      OneD Array
    public static void Maximum(int max, int[] arr){
        for (int i = 1; i < arr.length; i++) {
//            if (max < arr[i]){
//                max = arr[i];
//            }

            max = Math.max(max,arr[i]);
        }
        System.out.println("Maximun number : "+max);

        arr[3] = 8;
    }
}
