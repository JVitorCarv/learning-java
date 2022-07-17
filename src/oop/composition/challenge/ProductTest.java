package oop.composition.challenge;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ProductTest {
    @Test
    public void priceMustNotBeNegative() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
           Product testNegative = new Product("Test", -1.9);
        });
    }

    @Test
    public void priceMustBeHighEnough() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            Product testZero = new Product("Test", 0.00001);
        });
    }

    @Test
    public void priceMustBeHighEnough2() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            Product testZero = new Product("Test", 0.009);
        });
    }
}
