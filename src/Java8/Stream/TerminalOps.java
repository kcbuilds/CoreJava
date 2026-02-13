package Java8.Stream;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class TerminalOps {
    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(1,2,3,4,5);

        // 1. Collect
        integerList.stream().skip(1).collect(Collectors.toList());
        integerList.stream().skip(1).toList();  // New java version

        // 2. ForEach
        integerList.stream().forEach(x -> System.out.println(x));
        integerList.stream().forEach(System.out::println);

        // 3. reduce : combines element to produces a single result
        Optional<Integer> optionalInteger = integerList.stream().reduce((x, y) -> x + y);
        Optional<Integer> optionalIntegerMR = integerList.stream().reduce(Integer::sum);
        System.out.println(optionalInteger.get());

        // 4. count
        System.out.println(integerList.stream().filter(x -> x % 2 == 0).count());

        // 5. anyMatch, allMatch, noneMatch --> Short circuit
        boolean anyMatch = integerList.stream().anyMatch(x -> x % 2 == 0);
        System.out.println(anyMatch);

        boolean greaterthanZero = integerList.stream().allMatch(x -> x > 0);
        System.out.println(greaterthanZero);

        boolean b = integerList.stream().noneMatch(x -> x < 0);
        System.out.println(b);

        // 6. findFirst | findAny
        System.out.println(integerList.stream().findFirst().get());
        System.out.println(integerList.stream().findAny().get());

        // Example : element that greater than 3character
        List<String> names = Arrays.asList("Anna", "Bob", "Charlie", "David");
        System.out.println(names.stream().filter(x -> x.length() > 3).toList());

        // Example : Squaring and sorting Number
        List<Integer> numbers = Arrays.asList(5,6,2,1,4);
        System.out.println(integerList.stream().map(x -> x * x).sorted().toList());

        // Example : Summing value
        System.out.println(numbers.stream().reduce(Integer::sum).get());

        // Example : Counting occurs of a character
        String sentence = "Hello World";
        System.out.println(sentence.chars().filter(x -> x == 'l').count()); // String to stream using chars
    }
}
