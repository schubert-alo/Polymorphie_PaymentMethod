final class CardPayment implements PaymentMethod {
    private final int limitInCents;
    CardPayment(int limitInCents) { this.limitInCents = limitInCents; }
    @Override public boolean pay(int amountInCents) {
        return amountInCents <= limitInCents;
    }
    @Override public String name() { return "Card"; }
}