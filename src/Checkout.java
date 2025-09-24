final class Checkout {
    boolean pay(PaymentMethod method, int amountInCents) {
        // Polymorphie: Aufruf über Basistyp; zur Laufzeit wird die konkrete Implementierung gebunden
        return method.pay(amountInCents);
    }
}
