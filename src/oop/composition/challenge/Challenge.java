package oop.composition.challenge;

public class Challenge {
    public static void main(String[] args) {
        Customer customer = new Customer("Vitor");

        Product p1 = new Product("Pizza", 11.99);
        Product p2 = new Product("Cake", 29.99);
        Product p3 = new Product("Donut", 1.99);

        Purchase pu1 = new Purchase();
        pu1.addItem(new Item(p1, 2));
        pu1.addItem(new Item(p2, 1));
        customer.addPurchase(pu1);

        Purchase pu2 = new Purchase();
        pu2.addItem(new Item(p2, 2));
        pu2.addItem(new Item(p3, 20));
        customer.addPurchase(pu2);

        System.out.println(pu1.getPurchaseTotal());
        System.out.println(pu2.getPurchaseTotal());

        System.out.println(customer.getTotalPurchasesValue());
    }
}
