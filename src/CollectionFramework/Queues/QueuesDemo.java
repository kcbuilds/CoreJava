package CollectionFramework.Queues;

import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class QueuesDemo {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        System.out.println(queue.size());

        // Remove Method
//      System.out.println(queue.remove()); // throws exception if empty
        System.out.println(queue.poll()); // return null if empty

        // Peek Method
//      System.out.println(queue.element()); // throws exception if empty
        System.out.println(queue.peek());  // return null if empty

        Queue<Integer> queue1 = new ArrayBlockingQueue<>(2);
        System.out.println(queue1.add(1));
        System.out.println(queue1.offer(2));

//      System.out.println(queue1.add(3));  // throws exception because Full Queue
        System.out.println(queue1.offer(4));
    }
}
