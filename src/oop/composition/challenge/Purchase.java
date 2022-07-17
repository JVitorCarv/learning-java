package oop.composition.challenge;

import java.util.ArrayList;

public class Purchase {
    final ArrayList<Item> items = new ArrayList<>();

    public void addItem(Item item) {
        items.add(item);
    }
    public double getPurchaseTotal() {
        double total = 0.0;
        for(Item item: items) {
            total += item.getItemTotal();
        }
        return total;
    }
}
