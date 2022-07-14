package classe;

public class Product {
    String name;
    double price;
    static final double DISCOUNT = 0.25;

    Product(String initialName, double initialPrice) {
        name = initialName;
        price = initialPrice;
    }

    Product() {}

    double getPriceWithDiscount() {
        double temp = price * (1 - DISCOUNT);
        return Math.floor(temp * 100)/100;
    }
    double getPriceWithDiscount(double extraDiscount) {
        double temp = price * (1 - (DISCOUNT + extraDiscount));
        return Math.floor(temp * 100)/100;
    }
}
