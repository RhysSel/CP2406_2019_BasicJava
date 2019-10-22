package week8;

public class PhysicalNewspaperSubscription extends NewspaperSubscription {
    @Override
    public void setAddress(String address) {
        for (int i = 0; i < address.length(); i++) {
            if (Character.isDigit(address.charAt(i))) {
                rate = 15.00;
            } else {
                rate = 0;
                System.out.println("need didgit for $$");
            }
        }

    }
}
