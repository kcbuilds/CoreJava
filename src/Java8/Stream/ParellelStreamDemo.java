package Java8.Stream;

import java.util.List;
import java.util.stream.Stream;

public class ParellelStreamDemo {
    public static void main(String[] args) {
        // A type of stream that enables parallel processing of element
        // Allowing multiple threads to process parts of the stream simultaneously
        // This can significantly improve performance for large datasets
        // workload is distributed across multiple thread

        long l = System.currentTimeMillis();
        List<Integer> list = Stream.iterate(1, x -> x + 1).limit(20000).toList();
        List<Long> list1 = list.stream().map(ParellelStreamDemo::factorial).toList();
        long l1 = System.currentTimeMillis();
        System.out.println(l1 - l);


    }

    private static long factorial(int n) {
        long result = 1;
        for (int i = 2; i <= 2; i++) {

        }
    }
}
