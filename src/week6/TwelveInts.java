package week6;

public class TwelveInts {
    public static void main(String args[]) {
        int[] numberArray = {10, 5, 2, 9, 31, 32, 54, 39, 20, 17, 54, 67};
        int i;
        for (i = 0; i < numberArray.length; i++)
            System.out.print(numberArray[i] + "  ");
        System.out.println();
        for (i = numberArray.length - 1; i >= 0; i--)
            System.out.print("" + numberArray[i] + "  ");
        System.out.println();
    }
}
