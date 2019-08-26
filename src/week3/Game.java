package week3;

import java.util.Random;


public class Game {
    int wins;
    int count;
    private Random random = new Random();
    int secret;

    public Game(int min, int max) {
        secret = min + random.nextInt(max - min + 1);
    }
    void makeGuess(int value) {
        this.count++;
        if (value == this.secret) {
            this.wins++;
        }
    }
}
