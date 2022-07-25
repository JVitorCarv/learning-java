package lambdas;


import java.util.function.Function;

public class UsingFunction {
    public static void main(String[] args) {
        Function<Integer, String> evenOrOdd = (number) -> number % 2 == 0 ? "Even" : "Odd";

        String result = evenOrOdd.apply(10);
        System.out.println(result);

        result = evenOrOdd.apply(3);
        System.out.println(result);

        Function<String, String> formatResult = value -> "The result is: " + value;

        String formattedResult = evenOrOdd
                                .andThen(formatResult)
                                .apply(32);

        System.out.println(formattedResult);
    }
}
