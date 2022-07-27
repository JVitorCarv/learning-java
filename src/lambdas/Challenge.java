package lambdas;

import java.util.function.Function;
import java.util.function.UnaryOperator;

public class Challenge {
    public static void main(String[] args) {
        Product product = new Product("iPad", 3235.89, 0.13);
        Function<Product, Double> calculateDiscount = p -> p.price * (1 - p.discount);
        UnaryOperator<Double> applyTaxes = price -> price >= 2500.0 ? price * 1.085 : price;
        UnaryOperator<Double> addTransport = price -> price >= 3000 ? price + 100 : price + 50;
        UnaryOperator<Double> round = price -> Math.round(price * 100.0) / 100.0;
        Function<Double, String> format = price -> ("R$" + price).replace(".", ",");

        System.out.println(calculateDiscount
                        .andThen(applyTaxes)
                        .andThen(addTransport)
                        .andThen(round)
                        .andThen(format)
                        .apply(product)
        );
    }
}
