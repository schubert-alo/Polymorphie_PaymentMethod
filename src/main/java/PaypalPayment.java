final class PaypalPayment implements PaymentMethod {
    private final int limitInCents;

    PaypalPayment(int limitInCents) {
        this.limitInCents = limitInCents;
    }

    @Override public boolean pay(int amountInCents) {
        return amountInCents >= limitInCents;
    }

    @Override public String name() {
        return "PayPal";
    }
}