package org.example.data.handling.records.sealedclass;

// Define PaymentMethod as an interface instead of a sealed class
sealed interface PaymentMethod permits CreditCard, PayPal, BankTransfer {

    // Abstract method to process payment
    void processPayment(double amount);
}

// Record representing a credit card payment
record CreditCard(String cardNumber) implements PaymentMethod {
    @Override
    public void processPayment(double amount) {
        System.out.println(STR."Processing credit card payment of $\{amount} for card: \{cardNumber}");
    }
}

// Record representing a PayPal payment
record PayPal(String email) implements PaymentMethod {
    @Override
    public void processPayment(double amount) {
        System.out.println(STR."Processing PayPal payment of $\{amount} for account: \{email}");
    }
}

// Record representing a bank transfer payment
record BankTransfer(String bankAccount) implements PaymentMethod {
    @Override
    public void processPayment(double amount) {
        System.out.println(STR."Processing bank transfer payment of $\{amount} to account: \{bankAccount}");
    }
}

// Main class to demonstrate the sealed interface with records
public class PaymentEngine {
    public void main() {
        PaymentMethod creditCard = new CreditCard("1234-5678-9876");
        PaymentMethod payPal = new PayPal("alice@example.com");
        PaymentMethod bankTransfer = new BankTransfer("9876543210");

        creditCard.processPayment(100.0);
        payPal.processPayment(50.0);
        bankTransfer.processPayment(200.0);
    }
}
