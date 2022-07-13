package classe;

public class Product {
    String name;
    double price;
    double discount;

    Product(String initialName) {
        name = initialName;
    }

    Product() {}

    double getPriceWithDiscount() {
        return price * (1 - discount);
    }
    double getPriceWithDiscount(double extraDiscount) {
        return price * (1 - (discount + extraDiscount));
    }
}
