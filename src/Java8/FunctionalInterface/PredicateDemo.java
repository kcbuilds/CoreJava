package Java8.FunctionalInterface;

import java.util.function.Predicate;

public class PredicateDemo {

    public static void main(String[] args) {
        Predicate<Integer> isEven = x -> x % 2 == 0;  // It help to make method smaller
        System.out.println(isEven.test(5));

        Predicate<String> isWordStartWithA = x -> x.toLowerCase().startsWith("a");
        Predicate<String> isWordStartWithR = x -> x.toLowerCase().endsWith("r");

        Predicate<String> combinedBoth = isWordStartWithA.and(isWordStartWithR);

        System.out.println(isWordStartWithA.test("Amar"));
        System.out.println(isWordStartWithR.test("Amar"));
        System.out.println(combinedBoth.test("Amar"));
    }
}
