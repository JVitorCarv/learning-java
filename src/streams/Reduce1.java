package streams;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BinaryOperator;

public class Reduce1 {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            numbers.add(i);
        }

        BinaryOperator<Integer> sum = (ac, n) -> ac + n;
        int total = numbers.stream().reduce(sum).get();
        System.out.println(total);

        Integer total2 = numbers.parallelStream().reduce(100, sum);
        System.out.println(total2);

        Integer total3 = numbers.stream().reduce(100, sum);
        System.out.println(total3);

        numbers.stream()
                .filter(n -> n > 5)
                .reduce(sum)
                .ifPresent(System.out::println);

    }
}
