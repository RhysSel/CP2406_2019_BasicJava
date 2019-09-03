package week5;

public class DiagonalOs {
    public static void main(String[] args) {
        final char oCharacter = 'O';
        final char spaceCharachter = ' ';
        final int ROWS = 10;
        int spaces = 0, i, a;
        for (i = 0; i < ROWS; ++i) {
            for (a = 0; a < spaces; ++a)
                System.out.print(spaceCharachter);
            System.out.println(oCharacter);
            spaces = spaces + 1;
        }
    }
}
