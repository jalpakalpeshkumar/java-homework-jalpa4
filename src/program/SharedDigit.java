package program;

/**
 *  Shared Digit
 * Write a method named hasSharedDigit with two parameters of type int.
 * Each number should be within the range of 10 (inclusive) - 99 (inclusive). If one of the numbers is not
 * within the range, the method should return false.
 * The method should return true if there is a digit that appears in both numbers, such as 2 in 12 and 23;
 * otherwise, the method should return false.
 * EXAMPLE INPUT/OUTPUT:
 * * hasSharedDigit(12, 23); → should return true since the digit 2 appears in both numbers
 * * hasSharedDigit(9, 99); → should return false since 9 is not within the range of 10-99
 * * hasSharedDigit(15, 55); → should return true since the digit 5 appears in both numbers
 * NOTE: The method hasSharedDigit should be defined as public static
 */

public class SharedDigit {

    public static void main(String[] args) {
        // Test cases
        System.out.println(hasSharedDigit(12, 23)); // Output: true
        System.out.println(hasSharedDigit(9, 99));  // Output: false
        System.out.println(hasSharedDigit(15, 55)); // Output: true
        System.out.println(hasSharedDigit(12, 45)); // Output: false
    }

    public static boolean hasSharedDigit(int num1, int num2) {
        // Check if both numbers are in the range of 10 to 99
        if (num1 < 10 || num1 > 99 || num2 < 10 || num2 > 99) {
            return false;
        }

        // Extract digits from the first number
        int firstDigitNum1 = num1 / 10; // Tens place
        int secondDigitNum1 = num1 % 10; // Ones place

        // Extract digits from the second number
        int firstDigitNum2 = num2 / 10; // Tens place
        int secondDigitNum2 = num2 % 10; // Ones place

        // Check for shared digits
        return (firstDigitNum1 == firstDigitNum2 || firstDigitNum1 == secondDigitNum2 ||
                secondDigitNum1 == firstDigitNum2 || secondDigitNum1 == secondDigitNum2);
    }


}
