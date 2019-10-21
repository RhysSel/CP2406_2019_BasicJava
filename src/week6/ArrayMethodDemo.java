package week6;

public class ArrayMethodDemo {
    public static void main(String args[]) {
        int[] numbers = {1, 4, 8, 10, 12, 16, 20, 32, 31, 49};
        int limit = 20;
        displayArray(numbers);
        displayArrayReverse(numbers);
        displayArraySum(numbers);
        displayArrayLessThan(numbers, limit);
        displayArrayGreaterAverage(numbers);
    }

    public static void displayArray(int[] numbers) {
        System.out.print("The numbers are  ");
        for (int i = 0; i < numbers.length; ++i)
            System.out.print(numbers[i] + "  ");
    }

    public static void displayArrayReverse(int[] numbers) {
        System.out.print("\nThe numbers in reverse order are  ");
        for (int i = numbers.length - 1; i >= 0; --i)
            System.out.print(numbers[i] + "  ");
    }

    public static void displayArraySum(int[] numbers) {
        int total = 0;
        for (int i = 0; i < numbers.length; i++) {
            total += numbers[i];
        }
        System.out.println("\nThe sum of all numbers is " + total);
    }

    public static void displayArrayLessThan(int[] numbers, int limit) {
        for (int i = 0; i < numbers.length; i++)
            if (numbers[i] < limit)
                System.out.print(numbers[i] + " ");
        System.out.println("are less than the limit " + limit);

    }

    public static void displayArrayGreaterAverage(int[] numbers) {
        int sum = 0;
        double average;
        for (int i = 0; i < numbers.length; ++i)
            sum += numbers[i];
        average = sum * 1.0 / numbers.length;
        System.out.println("The average is " + average);
        for (int i = 0; i < numbers.length; i++)
            if (numbers[i] > average)
                System.out.print(numbers[i] + "  ");
        System.out.println("are greater than the average");
    }
}