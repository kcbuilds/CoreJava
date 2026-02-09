package DSA;

public class Practice01 {
    public static void main(String[] args) {

        int sum = 1;
        for (int i = 2; i <= 10; i++) {
            sum += i;
        }

        System.out.println(sum);

        int evenSum = 0;

        for (int i = 2; i <= 10; i+=2) {
//            if (i % 2 == 0){
//                evenSum += i;
//            }
            evenSum += i;

        }

        System.out.println(evenSum);

        int evenTotal = 20;
        for (int i = 22; i <= 40; i+=2) {
            evenTotal += i;
        }

        System.out.println(evenTotal);

        Func();
    }

    public static void Func(){
        System.out.println("k");
    }
}
