package CollectionFramework;

import java.util.List;
import java.util.Vector;

public class VectorPractice {
    public static void main(String[] args) {
        Vector<String> v  = new Vector<>();
        v.add("Java");
        v.add("Spring");
        v.add("Database");

        System.out.println(v);

        v.remove(2);
        System.out.println(v);
    }
}
