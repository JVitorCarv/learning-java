package collections;

import java.util.ArrayDeque;
import java.util.Deque;

public class Stacks {
    public static void main(String[] args) {
        Deque<String> books = new ArrayDeque<>();
        books.add("The Pragmatic Programmer");
        books.push("Refactoring: Improving the Design of Existing Code");
        books.push("Clean Code");

        System.out.println(books.peek());
        System.out.println(books.element());

        System.out.println(books.poll());
        System.out.println(books.pop()); // Raises exception
    }
}
