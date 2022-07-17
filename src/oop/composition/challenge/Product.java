package oop.composition.challenge;

public class Product {
    double price;
    String title;

    Product(String title, double price) {
        if (price < 0.01) {
            throw new IllegalArgumentException("Price must be above 0, but found " + price);
        }
        this.title = title;
        this.price = price;
    }
}
