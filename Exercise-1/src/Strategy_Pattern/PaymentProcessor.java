package Strategy_Pattern;

public class PaymentProcessor {
    private PaymentStrategy paymentStrategy;

    public void setPaymentStrategy(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    public void processPayment(int amount) {
        paymentStrategy.pay(amount);
    }

    public static void main(String[] args) {
        PaymentProcessor processor = new PaymentProcessor();

        processor.setPaymentStrategy(new CreditCardPayment("1234-5678-9876-5432"));
        processor.processPayment(100);

        processor.setPaymentStrategy(new PayPalPayment("user@example.com"));
        processor.processPayment(200);

        processor.setPaymentStrategy(new BitcoinPayment("1A1zP1eP5QGefi2DMPTfTL5SLmv7DivfNa"));
        processor.processPayment(300);
    }
}
