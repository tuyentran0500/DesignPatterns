package Adapter;

// Step 4: Client code
public class AdapterPatternDemo {
    public static void main(String[] args) {
        // Direct Credit Card Payment
        PaymentProcessor creditCardPayment = new CreditCardPayment();
        creditCardPayment.processPayment("100");

        // Using Adapter for PayPal Payment
        // PayPalPayment payPalPayment = new PayPalPayment();
        // PaymentProcessor payPalAdapter = new PayPalAdapter(payPalPayment);
        // payPalAdapter.processPayment("200");
    }
}