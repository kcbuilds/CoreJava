package Java8.Stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamDemo {
    public static void main(String[] args) {

        // features introduced in Java8
        // Process collection of data in a functional and declarative manner
        // Simplify data processing
        // Embrace functional programming
        // Improve Readability and Maintainability
        // Enable easy parallelism

        // How to use Stream?
        //Source, Intermediate operations & terminal operation

        // What is Stream?
        // A sequence of elements supporting functional and declarative programming


        List<Integer> list = Arrays.asList(2,4,3,5,8);

        // If total count of Even Number using tradition way
        int count = 0;
        for (int i : list){
            if (i % 2 == 0){
                count++;
            }
        }
        System.out.println(count);



        // If total count of Even Number using Stream
        System.out.println(list.stream().filter(x -> x % 2 == 0).count());
//                          |      |                               |
//                        Source   Intermediate operations    terminal operation


        // Creating Streams -->

        // 1. Collections
        List<Integer> list1 = Arrays.asList(2,4,3,5,8);
        Stream<Integer> stream = list1.stream();

        //2. Arrays
        String[] array = {"a", "b", "c"};
        Stream<String> stream1 = Arrays.stream(array);

        //3. Stream.of()
        Stream<Integer> integerStream = Stream.of(1, 2, 3, 4, 5);

        //4. Infinite Stream
        Stream<Integer> generate = Stream.generate(() -> 1); //infinite
        Stream<Integer> limit = Stream.iterate(1, x -> x + 1).limit(100); // set limit


    }
}
