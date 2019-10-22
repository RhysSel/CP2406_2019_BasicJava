package week8;

public abstract class Book {
    String title = "";

    double price;

    public Book(String t) {
        title = t;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getTitle() {
        return title;
    }
}
