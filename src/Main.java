import java.util.List;

public class Main {
    public static void main(String[] args) {
        Checkout checkout = new Checkout();
        List<PaymentMethod> methods = List.of(
                new CardPayment(20_00),   // 20,00 €
                new PaypalPayment(3.0)    // 3% Gebühr (nur Info)
        );

        int amount = 15_00; // 15,00 €
        for (PaymentMethod m : methods) {
            boolean ok = checkout.pay(m, amount); // kein instanceof!
            System.out.printf("%s: pay(%d ct) -> %s%n", m.name(), amount, ok ? "ACCEPTED" : "DECLINED");
        }
    }
}