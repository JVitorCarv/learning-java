package streams;

import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;
import java.util.Arrays;

public class CreatingStreams {
    public static void main(String[] args) {
        Consumer<String> print = System.out::print;
        Stream<String> langs = Stream.of("Java ", "Lua ", "JS\n");
        langs.forEach(print);

        String[] moreLangs = { "Python ", "Lisp ", "Perl ", "Go\n" };
        Stream.of(moreLangs).forEach(print);
        Arrays.stream(moreLangs).forEach(print);
        Arrays.stream(moreLangs, 1, 3).forEach(print);

        List<String> anotherLangs = Arrays.asList("C ", "PHP ", "Kotlin ");
        anotherLangs.stream().forEach(print);
        System.out.println();
        anotherLangs.parallelStream().forEach(print);

        // Infinite streams
        //Stream.generate(() -> "a").forEach(print);
        //Stream.iterate(0, n -> n+1).forEach(print);
    }
}
