package ecommerce_project;

import java.util.List;

public class Order {
    private Customer customer;
    private List<Product> products;
    private double totalAmount;
    private boolean isCancelled = false;

    public Order(Customer customer, List<Product> products) {
        this.customer = customer;
        this.products = products;
        this.totalAmount = calculateTotal();
    }

    private double calculateTotal() {
        return products.stream().mapToDouble(Product::getPrice).sum();
    }

    public void placeOrder(Payment payment, Discountable discountable) {
        if (isCancelled) {
            System.out.println("Order has been cancelled. Cannot place.");
            return;
        }

        customer.displayCustomer();
        products.forEach(Product::displayDetails);

        double discounted = discountable.applyDiscount(totalAmount);
        System.out.println("Total after discount: ₹" + discounted);

        payment.amount = discounted;
        payment.processPayment();

        for (Product product : products) {
            product.reduceStock(1); // assuming 1 qty per product
        }
    }

    public void cancelOrder() {
        isCancelled = true;
        System.out.println("Order cancelled.");
    }
}
