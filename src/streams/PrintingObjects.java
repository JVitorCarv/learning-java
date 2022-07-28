package streams;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

public class PrintingObjects {
    public static void main(String[] args) {
        List<String> approved = Arrays.asList("Martin", "Kent", "Robert");

        System.out.println("Using foreach...");
        for (String name: approved) {
            System.out.println(name);
        }

        System.out.println("\nUsing iterator...");
        Iterator<String> iterator = approved.iterator();
        while(iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        System.out.println("\nUsing stream...");
        Stream<String> stream =  approved.stream();
        stream.forEach(System.out::println);
    }
}
