package week3;

import java.util.Random;

public class Game {
    int wins;
    int count;
    private Random random = new Random();
    int secret = random.nextInt(10) + 1; // secret assigned random value 1-10

    void makeGuess(int value) {
        this.count++;
        if (value == this.secret) {
            this.wins++;
        }
    }
}
