package week5;

import java.util.Arrays;
import java.util.Scanner;


public class AscendingAndDescending {
    public static void main(String[] args) {
        int[] myIntArray;
        System.out.println("Enter the length of array");
        Scanner length = new Scanner(System.in);
        int n = length.nextInt();
        myIntArray = new int[n];
        System.out.println("Enter the integers: ");
        Scanner numbers = new Scanner(System.in);
        for (int i = 0; i < myIntArray.length; i++) {
            myIntArray[i] = numbers.nextInt();
        }
        Arrays.sort(myIntArray); // sorted to ascending
        System.out.println("sorted ascending array" + Arrays.toString(myIntArray));

        //due to primitve int type reverse order of sorted array
        for (int i = 0; i < myIntArray.length / 2; i++) { //divided length by 2 so the positions can be reversed
            int temp = myIntArray[i];
            myIntArray[i] = myIntArray[myIntArray.length - i - 1]; //  -1 to be in array counting form,-i to give top position
            myIntArray[myIntArray.length - i - 1] = temp;
        }
        System.out.println("sorted descending array" + Arrays.toString(myIntArray));
    }

}
