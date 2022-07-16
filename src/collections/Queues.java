package collections;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.LinkedList;
import java.util.NoSuchElementException;
import java.util.Queue;

public class Queues {
    @Test
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
        queue.add("Anna");
        queue.offer("Bia"); // For queues with restricted sizes
        queue.add("Paul");
        queue.offer("Andy");
        queue.add("Martin");

        System.out.println(queue.peek()); // Return null if queue empty
        System.out.println(queue.element()); // Raises exception if queue empty

        System.out.println(queue.size());

        System.out.println("== POLL ==");
        for (int i = 0; i < 3; i++ ){
            System.out.println(queue.poll());
        }
        System.out.println("====");

        System.out.println(queue.remove()); // Raises exception if queue empty

        System.out.println(queue.peek());

        // But what if the queue is empty?
        System.out.println("Clearing queue...");
        queue.clear();

        System.out.println(queue.peek());

        // Yes, I know I shouldn't use assertions like this
        Assertions.assertThrows(NoSuchElementException.class, () -> {
            queue.element();
        });
        Assertions.assertThrows(NoSuchElementException.class, () -> {
            queue.remove();
        });

        System.out.println(queue.isEmpty());
        queue.add("Kent");
        System.out.println(queue.contains("Kent"));

    }
}
