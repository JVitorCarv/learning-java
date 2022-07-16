package oop.composition.bidirectional.oneToMany;

public class Buying {
    public static void main(String[] args) {
        Sale sale1 = new Sale();
        sale1.customerName = "Richard";
        sale1.addItem("Pizza", 5, 11.99);
        sale1.addItem("Donut", 10, 1.99);
        sale1.addItem("Cake", 1, 29.99);

        System.out.println(sale1.items.size());
        System.out.printf("$%.2f\n", sale1.getTotalPrice());
    }
}
