package oop.composition.oneToMany;

public class Buying {
    public static void main(String[] args) {
        Sale sale1 = new Sale();
        sale1.customerName = "Richard";
        sale1.items.add(new Item("Pizza", 5, 11.99));
        sale1.items.add(new Item("Donut", 10, 1.99));
        sale1.items.add(new Item("Cake", 1, 29.99));

        System.out.println(sale1.items.size());
        System.out.printf("$%.2f\n", sale1.getTotalPrice());
    }
}
