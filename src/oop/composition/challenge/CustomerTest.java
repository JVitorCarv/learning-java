package oop.composition.challenge;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CustomerTest {
    Product testProduct = new Product("Title", 22.99);
    Item testItem1 = new Item(testProduct, 3);
    Item testItem2 = new Item(testProduct, 3);
    Purchase testPurchase = new Purchase();
    Customer testCustomer = new Customer("Test");

    @Test
    public void testPurchaseList() {
        testPurchase.addItem(testItem1);
        testCustomer.addPurchase(testPurchase);
        Assertions.assertEquals(1, testCustomer.purchases.size());
    }

    @Test
    public void testCustomerTotal() {
        testPurchase.addItem(testItem1);
        Purchase testPurchase2 = new Purchase();
        testPurchase2.addItem(testItem2);
        testCustomer.addPurchase(testPurchase);
        testCustomer.addPurchase(testPurchase2);
        Assertions.assertEquals(137.94, testCustomer.getTotalPurchasesValue());
    }
}
