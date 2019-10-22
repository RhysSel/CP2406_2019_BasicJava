package week8;

public class IncomingPhoneCall extends PhoneCall {
    public final static double rateOfCost = 0.02;

    public IncomingPhoneCall(String num) {
        super(num);
        price = rateOfCost;
    }

    public void getInfo() {
        System.out.println("Incoming phone call " + getPhoneNumber() + " "
                + rateOfCost + " per call. Total is $" + +getPrice());
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public double getPrice() {
        return price;
    }
}

