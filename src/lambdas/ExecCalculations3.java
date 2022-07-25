package lambdas;

import java.util.function.BinaryOperator;

public class ExecCalculations3 {
    public static void main(String[] args) {
        BinaryOperator<Double> calculation = (x, y) -> {return x + y; };
        System.out.println(calculation.apply(2.0, 3.0));

        calculation = (x, y) -> x * y;
        System.out.println(calculation.apply(2.0, 3.0));

        BinaryOperator<String> concatString = (string1, string2) -> string1.concat(string2);
        System.out.println(concatString.apply("AB", "CD"));
    }

}
