package Interview_prep_2025;

import java.util.PriorityQueue;
import java.util.Queue;

public class Queue_1 {
    public static void main(String[] args) {
        Queue queue = new PriorityQueue();
        queue.add(1);
        queue.add(2);
        queue.add(3);
        System.out.println(queue);
        System.out.println(queue.peek());
        System.out.println(queue.poll());
        System.out.println(queue.isEmpty());
        System.out.println(queue.remove(2));
    }
}
