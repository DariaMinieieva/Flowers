package payment;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CreditCardPaymentStrategyTest {
    CreditCardPaymentStrategy strategy = new CreditCardPaymentStrategy();
    double price = 34.5;

    @Test
    void pay() {
        assertEquals(strategy.pay(price), "Payed with credit card: 34.5");
    }
}