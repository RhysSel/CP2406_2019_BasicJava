package week8;

public abstract class NewspaperSubscription {
    protected String subName;
    protected String address;
    protected double rate;

    public String getSubName() {
        return subName;
    }

    public void setSubName(String subName) {
        this.subName = subName;
    }

    public double getRate() {
        return rate;
    }

    public abstract void setAddress(String address);
}
