package Sets;

import com.sun.source.tree.SynchronizedTree;

import java.util.*;
import java.util.concurrent.ConcurrentSkipListSet;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;

public class SetsDemo {
    public static void main(String[] args) {
        // Set is a collection that cannot contain duplicate element
        // Faster operation
        // Map --> HashMap, LinkedHashMap, TreeMap, EnumMap
        // Set --> HashSet, LinkedHashSet, TreeSet, EnumSet  --> Not a Thread-safe

//      Set<Integer> setList = new HashSet<>(); // UnOrderSet
//      Set<Integer> setList = new LinkedHashSet<>(); // OrderSet
        NavigableSet<Integer> setList = new TreeSet<>(); // SortedSet
        setList.add(1);
        setList.add(4);
        setList.add(1);
        setList.add(3);

        System.out.println(setList);

//      for thread safe
        Set<Integer> synchronizedSet = Collections.synchronizedSet(setList);  // Don't use this

//      Use this ConcurrentSkipListSet --> Thread-safe
//      ConcurrentSkipListSet<Integer> skipListSet = new ConcurrentSkipListSet<>();
        NavigableSet<Integer> skipListSet = new ConcurrentSkipListSet<>();

//      Unmodifiable
        Set<Integer> UnmodifiableSet = Set.of(1, 2, 5, 6, 4, 3, 9);  // IllegalArgumentException --> Duplicate value present
        Set<Object> UnmodifiableSet1 = Collections.unmodifiableSet(setList);

//      Enum Set
        EnumSet<EnumDay> days = EnumSet.of(EnumDay.Monday, EnumDay.TuesDay, EnumDay.Wednesday);
        days.add(EnumDay.Thursday);
        System.out.println(days.contains(EnumDay.Monday));

//      CopyOnWriteArraySet -->  Thread-safe
//                               Copy-On-Write mechanism --> Don't update on original array,
//                                                           update in copyarray and merge it,
//                                                           when original array are free

        CopyOnWriteArraySet<Integer> copyOnWriteArraySet = new CopyOnWriteArraySet<>();
        // --> If read intensive > write than use copyOnWriteArraySet
        //     if write > read than har write mein ek copy banegi toh memory jada use hoga
        //     Agar hame iterate karni he toh hame stability chahiye to use karenge

        ConcurrentSkipListSet<Integer> concurrentSkipListSet = new ConcurrentSkipListSet<>();
        // --> frequent read and write hai toh use concurrentSkipListSet because it's have balance

        for (int i = 1; i <= 5; i++) {
            copyOnWriteArraySet.add(i);
            concurrentSkipListSet.add(i);
        }

        System.out.println(STR."Initial copyOnWriteArraySet: \{copyOnWriteArraySet}");
        System.out.println(STR."Initial concurrentSkipListSet: \{concurrentSkipListSet}");

        System.out.println("Iterating and modifying CopyOnWriteArraySet: ");
        for (Integer num : copyOnWriteArraySet){
            System.out.println(STR."Reading from CopyOnWriteArraySet: \{num}");
            copyOnWriteArraySet.add(6);
        }
        System.out.println(copyOnWriteArraySet);

        System.out.println("Iterating and modifying concurrentSkipListSet: ");
        for (Integer num : concurrentSkipListSet){
            System.out.println(STR."Reading from concurrentSkipListSet: \{num}");
            concurrentSkipListSet.add(6);
        } // --> [1,2,3,4,5,6] - concurrentSkipListSet add(6) as reading
//                               this is weakly consistently because we don't he add(6) or not.(Unpredictable)

    }

    public enum EnumDay{
        Monday, TuesDay, Wednesday, Thursday,
    }

}
