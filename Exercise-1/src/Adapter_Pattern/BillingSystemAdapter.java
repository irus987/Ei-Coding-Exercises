package Adapter_Pattern;

public class BillingSystemAdapter implements ModernPaymentGateway {
    private LegacyBillingSystem legacyBillingSystem;

    public BillingSystemAdapter(LegacyBillingSystem legacyBillingSystem) {
        this.legacyBillingSystem = legacyBillingSystem;
    }

    @Override
    public void makePayment(String customer, double amount) {
        legacyBillingSystem.processBilling(customer, amount);
    }

    public static void main(String[] args) {
        LegacyBillingSystem legacySystem = new LegacyBillingSystem();
        ModernPaymentGateway adapter = new BillingSystemAdapter(legacySystem);

        adapter.makePayment("John Doe", 250.0);
    }
}

