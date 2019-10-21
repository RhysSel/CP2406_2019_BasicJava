package week6;

import java.util.Scanner;

// 20 numbers in double array keep adding til 9999 or filled
public class DistanceFromAverage {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        double[] numbers = new double[20];
        double entry;
        double total = 0;
        double mean = 0;
        final int QUIT = 9999;
        int x = 0, y;
        System.out.print("Enter a double value" +
                QUIT + " to quit >> ");
        entry = input.nextDouble();
        while (entry != QUIT && x < numbers.length) {
            numbers[x] = entry;
            total += numbers[x];
            x++;
            if (x < numbers.length) {
                System.out.print("Enter next double" +
                        QUIT + " to quit >> ");
                entry = input.nextDouble();
            }
        }
        if (x == 0)
            System.out.println("Average is zero thus no numbers added");
        else {
            mean = total / x;
            System.out.println("You entered " + x +
                    " numbers and the mean is " + mean);
            for (y = 0; y < x; ++y)
                System.out.println(numbers[y] + " is " +
                        (numbers[y] - mean) + " away from the mean");
        }
    }
}


