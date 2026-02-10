package Map;

import java.util.NavigableMap;
import java.util.SortedMap;
import java.util.TreeMap;

public class SortedMapDemo {
    public static void main(String[] args) {
      SortedMap<Integer, String> map = new TreeMap<>(); //AscendingOrder
//        SortedMap<Integer, String> map = new TreeMap<>((a,b) -> (b-a)); //DescendingOrder
        map.put(01,"Karan");
        map.put(03,"Prem");
        map.put(02,"Deepak");
//      map.put(null,"Amar"); NullPointerException

        System.out.println(map);
        System.out.println(map.firstKey());
        System.out.println(map.lastKey());
        System.out.println(map.headMap(02 ));
        System.out.println(map.subMap(01,02));
        System.out.println(map.tailMap(02));

        NavigableMap<Integer,String> map1 = new TreeMap<>();
        map1.put(35,"Prem");
        map1.put(95,"Karan");
        map1.put(80,"Deepak");
        map1.put(50,"Ritesh");

        System.out.println(map1);
        System.out.println(map1.lowerEntry(45));
        System.out.println(map1.lastKey());




    }
}
