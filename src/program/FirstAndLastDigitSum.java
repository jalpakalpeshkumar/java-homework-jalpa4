package program;

/**
 * First And Last Digit Sum
 * Write a method named sumFirstAndLastDigit with one parameter of type int called number.
 * The method needs to find the first and the last digit of the parameter number passed to the method,
 * using a loop and return the sum of the first and the last digit of that number.
 * If the number is negative then the method needs to return -1 to indicate an invalid value.
 * Example input/output
 * * sumFirstAndLastDigit(252); →should return 4, the first digit is 2 and the last is 2 which gives us 2+2 and the sum is 4.
 * * sumFirstAndLastDigit(257); →should return 9, the first digit is 2 and the last is 7 which gives us 2+7 and the sum is 9.
 * * sumFirstAndLastDigit(0); → should return 0, the first digit and the last digit is 0 since we only have 1 digit, which
 * gives us 0+0 and the sum is 0.
 * * sumFirstAndLastDigit(5); → should return 10, the first digit and the last digit is 5 since we only have 1 digit, which
 * gives us 5+5 and the sum is 10.
 * * sumFirstAndLastDigit(-10); → should return -1, since the parameter is negative and needs to be positive.
 */


public class FirstAndLastDigitSum {

    public static void main(String[] args) {
        // Test cases
        System.out.println(sumFirstAndLastDigit(252));  // Output: 4
        System.out.println(sumFirstAndLastDigit(257));  // Output: 9
        System.out.println(sumFirstAndLastDigit(0));    // Output: 0
        System.out.println(sumFirstAndLastDigit(5));    // Output: 10
        System.out.println(sumFirstAndLastDigit(-10));  // Output: -1
    }

    public static int sumFirstAndLastDigit(int number) {
        // Check for negative number
        if (number < 0) {
            return -1;
        }

        // Handle the case for 0
        if (number == 0) {
            return 0;
        }

        int lastDigit = number % 10;  // Get the last digit
        int firstDigit = number;

        // Find the first digit
        while (firstDigit >= 10) {
            firstDigit /= 10;
        }

        // Return the sum of the first and last digits
        return firstDigit + lastDigit;
    }
}
