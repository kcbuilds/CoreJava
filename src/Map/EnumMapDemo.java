package Map;

import java.util.EnumMap;

public class EnumMapDemo {
    public static void main(String[] args) {
        EnumMap<Day, String> enumMap = new EnumMap<>(Day.class);
        enumMap.put(Day.Monday, "Chest & Shouder");
        enumMap.put(Day.Tuesday, "Back");

        System.out.println(enumMap.get(Day.Monday));

        // Array size same as enum element
        // No hashing
        // ordinal is used
        // Faster than Hashmap
        // Memory Efficient
    }
}

enum Day{
    Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday
}

