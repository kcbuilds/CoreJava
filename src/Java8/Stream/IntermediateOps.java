package Java8.Stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class IntermediateOps  {
    public static void main(String[] args) {

        // Intermediate operations transform a stream into another stream
        // They are lazy, because they don't execute until a terminal operation is invoked.


        // 1. Filter
        List<String> list = Arrays.asList("Akshay", "Srk", "Salman","Akshay");
        Stream<String> filterStream = list.stream().filter(x -> x.startsWith("A"));
        //                           |      No filtering at this point          |
        //            Because they don't execute until a Terminal Operation is invoked

        long count = list.stream().filter(x -> x.startsWith("A")).count();
        System.out.println(count);
        System.out.println(filterStream);

        // 2. Map --> touppercase/tolowercase
        Stream<String> stringStream = list.stream().map(x -> x.toUpperCase());
        Stream<String> stringStreamusingMR = list.stream().map(String::toUpperCase);

        // 3. Sorted
        Stream<String> sortedStream = list.stream().sorted();
        Stream<String> sortedStreamUsingComparator = list.stream().sorted((a, b) -> a.length() - b.length());

        // 4. Distinct | Unique | No duplicates
        System.out.println(list.stream().filter(x -> x.startsWith("A")).distinct().count());

        // 5. limit
        System.out.println(Stream.iterate(1, x -> x + 2).limit(100).count());

        // 6. skip
        System.out.println(Stream.iterate(1, x -> x + 2).skip(10).limit(100).count());

        // Both count 100 but different is 5. limit -> 1to100 --> count100
        //                                 6. skip(10) -> 11to110 --> count100

    }
}
