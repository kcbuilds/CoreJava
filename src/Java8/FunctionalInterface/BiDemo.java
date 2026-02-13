package Java8.FunctionalInterface;

import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;

public class BiDemo {
    public static void main(String[] args) {

        // BiPredicate -> takes two value and return boolean

        BiPredicate<Integer, Integer> biPredicate = (x,y) -> (x + y)%2 == 0;
        System.out.println(biPredicate.test(5,2));

        // BiConsumer -> takes two value and return nothing
        BiConsumer<Integer, Integer> biConsumer = (x , y) -> {
            System.out.println(x);
            System.out.println(y);
        };

        biConsumer.accept(5,2);

        // BiFunction -> takes two value and return one result
        BiFunction<Integer, Integer, Integer> biFunction = (a,b) -> a + b;
        System.out.println(biFunction.apply(4, 5));
    }
}
