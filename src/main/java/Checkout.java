final class Checkout {
    boolean payWith(PaymentMethod method, int amountInCents) {
        // Polymorphie: Aufruf über Basistyp; zur Laufzeit wird die konkrete Implementierung gebunden
        return method.payWith(amountInCents);
    }
}
