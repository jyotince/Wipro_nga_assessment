package ecommerce_project;

public class Books extends Product {
    private String author;

    public Books(String id, String name, double price, int stock, String author) {
        super(id, name, price, stock);
        this.author = author;
    }

    @Override
    public void displayDetails() {
        System.out.println("Book: " + name + " | Author: " + author +
                " | Price: ₹" + price + " | Stock: " + stock);
    }
}

