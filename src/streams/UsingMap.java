package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class UsingMap {
    public static void main(String[] args) {
        Consumer<String> print = System.out::print;

        List<String> brands = Arrays.asList("BMW ", "Audi ", "Honda \n");

        brands.stream()
                .map(String::toUpperCase)
                .forEach(print);

        UnaryOperator<String> uppercase = String::toUpperCase;
        Function<String, Character> firstChar = string -> string.charAt(0);
        Consumer<Character> printResult = System.out::println;

        brands.stream()
                .map(uppercase)
                .map(firstChar)
                .forEach(printResult);
    }
}
