package lambdas;

import java.util.function.UnaryOperator;

public class UsingUnaryOperator {
    public static void main(String[] args) {
        UnaryOperator<Integer> plusTwo = n -> n + 2;
        UnaryOperator<Integer> timesTwo = n -> n * 2;
        UnaryOperator<Integer> power = n -> n * n;

        int result1 = plusTwo
                .andThen(timesTwo)
                .andThen(power)
                .apply(0);

        System.out.println(result1);

        int result2 = power
                .compose(timesTwo)
                .compose(plusTwo)
                .apply(0);

        System.out.println(result2);
    }
}
