package week5;

import java.util.Scanner;
public class CountByAnything {
    public static void main(String args[]) {
        final int max_value = 300;
        final int number_per_line;
        Scanner input = new Scanner(System.in);
        int stepValue;
        System.out.print("Enter number to count by:  ");
        stepValue = input.nextInt();
        number_per_line = stepValue * 10;
        for (int i = stepValue; i <= max_value; i += stepValue) {
            System.out.print(i + "  ");
            if (i % number_per_line == 0)
                System.out.println(" ");
        }
    }
}
