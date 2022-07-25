package lambdas;

import java.util.function.Predicate;

public class UsingPredicate {
    public static void main(String[] args) {
        Predicate<Product> isExpensive = (product) -> product.price >= 2000;

        Product product = new Product("Notebook", 4000, 0.2);
        System.out.println(isExpensive.test(product));
    }
}
