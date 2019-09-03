package week5;

import java.util.Scanner;

public class CellPhoneService {
    public static void main(String[] args) {
        //Declare constants
        final int DATA_MIN = 2;
        final int TALK_MIN = 500;
        final int TEXT_MIN = 100;
        final int PRICEA = 49;
        final int PRICEB = 55;
        final int PRICEC = 61;
        final int PRICED = 70;
        final int PRICEE = 79;
        final int PRICEF = 87;
        String plan;
        int price;
        System.out.println("How many minutes of talk tile do you need? ");
        Scanner talk = new Scanner(System.in);
        int talkTime = talk.nextInt();

        System.out.println("How many texts do you need ");
        Scanner text = new Scanner(System.in);
        int textAmount = text.nextInt();

        System.out.println("How much data do you need in GB");
        Scanner data = new Scanner(System.in);
        int dataAmount = data.nextInt();

        if (dataAmount < DATA_MIN && dataAmount != 0) {
            plan = "E";
            price = PRICEE;
        } else {
            plan = "F";
            price = PRICEF;
        }
        if (talkTime < TALK_MIN && dataAmount == 0) {
            if (textAmount > 0) {
                plan = "B";
                price = PRICEB;
            } else {
                plan = "A";
                price = PRICEA;
            }
        } else if (talkTime >= TALK_MIN && dataAmount == 0) {
            if (textAmount < TEXT_MIN) {
                plan = "C";
                price = PRICEC;
            } else {
                plan = "D";
                price = PRICED;
            }
        }
        System.out.println("You need plan " + plan + " at the price of $" + price);
    }
}
