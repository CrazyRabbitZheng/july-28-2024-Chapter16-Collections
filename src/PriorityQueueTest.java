/**
 * This class creates a PriorityQueue that stores Doubles with an initial capacity of 11 elements
 * according to the objects' natural order.
 * The question 16.18 is to rewrite the code so that it orders in descending order. --- Done
 * @author--Zheng Wang
 */
import java.util.Collections;
import java.util.PriorityQueue;

public class PriorityQueueTest {
    public static void main(String[] args) {
//        PriorityQueue<Double> queue = new PriorityQueue<>();
//
//        queue.offer(3.2);
//        queue.offer(9.8);
//        queue.offer(5.4);
//
//        System.out.print("Polling from queue: ");
//
//        while (queue.size() > 0) {
//            System.out.printf("%.1f ", queue.peek());
//            queue.poll();
//        }//this outputs Polling from queue: 3.2 5.4 9.8
        PriorityQueue<Double> queue = new PriorityQueue<>(Collections.reverseOrder());

        queue.offer(3.2);
        queue.offer(9.8);
        queue.offer(5.4);

        System.out.print("Polling from queue: ");

        while (queue.size() > 0) {
            System.out.printf("%.1f ", queue.peek());
            queue.poll();
        }//This outputs Polling from queue: 9.8 5.4 3.2
    }
}
