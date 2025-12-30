public class Demo {
    public static void main(String[] args) {
        /* Integral number -
            1. byte
            2. short
            3. int
            4. long
         */

        byte num1 = 127;
        short num2 = 32767;
        int num3 = -2147483648;
        long num4 = 2147483649l;

        System.out.println(num1);

        /* Decimal number -
            1. float
            2. double
         */

        float num5 = 111.666f;
        double num6 = 111.33333;

        /* Character-
            1. char
         */

        char ch = 'a';
        char hindich = 2309;
        char symbol = '\u27A4';

        System.out.println((int) ch);
        System.out.println(hindich);
        System.out.println(symbol);
        System.out.println(symbol);

        System.out.println((char) 10082);

        /* Booleans -
            1. boolean
         */

        boolean isvalid = true;


        // Practice

//        int a = 130;
//        byte b = (byte) a;

//        System.out.println(b);

        int x = 10;
        int y = 3;
        System.out.println(x / y);
        System.out.println(x / (double) y);

        int a = 5;
        System.out.println(a++); // ?
        System.out.println(++a); // ?


        /* Bitwise Operators :
            1. And operator &
            2. Or operator |
            3. Xor ^
            4. Not ~
            5. Left Shift <<
            6. Right Shift >>
            7. Unsigned right shift >>>
         */

        int n = 5;
        System.out.println(Integer.toBinaryString(n));

        int s = n >> 1;
        System.out.println(s);



        /*
            Array
        */

        // 1D Array
        int[] arr = new int[10];
        int[] arr1 = {1, 2, 6, 4, 8};

        int res = Integer.MIN_VALUE;
        for (int i : arr1) {
            if (res < i) {
                res = i;
            }
        }

        int sum = 0;
        for (int i : arr1) {
            sum += i;
        }

        System.out.println(sum);
        System.out.println(res);


        // 2D Array
        int[][] arr2 = new int[3][3];


        // Methods
         int[] arr3 = {2,4,5,6,7};
         sumofarray(arr3);
    }

    public static void sumofarray(int[] arr){
        int sum = 0;

        for (int i : arr){
            sum += i;
        }

        System.out.println(sum);
    }
}
