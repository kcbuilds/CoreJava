package CollectionFramework.ArrayList;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteArrayListCode {
    public static void main(String[] args) {
        List<String> shoppingList = new CopyOnWriteArrayList<>();
        shoppingList.add("Milk");
        shoppingList.add("Eggs");
        shoppingList.add("Bread");
        System.out.println(shoppingList);

        for (String item : shoppingList){
            System.out.println(item);
            // Try to modify the list while reading
            if (item.equals("Eggs")){
                shoppingList.add("Butter");
                System.out.println("Butter added");
            }
        }

        System.out.println(shoppingList);


    }
}
