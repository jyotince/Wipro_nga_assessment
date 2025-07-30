package ecommerce_project;
import java.util.ArrayList;
import java.util.Scanner;

public class ECommerceApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // CUSTOMER DETAILS
        System.out.print("Enter Customer Name: ");
        String custName = sc.nextLine();

        System.out.print("Enter Customer Email: ");
        String custEmail = sc.nextLine();

        Customer customer = new Customer(custName, custEmail);

        // PRODUCT DETAILS
        ArrayList<Product> productList = new ArrayList<>();
        System.out.print("How many products to order? ");
        int n = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < n; i++) {
            System.out.println("Choose Product Type (1-Electronics, 2-Clothing, 3-Books, 4-Furniture): ");
            int type = Integer.parseInt(sc.nextLine());

            System.out.print("Enter Product ID: ");
            String id = sc.nextLine();
            System.out.print("Enter Name: ");
            String name = sc.nextLine();
            System.out.print("Enter Price: ");
            double price = Double.parseDouble(sc.nextLine());
            System.out.print("Enter Stock: ");
            int stock = Integer.parseInt(sc.nextLine());

            switch (type) {
                case 1:
                    System.out.print("Enter Brand: ");
                    String brand = sc.nextLine();
                    System.out.print("Enter Warranty (months): ");
                    int warranty = Integer.parseInt(sc.nextLine());
                    productList.add(new Electronics(id, name, price, stock, brand, warranty));
                    break;
                case 2:
                    System.out.print("Enter Size: ");
                    String size = sc.nextLine();
                    System.out.print("Enter Fabric: ");
                    String fabric = sc.nextLine();
                    productList.add(new Clothing(id, name, price, stock, size, fabric));
                    break;
                case 3:
                    System.out.print("Enter Author: ");
                    String author = sc.nextLine();
                    productList.add(new Books(id, name, price, stock, author));
                    break;
                case 4:
                    System.out.print("Enter Material: ");
                    String material = sc.nextLine();
                    productList.add(new Furniture(id, name, price, stock, material));
                    break;
                default:
                    System.out.println("Invalid type.");
            }
        }

        Order order = new Order(customer, productList);

        // DISCOUNT
        System.out.print("Enter discount percentage (e.g. 10 for 10%): ");
        double discPercent = Double.parseDouble(sc.nextLine());
        Discountable discount = (price) -> price * (1 - discPercent / 100);

        // PAYMENT
        System.out.println("Select Payment Mode (1-UPI, 2-Card, 3-Cash On Delivery): ");
        int payOption = Integer.parseInt(sc.nextLine());

        Payment payment = null;

        switch (payOption) {
            case 1:
                System.out.print("Enter UPI ID: ");
                String upiId = sc.nextLine();
                payment = new UpiPayment(0, upiId);
                break;
            case 2:
                System.out.print("Enter Card Number: ");
                String card = sc.nextLine();
                payment = new CardPayment(0, card);
                break;
            case 3:
                payment = new CashOnDelivery(0);
                break;
            default:
                System.out.println("Invalid payment method.");
                return;
        }

        // PLACE ORDER
        order.placeOrder(payment, discount);

        // CANCELLATION OPTION
        System.out.print("Do you want to cancel the order? (yes/no): ");
        String cancel = sc.nextLine();
        if (cancel.equalsIgnoreCase("yes")) {
            order.cancelOrder();
        }

        sc.close();
    }
}
