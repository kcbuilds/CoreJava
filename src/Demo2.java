public class Demo2 {
    public static void main(String[] args) {
        System.out.println(fact(5));

        System.out.println(sumofnum(5));
    }

    public static int fact(int n){
        if (n == 1){
            return 1;
        }
        return n * fact(n-1);
    }

    public static int sumofnum(int n) {
        if (n == 1){
            return 1;
        }

        return n + sumofnum(n-1);
    }
}
