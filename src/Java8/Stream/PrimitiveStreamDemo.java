package Java8.Stream;

import java.util.Arrays;
import java.util.stream.IntStream;

public class PrimitiveStreamDemo {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        IntStream stream = Arrays.stream(numbers);
        System.out.println(stream.filter(x -> x > 3).boxed().toList());
    }
}
