package CollectionFramework;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Vector;

public class VectorCode {
    public static void main(String[] args) {
//        Vector<Integer> vector = new Vector<>();
        Vector<Integer> vector = new Vector<>(11,4);
        System.out.println(vector.capacity());
        vector.add(1);
        vector.add(2);
        vector.add(3);
        vector.add(4);

        System.out.println(vector);

        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("A");
        linkedList.add("B");
        linkedList.add("C");

        Vector<String> strings = new Vector<>(linkedList);
        System.out.println(strings);

        // Arraylist Vs Vector

//      ArrayList<Integer> arrayList = new ArrayList<>(); // NonSynchronization
        Vector<Integer> arrayList = new Vector<>();   // Synchronization
        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                arrayList.add(i);
            }
        });

        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                arrayList.add(i);
            }
        });

        t1.start();
        t2.start();
        try{
            t1.join();
            t2.join();
        }catch (InterruptedException e){
            e.printStackTrace();
        }

        System.out.println(arrayList.size());


    }
}
