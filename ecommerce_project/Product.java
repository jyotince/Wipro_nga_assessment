package ecommerce_project;

public abstract class Product {
    protected String id;
    protected String name;
    protected double price;
    protected int stock;

    public Product(String id, String name, double price, int stock) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.stock = stock;
    }

    public abstract void displayDetails();

    public double getPrice() {
        return price;
    }

    public void reduceStock(int quantity) {
        stock -= quantity;
    }

    public int getStock() {
        return stock;
    }

    public void updateStock(int quantity) {
        this.stock = quantity;
    }
}

