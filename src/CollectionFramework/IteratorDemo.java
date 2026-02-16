package CollectionFramework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class IteratorDemo {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5);

        for (int i : list){
            System.out.println(i);
        }

        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        for (int i : list){
            if (i % 2 == 0){
          //      list.remove(i);      // UnsupportedOperationException -> Solution use CopyonWriteArraylist and iterator
            }
        }

        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);

        Iterator<Integer> itr = numbers.iterator();
        while (itr.hasNext()){
            Integer number = itr.next();
            if (number % 2 == 0){
                itr.remove();
            }
        }

        System.out.println(numbers);
    }
}
