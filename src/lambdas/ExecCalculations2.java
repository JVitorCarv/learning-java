package lambdas;

public class ExecCalculations2 {
    public static void main(String[] args) {
        Calculation calculation = (x, y) -> {return x + y; };
        System.out.println(calculation.execute(2, 3));

        calculation = (x, y) -> x * y;
        System.out.println(calculation.execute(3, 3));
    }
}
