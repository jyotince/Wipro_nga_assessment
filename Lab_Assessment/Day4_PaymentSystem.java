package classPractice;

abstract class PaymentMethod {
    protected double amount;

    PaymentMethod(double amount) {
        this.amount = amount;
    }

    abstract void pay();

    void displayAmount() {
        System.out.println("Payment Amount: " + amount);
    }
}

class CreditCard extends PaymentMethod {
    private String cardNumber;

    CreditCard(double amount, String cardNumber) {
        super(amount);
        this.cardNumber = cardNumber;
    }

    void pay() 
    {
        System.out.println("Paid " + amount + " using Credit Card (Last 4 digits: " 
                           + cardNumber.substring(cardNumber.length() - 4) + ").");
    }
}


class UPI extends PaymentMethod {
    private String upiId;

    UPI(double amount, String upiId) {
        super(amount);
        this.upiId = upiId;
    }

    void pay() {
        System.out.println("Paid " + amount + " using UPI (" + upiId + ").");
    }
}


class Cash extends PaymentMethod {

    Cash(double amount) {
        super(amount);
    }

    void pay() {
        System.out.println("Paid " + amount + " in Cash.");
    }
}


public class Day4_PaymentSystem {
    public static void main(String[] args) {
        PaymentMethod creditCard = new CreditCard(1500, "1234567812345678");
        PaymentMethod upi = new UPI(500, "user@upi");
        PaymentMethod cash = new Cash(2000);

        PaymentMethod[] payments = {creditCard, upi, cash};

        for (PaymentMethod payment : payments) {
            payment.displayAmount(); 
            payment.pay();       
            System.out.println("-------------");
        }
    }
}
