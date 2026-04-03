package homework_1;

public class Methods {

    public static void main(String[] args) {
        // You can call your methods here to test them
        System.out.println("Starting the homework_1.Methods application...");
    }

    /**
     * Accepts two integers and returns a constant value.
     * * @param a the first integer
     *
     * @param b the second integer
     * @return always returns 0
     */
    public int returnZero(int a, int b) {
        return 0;
    }

    /**
     * Performs no action and returns no value.
     */
    public void doNothing() {
        // This method is intentionally empty
    }

    /**
     * Prints a greeting based on a boolean condition.
     * * @param flag a boolean input parameter
     */
    public void printHello(boolean flag) {
        System.out.println("Hello World");
    }

    /**
     * Echoes the provided character back to the caller.
     * * @param c the character to return
     *
     * @return the same character provided as input
     */
    public char returnChar(char c) {
        return c;
    }

    /**
     * Accepts two float values and returns the first one.
     * * @param x the first float
     *
     * @param y the second float
     * @return the value of the first parameter (x)
     */
    public float returnOneFloat(float x, float y) {
        return x;
    }

    /**
     * A recursive method that calls itself until a countdown reaches zero.
     * * @param n the starting number for the recursion
     */
    public void recursiveMethod(int n) {
        if (n <= 0) {
            System.out.println("Recursion ends.");
            return;
        }
        System.out.println("Current count: " + n);
        // Method calls itself
        recursiveMethod(n - 1);
    }
}