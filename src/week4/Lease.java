package week4;

public class Lease {
    private String tenantName;
    private int apartmentNumber;
    private int rent; // monthly rent $$
    private int leaseLength; // in years

    public Lease(String tenantName, int apartmentNumber, int rent, int leaseLength) {
        this.tenantName = tenantName;
        this.apartmentNumber = apartmentNumber;
        this.rent = rent;
        this.leaseLength = leaseLength;
    }

    public Lease() {
        tenantName = "George";
        apartmentNumber = 2;
        rent = 400;
        leaseLength = 12;
    }

    private static void explainPetPolicy() {
        System.out.println("If a pet is within the premises of the apartment a $10 fee will be charged monthly");
    }

    public String getTenantName() {
        return tenantName;
    }

    public void setTenantName(String tenantName) {
        this.tenantName = tenantName;
    }

    public int getApartmentNumber() {
        return apartmentNumber;
    }

    public void setApartmentNumber(int apartmentNumber) {
        this.apartmentNumber = apartmentNumber;
    }

    public int getLeaseLength() {
        return leaseLength;
    }

    public void setLeaseLength(int leaseLength) {
        this.leaseLength = leaseLength;
    }

    public int getRent() {
        return rent;
    }

    public void setRent(int rent) {
        this.rent = rent;
    }

    public int addPetFee() {
        rent = rent + 10;// monthly $10 fee
        explainPetPolicy();
        return rent;
    }
}

