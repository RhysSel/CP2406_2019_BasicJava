package week4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class LeaseTest {

    @Test
    void testinit() {

        Lease lease = new Lease();
        assertEquals(400, lease.getRent());
        assertEquals(2, lease.getApartmentNumber());
        assertEquals(12, lease.getLeaseLength());
        assertEquals("George", lease.getTenantName());
    }

    @Test
    void testgetset() {
        Lease lease = new Lease("Rhys", 12, 500, 4);
        assertEquals(500, lease.getRent());
        assertEquals(12, lease.getApartmentNumber());
        assertEquals(4, lease.getLeaseLength());
        assertEquals("Rhys", lease.getTenantName());
        assertEquals(510, lease.addPetFee());
    }
}