package week8;

public class UseBook {
    public static void main(String[] args) {
        Fiction novel = new Fiction("Huckelberry Finn");
        NonFiction manual = new
                NonFiction("Elements of Style");
        System.out.println("Fiction " +
                novel.getTitle() + " costs $" +
                novel.getPrice());
        System.out.println("Non-Fiction " +
                manual.getTitle() + " costs $" +
                manual.getPrice());
    }
}