package week3;

import java.util.Scanner;

public class InchesToFeetInteractive {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Inches : ");
        int inches_value = input.nextInt();
        displayValues(inches_value);

    }

    static void displayValues(int inches_value) {
        double feet_value = inches_value * 0.0833333;
        System.out.println("Feet: " + feet_value);
        System.out.println("Inches: " + inches_value);

    }

}
