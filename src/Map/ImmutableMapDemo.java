package Map;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class ImmutableMapDemo {
    public static void main(String[] args) {
        Map<String, Integer> map1 = new HashMap<>();
        map1.put("Shubham",97);
        map1.put("Ram",95);

        Map<String, Integer> map = Collections.unmodifiableMap(map1);
        // ImmutableMap it can not be change
//      map.put("Karan", 99); // throws UnsupportedOperationException
        map1.put("Deepak",26); // Now both map are change, this is drawback of Collections.unmodifiableMap(map1)

        // Java 9
        Map<String, Integer> map3 = Map.of("Shubham", 97, "Ram", 95); //Only take 10element
        Map<String, Integer> map2 = Map.ofEntries(Map.entry("Ram", 95), Map.entry("Deepak", 95)); //Take unlimited element


    }
}
