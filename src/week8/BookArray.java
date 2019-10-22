package week8;

public class BookArray {

    public static void main(String[] args) {

        Book[] someBook = new Book[10];
        someBook[0] = new Fiction("so lame");
        someBook[1] = new Fiction("so lamerrr");
        someBook[2] = new Fiction("wtghf");
        someBook[3] = new Fiction("so lame");
        someBook[4] = new Fiction("so lame the trilogy");
        someBook[5] = new Fiction("so lame");
        someBook[6] = new NonFiction("the real manual");
        someBook[7] = new NonFiction("the real manual x2");
        someBook[8] = new NonFiction("the wrong manual");
        someBook[9] = new NonFiction("wyd");
        for (int i = 0; i < someBook.length; i++) {
            System.out.println("title is" + someBook[i].getTitle() + "cost is " + someBook[i].getPrice());
        }
    }
}
