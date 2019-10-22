package week8;

public class OutgoingPhoneCall extends PhoneCall {
    public final static double rateOfCost = .04;
    private int minutes;

    public OutgoingPhoneCall(String num, int mins) {
        super(num);
        minutes = mins;
        price = minutes * rateOfCost;
    }

    public void getInfo() {
        System.out.println("Outgoing phone call " + getPhoneNumber() + " "
                + rateOfCost + " per minute at " + minutes + " minutes. Total is $" + getPrice());
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public double getPrice() {
        return price;
    }
}