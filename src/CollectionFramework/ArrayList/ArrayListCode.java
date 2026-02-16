package CollectionFramework.ArrayList;

import java.util.ArrayList;

public class ArrayListCode {
    public static void main(String[] args) {
      /*  ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(20);
        list.add(36);  // add element to array
        System.out.println(list.get(2)); // To get value
        System.out.println(list.size()); // Get a size

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        for (int x : list){
            System.out.println(x);
        }

        System.out.println(list.contains(5)); // Check if value present
        System.out.println(list.contains(20));

        list.remove(1); //remove element
        for (int x : list){
            System.out.println(x);
        }

        list.add(2,30); // add element anywhere without loose other
        for (int x : list){
            System.out.println(x);
        }

        list.set(1,500); // add element with replace that element
        for (int x : list){
            System.out.println(x);
        }

        ArrayList<Integer> listOne = new ArrayList<>(50);
        System.out.println(listOne.size());
        listOne.add(1);
        System.out.println(listOne.size());

        List<String> list1 = Arrays.asList("Monday", "Tuesday");
        list1.set(1,"Wednesday");  // Only replace allow

        List<String> list4 = new ArrayList<>(list1);
        list4.add("Thursday");
        System.out.println(list4   );

        Integer[] array = {2,4,3};
        List<Integer> list2 = Arrays.asList(array);
        list2.set(1,50);
        System.out.println(list2.get(1));



        List<Integer> integers = List.of(1, 2, 3);
//      integers.set(1,50); --- set/add not allow


       */

        ArrayList<String> names = new ArrayList<>();
        names.add("Amit");
        names.add("Ravi");
        names.add("Neha");

        names.remove("Ravi");
        System.out.println(names);


    }
}
