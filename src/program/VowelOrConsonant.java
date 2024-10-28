package program;

import java.util.Scanner;

/**
 *  Write a Java program that takes the user to provide a single character from the
 * alphabet. Print Vowel of Consonant, depending on the user input. If the user input
 * Is not a letter (between a and z or A and Z), or is a string of length > 1, print an
 * error message.
 * For eg:
 * Input an alphabet: p
 * Expected Output:
 * Input letter is Consonant
 */

public class VowelOrConsonant {

    public void vowel(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input an alphabet: ");

        String input = scanner.nextLine();

        // Check if the input is valid (a single character)
        if (input.length() != 1 || !Character.isLetter(input.charAt(0))) {
            System.out.println("Error: Please enter a single letter from the alphabet.");
        } else {
            char ch = Character.toLowerCase(input.charAt(0)); // Convert to lowercase for easier comparison

            // Determine if the character is a vowel or consonant
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                System.out.println("Input letter is Vowel");
            } else {
                System.out.println("Input letter is Consonant");
            }
        }

        scanner.close();
    }

    public static void main(String[] args) {
        VowelOrConsonant obj = new VowelOrConsonant();
        obj.vowel();
    }
}
