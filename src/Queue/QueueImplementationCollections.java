package Queue;

import java.util.LinkedList;
import java.util.Queue;

public class QueueImplementationCollections {



    public static void main(String[] args) {

        Queue<Integer> queue = new LinkedList<>();

        queue.offer(10) ;
        System.out.println(queue.size());
        queue.poll();
        System.out.println(queue.size());
        System.out.println(queue.peek());
        System.out.println(queue.poll());

    }
}
