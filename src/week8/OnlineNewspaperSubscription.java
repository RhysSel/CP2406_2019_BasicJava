package week8;

public class OnlineNewspaperSubscription extends NewspaperSubscription {
    @Override
    public void setAddress(String address) {
        for (int i = 0; i < address.length(); i++) {
            if (address.charAt(i) == '@') {
                rate = 9.00;
            } else {
                rate = 0;
                System.out.println("\r\n you need @ sign for $$$");
            }
        }
    }
}
