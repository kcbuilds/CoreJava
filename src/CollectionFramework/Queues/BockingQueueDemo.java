package CollectionFramework.Queues;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class BockingQueueDemo {

    class  Producer implements Runnable{

        private BlockingQueue<Integer> queue;
        private int value = 0;

        public Producer(BlockingQueue<Integer> queue) {
            this.queue = queue;
        }


        @Override
        public void run() {
            while (true){
                try {
                    System.out.println(STR."Producer produced: \{value}");
                    queue.put(value++);
                    Thread.sleep(1000);

                } catch (Exception e) {
                    Thread.currentThread().interrupt();
                    System.out.println("Producer interrupted");
                }
   
            }
        }
    }

    class Consumer implements Runnable{

        private BlockingQueue<Integer> queue;
        private int value = 0;

        public Consumer(BlockingQueue<Integer> queue) {
            this.queue = queue;
        }


        @Override
        public void run() {
            while (true){
                try {
                    Integer value = queue.take();
                    System.out.println(STR."Consumer produced: \{value}");
                    queue.put(value);
                    Thread.sleep(2000);

                } catch (Exception e) {
                    Thread.currentThread().interrupt();
                    System.out.println("Consumer interrupted");
                }
            }

        }
    }


    public void main(String[] args) {
        BlockingQueue<Integer> queue = new ArrayBlockingQueue<>(5);

        Thread producer = new Thread(new Producer(queue));
        Thread consumer = new Thread(new Consumer(queue));

        producer.start();
        consumer.start();

    }
}
