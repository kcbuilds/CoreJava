package CollectionFramework.Queues;

import java.util.PriorityQueue;

public class PriorityQueueDemo {
    public static void main(String[] args) {
        // part of the Queue Interface
        // orders elements based on their natural ordering (for primitives lowest first)
        // custom comparator for customised ordering
        // does not allow null elements

        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
//        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>((x,y) -> x - y);
        priorityQueue.add(15);
        priorityQueue.add(10);
        priorityQueue.add(30);
        priorityQueue.add(5);

        System.out.println(priorityQueue);  // not sorted

        while (!priorityQueue.isEmpty()){
            System.out.println(priorityQueue.poll());
        }

        // Internal Working
//      --> PriorityQueue is implemented as a min-heap by default (for natural ordering)


    }
}
