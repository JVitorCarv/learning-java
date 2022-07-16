package oop.composition;

import java.util.ArrayList;

public class Sale {
    ArrayList<Item> items = new ArrayList<>();
    String customerName;

    double getTotalPrice() {
        double price = 0.0;
        for(Item item: items) {
            price += item.quantity * item.unitPrice;
        }
        return price;
    }
}
