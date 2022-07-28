package streams;

import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class ChallengeMap {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);

        UnaryOperator<String> invertString = (binaryString) -> {
            StringBuilder stringBuilder = new StringBuilder(binaryString);
            return stringBuilder.reverse().toString();
        };

        Function<String, Integer> binaryStringToInt = string -> Integer.parseInt(string, 2);

        numbers.stream()
                .map(Integer::toBinaryString)
                .map(invertString)
                .map(binaryStringToInt)
                .forEach(System.out::println);
    }
}
