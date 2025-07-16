public class Statements {

    /**
     * Checks if a number is even.
     * @param x the integer to check
     * @return true if x is even, false otherwise
     */
    public static boolean isEven(int x) {
        return x % 2 == 0;
    }

    /**
     * Checks if a number is positive.
     * @param x the integer to check
     * @return true if x is positive, false otherwise
     */
    public static boolean isPositive(int x) {
        return x >= 0;
    }

    /**
     * Checks if the number is in either (5,8) or (15,20) interval.
     * @param x the integer to check
     * @return true if in range
     */
    public static boolean isInInterval(int x) {
        return (x > 5 && x < 8) || (x > 15 && x < 20);
    }

    /**
     * Checks if the number is divisible by 5 and 7.
     * @param x the integer to check
     * @return true if divisible by 5 and 7
     */
    public static boolean isDivisibleBy5And7(int x) {
        return x % 5 == 0 && x % 7 == 0;
    }

    /**
     * Checks if the second digit of a three-digit number is 7.
     * @param x the integer to check
     * @return true if second digit is 7
     */
    public static boolean isSecondDigitSeven(int x) {
        if (x < 0) x = -x;
        if (x < 100 || x > 999) return false;
        int secondDigit = (x / 10) % 10;
        return secondDigit == 7;
    }

    /**
     * Checks if point (x, y) is inside or on the circle with center (0,5) and radius 5.
     * @param x x-coordinate
     * @param y y-coordinate
     * @return true if inside or on circle
     */
    public static boolean isInCircle(int x, int y) {
        return x*x+y*y <= 25
    }

    /**
     * Returns the maximum of three numbers.
     * @param a first number
     * @param b second number
     * @param c third number
     * @return the maximum value
     */
    public static int maxOfThree(int a, int b, int c) {
        int max = a;
        if (b > max) {
            max = b;
        }
        if (c > max) {
            max = c;
        }
        return max;
    }

    /**
     * Checks if the given year is a leap year.
     * @param year the year
     * @return true if leap year
     */
    public static boolean isLeapYear(int year) {
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                return year % 400 == 0;
            }
            return true;
        }
        return false;
    }

    /**
     * Prints numbers from 1 to 200.
     */
    public static void printNumbersTo200() {
        for (int i = 1; i <= 200; i++) {
            System.out.println(i);
        }
    }

    /**
     * Prints the first digit of a number.
     * @param number the number
     */
    public static void printFirstDigit(int number) {
        if (number < 0) number = -number;
        while (number >= 10) {
            number = number / 10;
        }
        System.out.println(number);
    }

    /**
     * Prints x + y while x < 5 and y < 10.
     * @param x the first value
     * @param y the second value
     */
    public static void printXPlusYLoop(int x, int y) {
        while (x < 5 && y < 10) {
            System.out.println(x + y);
            x++;
            y++;
        }
    }

    /**
     * Prints a square using '*' character.
     * @param n the size of the square
     */
    public static void printSquare(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    /**
     * Calculates sum of all numbers from 1 to N that are divisible by 5.
     * @param n the upper limit
     * @return the sum
     */
    public static int sumDivisibleBy5(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 5 == 0) {
                sum += i;
            }
        }
        return sum;
    }

    /**
     * Calculates the product of all even two-digit numbers up to N.
     * @param n the upper limit
     * @return the product
     */
    public static long productOfTwoDigitEvens(int n) {
        long product = 1;
        for (int i = 10; i <= n && i <= 98; i+2) {
                product *= i;
        }
        return product;
    }

    /**
     * Calculates average of min and max between 1 and N.
     * @param n upper limit
     * @return average as double
     */
    public static double averageOfMinMax(int n) {
        int min = 1;
        int max = n;
        return (min + max) / 2.0;
    }

    /**
     * Calculates the sum of digits of a five-digit number.
     * @param number the five-digit number
     * @return sum of digits
     */
    public static int sumOfDigits(int number) {
        if (number < 0) number = -number;
        int sum = 0;
        int count = 0;
        while (count < 5) {
            sum += number % 10;
            number = number / 10;
            count++;
        }
        return sum;
    }

    /**
     * Main method to test all functions.
     */
    public static void main(String[] args) {
        System.out.println(isEven(6));
        System.out.println(isPositive(-3));
        System.out.println(isInInterval(6));
        System.out.println(isDivisibleBy5And7(35));
        System.out.println(isSecondDigitSeven(974));
        System.out.println(maxOfThree(3, 9, 7));
        System.out.println(isLeapYear(2020));
        printNumbersTo200();
        printFirstDigit(4872);
        printXPlusYLoop(1, 0);
        printSquare(4);
        System.out.println(sumDivisibleBy5(25));
        System.out.println(productOfTwoDigitEvens(20));
        System.out.println(averageOfMinMax(100));
        System.out.println(sumOfDigits(54321));
    }
}
