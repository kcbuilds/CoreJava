package Map;

import java.util.HashMap;

public class HashmapPractice {
    public static void main(String[] args) {
        HashMap<Integer, String> hashMap = new HashMap<>();
        hashMap.put(01,"Karan");
        hashMap.put(02,"Deepak");
        hashMap.put(03,"Prem");

        System.out.println(hashMap);
        System.out.println(hashMap.get(02));
        hashMap.remove(03);

        System.out.println(hashMap.size());


//        Login Attempt Tracker

        HashMap<String, Integer> attempts = new HashMap<>();
        String user = "karan";

        attempts.put(user, attempts.getOrDefault(user,0)+1);

        System.out.println(attempts);


    }
}
