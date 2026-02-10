package Map;

import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Map;

public class IdentityHashMapDemo {
    public static void main(String[] args) {

        String key3 = "key";
        String key4 = "key";
        Map<String,Integer> map = new HashMap<>();  // Hashcode and equals
        Map<String,Integer> map1 = new IdentityHashMap<>();  // IdentityHashcode and ==

        map.put(key3,1);
        map.put(key4,2);
        System.out.println(map);

        map1.put(key3,1);
        map1.put(key4,2);
        System.out.println(map1);

        String key1 = new String("key");
        String key2 = new String("key");

        Map<String,Integer> map3 = new HashMap<>();  // Hashcode and equals
        Map<String,Integer> map4 = new IdentityHashMap<>();  // IdentityHashcode and ==

        map3.put(key1,1);
        map3.put(key2,2);
        System.out.println(map3);

        map4.put(key1,1);
        map4.put(key2,2);
        System.out.println(map4);

//        System.out.println(key1.hashCode());
//        System.out.println(key2.hashCode());
//        System.out.println(System.identityHashCode(key1));
//        System.out.println(System.identityHashCode(key2));
    }
}
