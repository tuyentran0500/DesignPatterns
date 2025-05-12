package Adapter;

// A basic credit card payment class implementing PaymentProcessor directly
class CreditCardPayment implements PaymentProcessor {
    @Override
    public void processPayment(String amount) {
        System.out.println("Processing credit card payment of $" + amount);
    }
}
