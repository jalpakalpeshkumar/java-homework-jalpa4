package program;

/**
 *  Palindrome Number
 * Write a method called isPalindrome with one int parameter called number.
 * The method needs to return a boolean.
 * It should return true if the number is a palindrome number otherwise it should return false.
 * Check the tips below for more info about palindromes.
 * Example Input/Output
 * isPalindrome(-1221); → should return true
 * isPalindrome(707); → should return true
 * isPalindrome(11212); → should return false because the reverse is 21211 and that is not equal to
 * 11212.
 * Tip: What is a Palindrome number? A palindrome number is a number which when reversed is equal
 * to the original number. For example: 121, 12321, and 1001 etc.
 * Tip: Logic to check a palindrome number
 * Find the reverse of the given number. Store it in some variable, say reverse. Compare the number
 * with the reverse.
 * If both are the same then the number is a palindrome otherwise it is not.
 */

public class PalindromeChecker {

    public static boolean isPalindrome(int number) {
        // Store the original number for comparison later
        int originalNumber = number;
        int reverse = 0;

        // Handle negative numbers
        if (number < 0) {
            number = -number;
        }

        // Reverse the number
        while (number > 0) {
            int lastDigit = number % 10; // Extract the last digit
            reverse = reverse * 10 + lastDigit; // Update the reverse number
            number /= 10; // Remove the last digit
        }

        // Compare the original number (absolute value) with the reversed number
        return originalNumber < 0 ? reverse == -originalNumber : reverse == originalNumber;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome(-1221)); // true
        System.out.println(isPalindrome(707));   // true
        System.out.println(isPalindrome(11212)); // false
        System.out.println(isPalindrome(121));   // true
        System.out.println(isPalindrome(-121));  // true
        System.out.println(isPalindrome(12321)); // true
    }


}
