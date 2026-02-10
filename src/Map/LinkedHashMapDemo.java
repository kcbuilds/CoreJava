package Map;


import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapDemo {
    public static void main(String[] args) {
        LinkedHashMap<String, Integer> fruit = new LinkedHashMap<>(10,0.3f,true);
        fruit.put("Mango" ,10);
        fruit.put("Apple", 20);
        fruit.put("Orange", 30);

        fruit.get("Apple");

        for (Map.Entry<String, Integer> entry : fruit.entrySet()){
            System.out.println(entry.getKey() +": " +entry.getValue());
        }

        HashMap<String, Integer> hashMap = new HashMap<>();
        LinkedHashMap linkedHashMap = new LinkedHashMap(hashMap);

        hashMap.put("Shubham",91);
        hashMap.put("Bob",95);
        hashMap.put("Prem",80);

        System.out.println(hashMap);

        Integer prem = hashMap.getOrDefault("Prem", 0);
        System.out.println(prem);

        hashMap.putIfAbsent("Prem",90);  // Add only when same key not present
        System.out.println(hashMap);

    }
}
