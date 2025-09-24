import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CheckoutTest {

    @Test
    void card_accepts_from_minimum_amount_on() {
        // Given --> Arrange
        Checkout co = new Checkout();
        PaymentMethod card = new CardPayment(2_000);

        // When --> Act
        boolean okAtLimit = co.pay(card, 2_000);
        boolean okBelow   = co.pay(card, 1_999);
        boolean notOkAbove = co.pay(card, 2_001);

        // Then --> Assert
        assertTrue(okAtLimit);
        assertTrue(okBelow);
        assertFalse(notOkAbove);
    }

    @Test
    void paypal_rejects_zero_and_negatives_accepts_minimum() {
        // Given --> Arrange
        Checkout co = new Checkout();
        PaymentMethod paypal = new PaypalPayment(1); // min 1 ct

        // When / Then -->Act/Assert
        assertFalse(co.pay(paypal, 0));
        assertFalse(co.pay(paypal, -1));
        assertTrue(co.pay(paypal, 1));
    }
}