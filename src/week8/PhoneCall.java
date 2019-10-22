package week8;

public abstract class PhoneCall {
    String phoneNumber;
    double price;

    public PhoneCall(String num) {
        phoneNumber = num;
        price = 0.0;
    }

    public void setCallPrice(double pr) {
        price = pr;
    }

    public abstract String getPhoneNumber();

    public abstract double getPrice();

    public abstract void getInfo();
}


