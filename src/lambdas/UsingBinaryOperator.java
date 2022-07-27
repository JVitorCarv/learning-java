package lambdas;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;

public class UsingBinaryOperator {
    public static void main(String[] args) {
        BinaryOperator<Double> average = (n1, n2) -> (n1 + n2) / 2;
        System.out.println(average.apply(9.8, 5.7));

        BiFunction<Double, Double, String> result = (n1, n2) -> {
            double studentAverage = (n1 + n2) / 2;
            return studentAverage >= 7 ? "Approved" : "Failed";
        };
        System.out.println(result.apply(9.4, 3.4));

        Function<Double, String> concept
                = avg -> avg >= 7 ? "Approved" : "Failed";

        System.out.println(average
                .andThen(concept)
                .apply(5.6, 8.6));
    }
}
