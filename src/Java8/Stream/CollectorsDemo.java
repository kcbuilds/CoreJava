package Java8.Stream;

import java.util.*;
import java.util.stream.Collectors;

public class CollectorsDemo {
    public static void main(String[] args) {

        // Collectors is a utility class
        // Provides a set of methods to create common collectors

        //1. Collecting to a List
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie");
        List<String> res = names.stream()
                .filter(name -> name.startsWith("A"))
                .collect(Collectors.toList());

        System.out.println(res);

        //2. Collecting to a Sets
        List<Integer> list = Arrays.asList(1, 2, 2, 5, 5, 6, 7, 8);
        Set<Integer> collect = list.stream().collect(Collectors.toSet());
        System.out.println(collect);

        //3. Collecting to a specific collection
        ArrayList<String> col = names.stream().collect(Collectors.toCollection(() -> new ArrayList<>()));

        //4. Joining Strings
        String concatString = names.stream().map(String::toUpperCase).collect(Collectors.joining(", "));
        System.out.println(concatString);

        //5. Summarizing Data
        // Generates statistical summary (count, sum, min/max, average)
        List<Integer> integerList = Arrays.asList(2, 9, 6, 5, 4);
        IntSummaryStatistics collectTerminal = integerList.stream().collect(Collectors.summarizingInt(x -> x));
        System.out.println(STR."Count: \{collectTerminal.getCount()}");
        System.out.println("Sum: " +collectTerminal.getSum());
        System.out.println("Min: " +collectTerminal.getMin());
        System.out.println("Average: " +collectTerminal.getAverage());
        System.out.println("Max: " +collectTerminal.getMax());

        //6. Collecting the particular separately
        Double average = integerList.stream().collect(Collectors.averagingInt(x -> x));
        System.out.println("Average: " +average);

        Long counting = integerList.stream().collect(Collectors.counting());
//      Long counting = integerList.stream().count();
        System.out.println(counting);

        //7. Grouping Element
        List<String> words = Arrays.asList("hello", "world", "java", "stream", "Collecting");
        System.out.println(words.stream().collect(Collectors.groupingBy(x -> x.length())));
        System.out.println(words.stream().collect(Collectors.groupingBy(String::length, Collectors.joining(" "))));
        TreeMap<Integer, Long> collect1 = words.stream().collect(Collectors.groupingBy(String::length, TreeMap::new, Collectors.counting()));
        System.out.println(collect1);

        //8. Partitioning Elements
        // Partitions elements into two groups (true and false) based on a predicate
        System.out.println(words.stream().collect(Collectors.partitioningBy(x -> x.length() > 5)));

        //9. Mapping and Collecting
        // Applies a mapping function before collecting
        System.out.println(words.stream().collect(Collectors.mapping(x -> x.toUpperCase(), Collectors.toList())));

        //Example 1 - Collecting Names by length
        List<String> list1 = Arrays.asList("Anna", "Bob", "Alexander", "Brian", "Alice");
//      System.out.println(list1.stream().filter(x -> x.length() > 3).toList());
        System.out.println(list1.stream().collect(Collectors.groupingBy(String::length)));

        //Example 2 - Counting word occurrences
        String sentences = "hello world world hello hello world java";
        System.out.println(Arrays.stream(sentences.split(" ")).collect(Collectors.groupingBy(x -> x, Collectors.counting())));

        //Example 3 - Partitioning Even and Odd Numbers
        System.out.println(integerList.stream().collect(Collectors.partitioningBy(x -> x % 2 == 0)));

        //Example 4 -
        Map<String, Integer> items = new HashMap<>();
        items.put("Apple", 10);
        items.put("Banana", 20);
        items.put("Orange", 15);

        System.out.println(items.values().stream().reduce(Integer::sum).get());
        System.out.println(items.values().stream().collect(Collectors.summingInt(x -> x)));

        //Example 5 - Creating a Map from Stream Elements
        List<String> list2 = Arrays.asList("Apple", "Banana", "cherry");
        System.out.println(list2.stream().collect(Collectors.toMap(x -> x, String::length)));

        // Example 6
        System.out.println(Arrays.stream(sentences.split(" ")).collect(Collectors.toMap(x -> x, v -> 1, (x,y) -> x+y)));

    }
}
