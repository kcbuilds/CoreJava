package Java8;

public class LambdaExpressionDemo {
    interface MathOperation{
        int operate(int a, int b);
    }

    public static void main(String[] args) {
        MathOperation sum = (a, b) -> a + b;
        System.out.println(sum.operate(2,5));

        MathOperation sub = (a, b) -> a - b;
        System.out.println(sub.operate(4,2));
    }
}
