package week5;

import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        System.out.println("Enter an integer: ");
        int number;
        Scanner input = new Scanner(System.in);
        number = input.nextInt();
        if (isEven(number))
            System.out.println("The number " + number + " is even");

        else
            System.out.println("The number " + number + " is odd");

    }

    public static boolean isEven(int number) {
        boolean result;
        result = (number % 2) == 0;
        return result;
    }
}
