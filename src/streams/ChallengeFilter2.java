package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class ChallengeFilter2 {
    public static void main(String[] args) {
        List<Product> productList = Arrays.asList(
                new Product("Notebook", 2000, 0.3, 0.0),
                new Product("Keyboard", 200, 0.2, 0.0),
                new Product("TV", 1000, 0.5, 10),
                new Product("Tablet", 3000, 0.4, 0.0),
                new Product("Webcam", 100, 0.0, 20)
        );

        productList.stream()
                .filter(product -> product.discount >= 0.3)
                .filter(product -> product.shipping == 0.0)
                .map(product -> "Super sale! " + product.name)
                .forEach(System.out::println);
    }
}
