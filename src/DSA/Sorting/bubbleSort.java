package DSA.Sorting;

public class bubbleSort {
    public static void main(String[] args) {
        int[] numArr = {2,6,8,9,4};


        for (int i = 0; i < numArr.length-1; i++) {
            for (int j = 0; j < numArr.length-1-i; j++) {
                if (numArr[j] > numArr[j + 1]){
                    int temp = numArr[j];
                    numArr[j] = numArr[j + 1];
                    numArr[j + 1] = temp;
                }
            }

        }

        for (int i : numArr){
            System.out.print(i +" ");
        }
    }
}
