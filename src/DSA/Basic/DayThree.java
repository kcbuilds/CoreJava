package DSA.Basic;

public class DayThree {


    public static void main(String[] args) {
//        Write a method to check prime number
            int num = 5;
            isPrime(num);

//        Write a method to find factorial
            int num2 = 5;
        int factorial = findFactorial(num2);
        System.out.println(factorial);

//        Print this pattern:
//        *
//        **
//        ***
//        ****

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println();

//       Print inverted triangle
        for (int i = 0; i < 4; i++) {
            for (int j = 4; j > i; j--) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println();

//       Print number pyramid
//        1
//        12
//        123

        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }

    }

    public static void isPrime(int num){
        boolean flag = false;
        for (int i = 2; i < num; i++) {
            if (num % i == 0){
                flag = true;
                break;
            }
        }
        String prime = (!flag) ? "Prime" : "Not Prime";
        System.out.println(prime);
    }

    public static int findFactorial(int num){
        if (num == 0 || num == 1){
            return 1;
        }
        return num * findFactorial(num - 1);

    }


}
