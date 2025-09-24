interface PaymentMethod {
    boolean pay(int amountInCents); // true = Zahlung akzeptiert
    String name(); // Art der Payment-Methode
}