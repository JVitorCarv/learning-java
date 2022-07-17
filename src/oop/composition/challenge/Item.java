package oop.composition.challenge;

public class Item {
    int quantity;
    Product product;

    Item(Product product, int quantity) {
        if (quantity <= 0) {
            throw new IllegalArgumentException("Quantity must be above 0, but found " + quantity);
        }
        this.product = product;
        this.quantity = quantity;
    }

    double getItemTotal() {
        return product.price * quantity;
    }
}
