package program;

/**
 *  Print the sequence 1 1 2 3 5 8 13 21 (Fibonacci number)
 */

public class FibonacciSequence {

    public static void m1() {
        int count = 8; // Number of Fibonacci numbers to print
        int first = 1, second = 1; // Starting values
        System.out.print(first + " " + second + " "); // Print the first two numbers

        for (int i = 3; i <= count; i++) { // Start from the 3rd position
            int next = first + second; // Calculate the next Fibonacci number
            System.out.print(next + " "); // Print the next number
            first = second; // Update first to the last second
            second = next; // Update second to the newly calculated next number
        }
    }

    public static void main(String[] args) {
        FibonacciSequence.m1();
    }
}
