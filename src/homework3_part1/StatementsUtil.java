package homework3_part1;

public class StatementsUtil {
    /**
     * 1. Check odd or even
     */
    public static void checkEvenOdd(int x) {
        if (x % 2 == 0) {
            System.out.println(x + " is even");
        } else {
            System.out.println(x + " is odd");
        }
    }

    /**
     * 2. Checks if an integer is positive or negative.
     */
    public static void checkPositiveNegative(int x) {
        if (x < 0) {
            System.out.println(x + " is negative");
        } else if (x > 0) {
            System.out.println(x + " is positive");
        } else {
            System.out.println(x + " is zero");
        }
    }

    /**
     * 3. Checks if x is in range (5, 8) OR (15, 20).
     */
    public static void checkRange(int x) {
        if (x > 5 && x < 8) {
            System.out.println("Range of " + x + " is (5, 8");
        } else if (x > 15 && x < 20) {
            System.out.println("Range of " + x + " is (15, 20)");
        } else {
            System.out.println("other renge");
        }
    }

    /**
     * 4. Checks if a number is divisible by both 5 and 7.
     */
    public static void checkDivision(int x) {
        if (x % 5 == 0 && x % 7 == 0) {
            System.out.println(x + " is divisible");
        } else {
            System.out.println(x + " is not divisible");
        }
    }

    /**
     * 5. Checks if the second digit of a three-digit number is 7.
     */
    public static void checkSecondDigitSeven(int x) {
        int secondDight = (x / 10) % 10;
        if (secondDight == 7) {
            System.out.println("true");
        }else {
            System.out.println(false);
        }
    }

    /**
     * 6. Checks if point (x, y) is inside a circle with center (0,0) and radius 5
     */

    public static void isInsideCircle(int x, int y) {
        int r = 5;
        if ((x * x) + (y * y) < (r * r)) {
            System.out.println("the point is in the circle");
        } else if ((x * x) + (y * y) == (r * r)) {
            System.out.println("the point is on the circle");
        }else {
            System.out.println("the  point is out of the circle");
        }
    }

    /**
     * 7. Finds the largest of three numbers.
     */
    public static void findLargest(int x, int y, int z) {
        int max = x;
        if (max < y) {
            max = y;
        }

        if (max < z) {
            max = z;
        }
        System.out.println(max);
    }

    /**
     * 8. Checks if a year is a leap year.
     */

    public static void checkYear(int x) {
        if ((x % 4 == 0 && x % 100 != 0) || (x % 400 == 0)) {
            System.out.println(x + " is leap year");
        }else {
            System.out.println(x + " is not leap year");
        }
    }

    /**
     * 11. Prints numbers from 1 to 200.
     */
    public static void printOneToTwoHundred() {
        for (int i = 0; i < 201; i++) {
            System.out.println(i);
        }
    }

    /**
     * 12. Prints the first digit of a given number.
     */

    public static void findFirstDight(int x) {
        while (x >= 10) {
            x /= 10;
        }
        System.out.println("First dight is " + x);
    }

    /**
     * 13. Prints x + y while x < 5 and y < 10.
     */

    public static void findSum() {
        int x = 0;
        int y = 0;
        while (x < 5 && y < 10) {
            System.out.println("x+y=" + (x + y));
            x++;
            y++;
        }
    }

    /**
     * 15. Reads N from console and sums all numbers in [1, N] divisible by 5.
     */
    public static void sumDivisibleByFive(int x) {
        int sum = 0;
        for (int i = 0; i < x; i++) {
            if (i % 5 == 0){
                sum += i;
            }
        }
        System.out.println("Sum of numbers divisible by 5: " + sum);
    }

//    /**
//     * 16. Calculates product of all two-digit even numbers in [1, N].
//     */
//    public static void productTwoDigitEvens(int n) {
//        int sum = 0;
//        for (int i = 0; i < n; i++) {
//            if (i % 2 == 0 && i <= 99 && i >= 10) {
//                sum *= i;
//            }
//        }
//        System.out.println("Sum is" + sum);
//    }

    /**
     * 17. Finds arithmetic mean of the smallest and largest elements in [1, N].
     */
    public static void meanOfMinMax(int n) {
        if (n < 1) {
            System.out.println("Invalid range.");
            return;
        }
        int min = 1;
        double average = (min + n) / 2.0;
        System.out.println("Mean of " + min + " and " + n + " is: " + average);
    }


    public static void main(String[] args) {
        checkEvenOdd(5);
        checkPositiveNegative(2);
        checkRange(17);
        checkDivision(35);
        checkSecondDigitSeven(572);
        isInsideCircle(4, 2);
        findLargest(4,5,6);
        printOneToTwoHundred();
        checkYear(2020);
        findFirstDight(52);
        findSum();
        sumDivisibleByFive(16);
        meanOfMinMax(35);
    }
}
