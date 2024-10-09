package org.example.data.handling.records.sealedclass;

// Define PaymentMethod as an interface of a sealed class
//No Cash Payment allowed
sealed interface PaymentMethod permits CreditCard, PayPal, BankTransfer {

    // method to process payment
    void processPayment(double amount);
}

// Record representing a credit card payment
record CreditCard(String cardNumber) implements PaymentMethod {
    @Override
    public void processPayment(double amount) {
        System.out.printf("Processing credit card payment of %s for card: %s%n", amount, cardNumber);
    }
}

// Record representing a PayPal payment
record PayPal(String email) implements PaymentMethod {
    @Override
    public void processPayment(double amount) {
        System.out.printf("Processing PayPal payment of %s for account: %s%n", amount, email);
    }
}

// Record representing a bank transfer payment
record BankTransfer(String bankAccount) implements PaymentMethod {
    @Override
    public void processPayment(double amount) {
        System.out.printf("Processing bank transfer payment of %s to account: %s%n", amount, bankAccount);
    }
}
//CashPayment is not allowed as a subclass under a valid Payment method
record CashPayment(String amount){
    public void processPayment(double amount) {
        System.out.printf("Processing cash payment of %s for account: %s%n", amount, amount);
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
