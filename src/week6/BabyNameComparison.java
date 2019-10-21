package week6;

import java.util.Scanner;

public class BabyNameComparison {
    public static void main(String[] args) {
        String input1, input2, input3;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a name >> ");
        input1 = in.nextLine();
        System.out.print("Enter another name >> ");
        input2 = in.nextLine();
        System.out.print("Enter another name >> ");
        input3 = in.nextLine();
        System.out.println("The combinations are:");
        System.out.println(input1 + " " + input2);
        System.out.println(input1 + " " + input3);
        System.out.println(input2 + " " + input1);
        System.out.println(input2 + " " + input3);
        System.out.println(input3 + " " + input1);
        System.out.println(input3 + " " + input2);
    }
}
