package CollectionFramework;

import java.util.LinkedList;

public class LinkedlistPractice {
    public static void main(String[] args) {
        LinkedList<String> tasks = new LinkedList<>();

        tasks.add("Login");
        tasks.add("Fetch Data");
        tasks.add("Process");
        tasks.addFirst("Start");
        tasks.addLast("End");

        System.out.println(tasks);

        tasks.removeFirst();
        tasks.removeLast();
        tasks.remove("Process");

        System.out.println(tasks);


        LinkedList<String> pages = new LinkedList<>();
        pages.add("Google");
        pages.add("Youtube");
        pages.add("Github");

        System.out.println(pages);

        System.out.println("Removed: " +pages.removeLast());
        System.out.println(pages);

        pages.addFirst("Home");
        pages.addLast("Instagram");
        System.out.println(pages);



    }
}
