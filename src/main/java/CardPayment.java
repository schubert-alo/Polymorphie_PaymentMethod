final class CardPayment implements PaymentMethod {
    private final int maxAmountInCents;

    CardPayment(int maxAmountInCents) {
        this.maxAmountInCents = maxAmountInCents;
    }

    @Override public boolean payWith(int amountInCents) {
        return amountInCents <= maxAmountInCents;
    }

    @Override public String name() {
        return "Card";
    }
}
