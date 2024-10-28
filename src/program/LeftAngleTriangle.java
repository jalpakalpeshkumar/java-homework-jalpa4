package program;

/**
 *  Display left angle triangle of * using nested for loops
 * *
 * * *
 * * * *
 * * * * *
 * * * * * *
 */

public class LeftAngleTriangle {

    public static void k1() {
        int rows = 5; // Number of rows for the triangle

        for (int i = 1; i <= rows; i++) { // Outer loop for each row
            for (int j = 1; j <= i; j++) { // Inner loop for printing '*'
                System.out.print("* "); // Print '*' followed by a space
            }
            System.out.println(); // Move to the next line after each row
        }
    }

    public static void main(String[] args) {
        LeftAngleTriangle.k1();
    }
}
