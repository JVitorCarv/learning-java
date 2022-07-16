package oop.composition.bidirectional.oneToMany;

import java.util.ArrayList;

public class Sale {
    ArrayList<Item> items = new ArrayList<>();
    String customerName;

    void addItem(String name, int quantity, double price) {
        this.addItem(new Item(name, quantity, price));
    }
    void addItem(Item item) {
        items.add(item);
        item.sale = this;
    }

    double getTotalPrice() {
        double price = 0.0;
        for(Item item: items) {
            price += item.quantity * item.unitPrice;
        }
        return price;
    }
}
