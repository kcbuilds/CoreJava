package CollectionFramework;

import java.util.Arrays;
import java.util.LinkedList;

public class LinkedListCode {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);

        linkedList.get(1); // 0(n)

        linkedList.addFirst(0);  // 0(1)
        linkedList.addLast(4);   // 0(1)

        linkedList.getFirst(); // 0(1)
        linkedList.getLast();  // 0(n)

        System.out.println(linkedList);

//       linkedList.removeIf(x -> x % 2 == 0);
//       linkedList.remove(2);
        System.out.println(linkedList);

        LinkedList<String> animals = new LinkedList<>(Arrays.asList("Dog","Cow","Lion","Tiger"));
        LinkedList<String> animalsToRemove = new LinkedList<>(Arrays.asList("Dog","Lion"));
        animals.removeAll(animalsToRemove);

        System.out.println(animals);

    }
}
