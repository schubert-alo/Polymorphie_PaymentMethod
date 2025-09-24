final class PaypalPayment implements PaymentMethod {
    private final double feePercent; // z.B. 3.0 = 3%
    PaypalPayment(double feePercent) { this.feePercent = feePercent; }
    @Override public boolean pay(int amountInCents) {
        // Simple Rule: Paypal akzeptiert immer, Gebühr ist nur Info (hier nicht berechnet)
        return amountInCents > 0;
    }
    @Override public String name() { return "PayPal"; }
}