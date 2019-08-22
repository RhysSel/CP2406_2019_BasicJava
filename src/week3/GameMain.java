package week3;

import java.util.Random;
import java.util.Scanner;

public class GameMain {
    public static void main(String args[]) {
        Random random = new Random();
        int secret = random.nextInt(10) + 1;
        System.out.print("Secret Number:   " + secret);

        Scanner Input = new Scanner(System.in);
        System.out.print("Enter guess: ");
        int guess;
        guess = Input.nextInt();

        if (guess == secret) {
            System.out.print("You guessed right");
        } else {
            System.out.print("You guessed wrong get gud");
        }
    }
}
