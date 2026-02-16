package CollectionFramework.Queues;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;

public class DequeDemo {
    public static void main(String[] args) {
        // double-ended queue
        // allows insertion and removal of elements from both ends
        // versatile than regular queues and stacks because they support all the operations of both

         /*
           INSERTION METHODS

           addFirst(E e): Inserts the specified element at the front.
           addLast(E e): Inserts the specified element at the end.
           offerFirst(E e): Inserts the specified element at the front if possible.
           offerLast(E e): Inserts the specified element at the end if possible.
           */


            /*
           REMOVAL METHODS

            removeFirst(): Retrieves and removes the first element.
            removeLast(): Retrieves and removes the last element.
            pollFirst(): Retrieves and removes the first element, or returns null if empty.
            pollLast(): Retrieves and removes the last element, or returns null if empty.
           */


           /*
             EXAMINATION METHODS

            getFirst(): Retrieves, but does not remove, the first element.
            getLast(): Retrieves, but does not remove, the last element.
            peekFirst(): Retrieves, but does not remove, the first element, or returns null if empty.
            peekLast(): Retrieves, but does not remove, the last element, or returns null if empty.
           */

            /*
           STACK METHODS

            push(E e): Adds an element at the front (equivalent to addFirst(E e)).
            pop(): Removes and returns the first element (equivalent to removeFirst())..
           */

        Deque<Integer> deque1 = new ArrayDeque<>();
//         -> faster iteration
//         -> low memory
//         -> no null allowed
//         -> after remove, does not need to shift element
//         -> because circular means head and tail, just shift head and tail

        deque1.addFirst(10);
        deque1.addLast(20);
        deque1.offerFirst(5);
        deque1.offerLast(25);
        // 5, 10, 20, 25

        System.out.println(deque1);
        System.out.println(STR."First Element: " +deque1.getFirst()); //Output 5
        System.out.println(STR."Last Element: " +deque1.getLast()); //Output 25

        deque1.removeLast();
        deque1.pollFirst();

        for (int num : deque1){
            System.out.print(num +" ");
        }


        Deque<Integer> deque2 = new LinkedList<>();
//      -> insertion, deletion somewhere in middle



    }
}
