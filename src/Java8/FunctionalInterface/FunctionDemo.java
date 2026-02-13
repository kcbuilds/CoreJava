package Java8.FunctionalInterface;

import java.util.function.Function;

public class FunctionDemo {
    public static void main(String[] args) {

        // Function --> Work for you..

        Function<Integer,Integer> doubleIt = x -> 2 * x;
        Function<Integer,Integer> tripleIt = x -> 3 * x;

        System.out.println(doubleIt.apply(5));
        Function<Integer, Integer> combined = doubleIt.andThen(tripleIt);
        System.out.println(combined.apply(5));

        Function<Integer, Integer> compose = doubleIt.compose(tripleIt);
        System.out.println(compose.apply(5));
    }
}
