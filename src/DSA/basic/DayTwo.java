package DSA.basic;

public class DayTwo {
    public static void main(String[] args) {

// Check leap year
   int year = 2001;
   if ((year%4 == 0 && year%100 !=0) || year%400 == 0){
       System.out.println("Leap Year");
   }else {
       System.out.println("Not Leap year");
   }

// Check if number is prime
        // 5 -> 2,3,4 % = !0

        int primeNum = 2;
        boolean flag = false;
        for (int i = 2; i < primeNum; i++) {
            if (primeNum % i == 0){
                flag = true;
                break;
            }
        }

        String prime = (!flag) ? "Prime" : "Not Prime";
        System.out.println(prime);


// Check if number is palindrome
        int num = 121;
        int res = 0;
        int copyNum = num;

        while (copyNum > 0){
            int rem = copyNum % 10;
            res = (res * 10) + rem;
            copyNum /= 10;
        }

        String result = (num != copyNum) ? "Palindrome" : "Not Palindrome";
        System.out.println(result);
    }
}
