package Java8.Stream;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Stream;

public class ParellelStreamDemo {
    public static void main(String[] args) {
        // A type of stream that enables parallel processing of element
        // Allowing multiple threads to process parts of the stream simultaneously
        // This can significantly improve performance for large datasets
        // workload is distributed across multiple thread

        long start = System.currentTimeMillis();
        List<Integer> list = Stream.iterate(1, x -> x + 1).limit(20000).toList();
        List<Long> list1 = list.stream().map(ParellelStreamDemo::factorial).toList();
        long end = System.currentTimeMillis();
        System.out.println("Time taken with sequential stream: " +(end - start) +"ms");

        long startTime = System.currentTimeMillis();
        List<Long> list3 = list.parallelStream().map(ParellelStreamDemo::factorial).toList();
//        List<Long> list3 = list.parallelStream().map(ParellelStreamDemo::factorial).sequential().toList(); // Parallelstream --> stream
        long endTime = System.currentTimeMillis();
        System.out.println(STR."Time taken with parallel stream: \{endTime - startTime}ms");

        // Parallel streams are most effective for CPU-intensive
        // large datasets where tasks are independent
        // They may add overhead for simple tasks or small datasets

        //Cumulative Sum
        // [1,2,3,4,5] -> [1,3,6,10,15]
        List<Integer> list2 = Arrays.asList(1,2,3,4,5);
        AtomicInteger sum = new AtomicInteger(0);
        List<Integer> cumulativesum = list2.parallelStream().map(x -> sum.addAndGet(x)).toList();
        System.out.println(cumulativesum);


    }


    private static long factorial(int n) {
        long result = 1;
        for (int i = 2; i <= 2; i++) {
            result = result * i;
        }

        return result;
    }
}
