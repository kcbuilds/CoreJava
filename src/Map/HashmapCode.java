package Map;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

class Student{
    private int ID;
    private String name;

    public Student(int id, String name){
        this.ID = id;
        this.name = name;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    @Override
    public int hashCode() {
        return Objects.hash(ID, name );
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj){
            return true;
        }
        if (obj == null){
            return false;
        }
        if (getClass() != obj.getClass()){
            return false;
        }
        Student other = (Student) obj;
        return ID == other.getID() && Objects.equals(name, other.getName());
    }
}


public class HashmapCode {
    public static void main(String[] args) {
//        HashMap<Integer, String> map = new HashMap<>();
//        map.put(01, "Karan");
//        map.put(05, "Deepak");
//        map.put(03, "Prem");
//
//        System.out.println(map);
//
//        System.out.println(map.get(01));
//        System.out.println(map.containsKey(03));
//        System.out.println(map.containsValue("Prem"));
//
//        for (int i : map.keySet()){
//            System.out.println(map.get(i));
//        }
//
//        Set<Map.Entry<Integer, String>> entries = map.entrySet();
//        for (Map.Entry<Integer, String> entry : entries){
//          System.out.println(entry.getKey() +" : "+ entry.getValue());
//            entry.setValue(entry.getValue().toUpperCase());
//        }
//        System.out.println(map);
//
//        map.put(null, "Viru");
//        map.put(1, "Om"); // Replace Key 1 value
//        System.out.println(map);
//
//    map.remove(01);
//        boolean res = map.remove(01, "Prem"); //check both before remove
//        System.out.println(res);
//        System.out.println(map);

        HashMap<Student,Integer> hashMap = new HashMap<>();
        Student s1 = new Student(01,"Deepak G.");
        Student s2 = new Student(02,"Karan C.");
        Student s3 = new Student(01,"Deepak G."); // Store in different Memory

        hashMap.put(s1,90); // Hashcode1 --> index1
        hashMap.put(s2,70); // Hashcode2 --> index2
        hashMap.put(s3,85); // Hashcode3 --> index3

        System.out.println(hashMap.size());
        System.out.println(hashMap.get(s1));
        System.out.println(hashMap.get(s3));
//        System.out.println(s1);


        HashMap<String, Integer> hashMap1 = new HashMap<>();
        hashMap1.put("Deepak", 90); // Hashcode1 --> index1
        hashMap1.put("Prem", 80); // Hashcode2 --> index2
        hashMap1.put("Deepak", 95); // Hashcode1 --> index1 --> equals() --> replace

        System.out.println(hashMap1.size());
        System.out.println(hashMap1.get("Deepak"));
        System.out.println(hashMap1.get("Deepak"));

    }
}
