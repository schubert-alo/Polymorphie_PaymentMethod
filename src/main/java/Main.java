public class Main {
    public static void main(String[] args) {
        Checkout checkout = new Checkout();
        CardPayment payByCard =  new CardPayment(20_00);   // 20,00 €

        int amount = 15_00; // 15,00 €
        boolean ok = checkout.payWith(payByCard, amount); // kein instanceof!
        System.out.printf("%s: pay(%d ct) -> %s%n", payByCard.name(), amount, ok ? "ACCEPTED" : "DECLINED");

    }
}