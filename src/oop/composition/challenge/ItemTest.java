package oop.composition.challenge;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ItemTest {
    @Test
    public void quantityMustNotBeNegative() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            Product testProduct = new Product("Test", 1);
            Item testItem = new Item(testProduct, -1);
        });
    }

    @Test
    public void quantityMustNotBeZero() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            Product testProduct = new Product("Test", 1);
            Item testItem = new Item(testProduct,  0);
        });
    }

    @Test
    public void testGetItemTotal() {
        Product testProduct = new Product("Test", 11.99);
        Item testItem = new Item(testProduct, 2);
        Assertions.assertEquals(23.98, testItem.getItemTotal());
    }
}
