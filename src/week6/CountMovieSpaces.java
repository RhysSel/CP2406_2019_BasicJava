package week6;

public class CountMovieSpaces {
    public static void main(String[] args) {
        String movieQuote;
        movieQuote = "Programming 3 is so good.";
        int numSpaces = 0;
        int quoteLength = movieQuote.length();
        for (int i = 0; i < quoteLength; i++) {
            char character = movieQuote.charAt(i);
            if (character == ' ') {
                numSpaces++;

            }
        }
        System.out.println(numSpaces + "is the amount of white space in quote");
    }
}
