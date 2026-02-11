package Map;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;


public class HashtableDemo {
    public static void main(String[] args) {
        Hashtable<Integer, String> hashtable = new Hashtable<>();
        hashtable.put(01,"Karan");
        hashtable.put(02,"Deepak");
        hashtable.put(03,"Prem");

//        System.out.println(hashtable);
//
//        System.out.println(hashtable.contains("Prem"));
//        System.out.println(hashtable.containsKey(02));
//        System.out.println(hashtable.get(01));
//
//        for (Map.Entry<Integer, String> i : hashtable.entrySet()){
//            System.out.print(i.getValue() + i.getKey());
//        }

//       HashMap<Integer, String> hashMap = new HashMap<>(); No Thread-safe
       Hashtable<Integer, String> hashMap = new Hashtable<>(); // Thread-safe
        Thread thread1 = new Thread(()->{
            for (int i = 0; i < 1000; i++) {
                hashMap.put(i, "Thread1");
            }
        });
        Thread thread2 = new Thread(() ->{
                for (int i = 1000; i < 2000; i++) {
                    hashMap.put(i, "Thread2");
                }
        });

        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        }catch (InterruptedException e){
            e.printStackTrace();
        }

        System.out.println(hashMap.size());
    }
}
