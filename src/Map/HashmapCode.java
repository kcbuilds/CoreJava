package Map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashmapCode {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(01, "Karan");
        map.put(05, "Deepak");
        map.put(03, "Prem");

        System.out.println(map);

        System.out.println(map.get(01));
        System.out.println(map.containsKey(03));
        System.out.println(map.containsValue("Prem"));

        for (int i : map.keySet()){
            System.out.println(map.get(i));
        }

        Set<Map.Entry<Integer, String>> entries = map.entrySet();
        for (Map.Entry<Integer, String> entry : entries){
//            System.out.println(entry.getKey() +" : "+ entry.getValue());
            entry.setValue(entry.getValue().toUpperCase());
        }
        System.out.println(map);

        map.put(null, "Viru");
        map.put(1, "Om"); // Replace Key 1 value
        System.out.println(map);

//        map.remove(01);
        boolean res = map.remove(01, "Prem"); //check both before remove
        System.out.println(res);
        System.out.println(map);

    }
}
