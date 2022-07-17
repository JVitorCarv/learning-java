package oop.composition.challenge;

import java.util.ArrayList;

public class Customer {
    final String customerName;
    final ArrayList<Purchase> purchases = new ArrayList<>();

    Customer(String name) {
        this.customerName = name;
    }

    public void addPurchase(Purchase purchase) {
        purchases.add(purchase);
    }

    public double getTotalPurchasesValue() {
        double total = 0.0;
        for(Purchase purchase: purchases) {
            total += purchase.getPurchaseTotal();
        }
        return total;
    }
}
