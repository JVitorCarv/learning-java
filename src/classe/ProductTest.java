package classe;

public class ProductTest {
    public static void main(String[] args) {
        Product p1 = new Product("Notebook");
        p1.price = 1999.99;
        p1.discount = 0.10;

        System.out.printf("$%.2f\n", p1.getPriceWithDiscount());
        System.out.printf("$%.2f\n", p1.getPriceWithDiscount(0.3));

        Product p2 = new Product();
        p2.name = "Smartphone";
        p2.price = 999.99;
        p2.discount = 0.05;
        System.out.println(p2.name);
    }
}
