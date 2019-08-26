package week4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BillingTest {

    @Test
    public void computeBill() {
        Billing billing = new Billing();
        assertEquals(billing.computeBill(100), 108);
        assertEquals(billing.computeBill(100, 10), 1080);
        assertEquals(billing.computeBill(100, 10, 900), 108);
    }
}