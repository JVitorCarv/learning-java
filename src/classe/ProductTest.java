package classe;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ProductTest {
    @Test
    public static void main(String[] args) {
        Product p1 = new Product("Notebook", 1999.99);

        Assertions.assertEquals(1499.99, p1.getPriceWithDiscount(), 0.001);
        System.out.printf("$%.2f\n", p1.getPriceWithDiscount());

        Assertions.assertEquals(999.99, p1.getPriceWithDiscount(0.25), 0.001);
        System.out.printf("$%.2f\n", p1.getPriceWithDiscount(0.25));

        Product p2 = new Product();
        p2.name = "Smartphone";
        p2.price = 999.99;
        System.out.println(p2.name);
    }
}
