package Java8.FunctionalInterface;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class ConsumerSupplierDemo {
    public static void main(String[] args) {

        // Consumer --> Take one input and return nothing

        Consumer<Integer> consumer = x -> System.out.println(x);
        consumer.accept(5);

        List<Integer> list = Arrays.asList(1,2,3,4);
        Consumer<List<Integer>> printList = x -> {
            for(int i : x){
                System.out.println(i);
            }
        };
        printList.accept(list);

        // Supplier --> Take no input and return value
        Supplier<String> supplier = () -> "Hello World";
        System.out.println(supplier.get());

        // Predicate | Function | Consumer | Supplier combined example
        Predicate<Integer> isEven = x -> x % 2 == 0;
        Function<Integer, Integer> function = x -> x * x;
        Consumer<Integer> consumer1 = x -> System.out.println(x);
        Supplier<Integer> supplier1 = () -> 10;

        if (isEven.test(supplier1.get())){
         consumer1.accept(function.apply(supplier1.get()));
        }



    }
}
