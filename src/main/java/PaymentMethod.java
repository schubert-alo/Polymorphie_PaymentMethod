interface PaymentMethod {
    boolean payWith(int amountInCents); // true = Zahlung akzeptiert
    String name(); // Art der Payment-Methode
}