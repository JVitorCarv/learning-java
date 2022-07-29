package streams;

public class Product {
    String name;
    double price;
    double discount;
    double shipping;

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", discount=" + discount +
                ", shipping=" + shipping +
                '}';
    }

    public Product(String name, double price, double discount, double shipping) {
        this.name = name;
        this.price = price;
        this.discount = discount;
        this.shipping = shipping;
    }
}
