package lambdas;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class UsingConsumer {
    public static void main(String[] args) {
        Consumer<Product> printName = product -> System.out.println(product.name);

        Product p1 = new Product("Phone", 2000, 0.1);
        printName.accept(p1);

        Product p2 = new Product("Tablet", 400, 0.2);
        Product p3 = new Product("Keyboard", 200, 0.1);

        List<Product> productList = Arrays.asList(p1, p2, p3);

        productList.forEach(printName); //forEach understands that it needs to use accept
        productList.forEach(System.out::println);
    }
}


