package oop.composition.bidirectional.oneToMany;

public class Item {
    String name;
    int quantity;
    double unitPrice;
    Sale sale;

    Item(String name, int quantity, double unitPrice) {
        this.name = name;
        this.quantity = quantity;
        this.unitPrice = unitPrice;
    }
}
