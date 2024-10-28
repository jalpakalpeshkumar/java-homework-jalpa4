package program;

import java.util.Scanner;

/**
 * -Read the numbers from the console entered by the user and print the minimum
 * and maximum number the user has entered.
 * -Before the user enters the number, print the message Enter number:
 * -If the user enters an invalid number, break out of the loop and print the minimum and maximum
 * number.
 * Hint:
 * -Use an endless while loop.
 * -Create a class with the name MinAndMaxInputChallenge
 */


public class MinAndMaxInputChallenge {

    public static void m1() {
        Scanner scanner = new Scanner(System.in);
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        while (true) {
            System.out.print("Enter number: ");
            if (scanner.hasNextInt()) {
                int number = scanner.nextInt();
                if (number < min) {
                    min = number;
                }
                if (number > max) {
                    max = number;
                }
            } else {
                System.out.println("Invalid Number");
                break; // Exit the loop on invalid input
            }
        }

        // Check if any valid numbers were entered
        if (min != Integer.MAX_VALUE && max != Integer.MIN_VALUE) {
            System.out.println("Minimum number: " + min);
            System.out.println("Maximum number: " + max);
        } else {
            System.out.println("No valid numbers were entered.");
        }

        scanner.close();
    }

    public static void main(String[] args) {
        MinAndMaxInputChallenge.m1();
    }


}
