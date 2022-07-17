package oop.composition.challenge;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PurchaseTest {
    Product testProduct = new Product("Title", 22.99);
    Item testItem1 = new Item(testProduct, 3);
    Item testItem2 = new Item(testProduct, 3);
    Purchase testPurchase = new Purchase();

    @Test
    public void testAddItem() {
        testPurchase.addItem(testItem1);
        testPurchase.addItem(testItem2);
        Assertions.assertEquals(2, testPurchase.items.size());
    }
    @Test
    public void testGetTotal() {
        testPurchase.addItem(testItem1);
        Assertions.assertEquals(68.97, testPurchase.getPurchaseTotal());
    }
}
