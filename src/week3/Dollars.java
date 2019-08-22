package week3;

import java.util.Scanner;

public class Dollars {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Dollars  : ");
        double dollarValue = input.nextInt();
        dollarToNote(dollarValue);
    }

    static void dollarToNote(double dollarValue) {
        double total = 0;

        double twenty = Math.floor(dollarValue / 20);
        double twenties = dollarValue % 20;

        double ten = Math.floor(twenties / 10);
        double tens = twenties % 10;

        double five = Math.floor(tens / 5);
        double fives = tens % 5;

        double one = Math.floor(fives / 1);

        System.out.print("Twenties: " + Math.round(twenty) + '\n' + "Tens: " + Math.round(ten) + '\n' + "Fives: " + Math.round(five) + '\n' + "Ones: " + Math.round(one));

    }
}
