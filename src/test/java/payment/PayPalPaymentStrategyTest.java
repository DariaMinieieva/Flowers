package payment;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PayPalPaymentStrategyTest {
    PayPalPaymentStrategy strategy = new PayPalPaymentStrategy();
    double price = 35.4;

    @Test
    void pay() {
        assertEquals(strategy.pay(price), "Payed with pay palchick: 35.4");
    }
}