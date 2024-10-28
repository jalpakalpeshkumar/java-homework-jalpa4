package program;

/**
 * Display right angle triangle of @ using nested for loops
 * @
 * @@
 * @@@
 * @@@@
 * @@@@@
 */

public class RightAngleTriangle {

    public void j1() {
        int rows = 5; // You can change this value for more rows

        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("@"); // Print @ without a newline
            }
            System.out.println(); // Move to the next line after each row
        }


    }

    public static void main(String[] args) {
        RightAngleTriangle obj = new RightAngleTriangle();
        obj.j1();
    }
}
