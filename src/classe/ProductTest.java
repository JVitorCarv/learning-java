package classe;

public class ProductTest {
    public static void main(String[] args) {
        Product p1 = new Product();
        p1.name = "Notebook";
        p1.price = 1999.99;
        p1.discount = 0.10;

        System.out.printf("$%.2f\n", p1.getPriceWithDiscount());
        System.out.printf("$%.2f\n", p1.getPriceWithDiscount(0.3));
    }
}
