package week4;

public class Billing {
    private double tax = 1.08;

    public double computeBill(int price) {
        return price * tax;
    }

    public double computeBill(int price, int books) {
        return price * books * tax;
    }

    public double computeBill(int price, int books, int coupon) {
        return (price * books - coupon) * tax;
    }
}
