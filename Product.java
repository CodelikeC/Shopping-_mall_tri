package transaction;

import Staff.category;

public class Product {
    private String name;
    private double price;
    private category category;

    public Product(String name, double price, category category) {
        this.name = name;
        this.price = price;
        this.category = category;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public category getCategory() {
        return category;
    }

    @Override
    public String toString() {
        return "Product{name='" + name + '\'' + ", price=" + price + ", category=" + category + '}';
    }
}