package week4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class LeaseTest {

    @Test
    void testMethod() {
        Lease lease = new Lease("");

        assertEquals("George", lease.getTenantName());
        assertEquals(2, lease.getApartmentNumber());
        assertEquals(400, lease.getRent());
        assertEquals(12, lease.getLeaseLength());
        lease.addPetFee();
        assertEquals(410, lease.getRent());
    }
}