package homework5
import java.util.Scanner;

/**
 * StringUtil provides various utility methods for String and StringBuilder manipulations.
 */
public class StringUtil {

    /**
     * 1. Performs various concatenations based on parameters.
     */
    public static void concatenateExamples() {
        // 1.1 "hello", "world"
        System.out.println("hello" + "world");

        // 1.2 1, 2, "hello" -> (1+2) then concat "hello" = "3hello"
        System.out.println(1 + 2 + "hello");

        // 1.3 "1", 2, "hello" -> "12hello"
        System.out.println("1" + 2 + "hello");

        // 1.4 "hello", 1, 2, "world" -> "hello12world"
        System.out.println("hello" + 1 + 2 + "world");
    }

    /**
     * 2. Prints each word on a new line by replacing spaces with newline literals.
     * @param text The input string.
     */
    public static void printEachWordNewLine(String text) {
        System.out.println(text.replace(" ", "\n"));
    }

    /**
     * 3. Reverses the given string.
     * @param text The string to reverse.
     * @return The reversed string.
     */
    public static String reverseString(String text) {
        return new StringBuilder(text).reverse().toString();
    }

    /**
     * 4. Counts occurrences of a substring (token) within a line.
     * @param line The main text.
     * @param token The substring to count.
     * @return count of occurrences.
     */
    public static int countSubString(String line, String token) {
        if (token.isEmpty()) return 0;
        int count = 0;
        int index = 0;
        while ((index = line.indexOf(token, index)) != -1) {
            count++;
            index += token.length();
        }
        return count;
    }

    /**
     * 5a. Converts text to uppercase using String.
     * @param text Input text.
     * @return Uppercase text.
     */
    public static String toUpperCaseString(String text) {
        return text.toUpperCase();
    }

    /**
     * 5b. Converts text to uppercase using StringBuilder.
     * @param text Input text.
     * @return Uppercase text.
     */
    public static String toUpperCaseBuilder(String text) {
        StringBuilder sb = new StringBuilder(text);
        for (int i = 0; i < sb.length(); i++) {
            sb.setCharAt(i, Character.toUpperCase(sb.charAt(i)));
        }
        return sb.toString();
    }

    /**
     * 6. Reads line, ensures it is 20 chars long, pads with '*' if shorter.
     */
    public static void readAndPadString() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter text: ");
        String input = scanner.nextLine();

        if (input.length() < 20) {
            StringBuilder sb = new StringBuilder(input);
            while (sb.length() < 20) {
                sb.append('*');
            }
            input = sb.toString();
        }
        System.out.println(input);
    }

    /**
     * 7a. Removes all 'a' characters using String.
     */
    public static String removeA(String text) {
        return text.replace("a", "");
    }

    /**
     * 7b. Removes all 'a' characters using StringBuilder.
     */
    public static String removeABuilder(String text) {
        StringBuilder sb = new StringBuilder(text);
        for (int i = 0; i < sb.length(); i++) {
            if (sb.charAt(i) == 'a') {
                sb.deleteCharAt(i);
                i--; // Adjust index after deletion
            }
        }
        return sb.toString();
    }

    /**
     * 8. Replaces all 'a' characters with '*' using String.
     */
    public static String replaceAWithStar(String text) {
        return text.replace('a', '*');
    }

    /**
     * 9. Finds the longest word in a space-separated string.
     */
    public static String findLongestWord(String text) {
        String[] words = text.split(" ");
        String longest = "";
        for (String word : words) {
            // Removing potential trailing punctuation like '.' for accuracy
            String cleanWord = word.replaceAll("[^a-zA-Z]", "");
            if (cleanWord.length() > longest.length()) {
                longest = cleanWord;
            }
        }
        return longest;
    }

    /**
     * 10. Finds the first index of character c.
     */
    public static int findFirstIndex(String text, String c) {
        return text.indexOf(c);
    }

    /**
     * 11a. Prints substring from start to index n using String.
     */
    public static void printSubLine(String line, int n) {
        if (n <= line.length()) {
            System.out.println(line.substring(0, n));
        }
    }

    /**
     * 11b. Prints substring from start to index n using StringBuilder.
     */
    public static void printSubLine(StringBuilder line, int n) {
        if (n <= line.length()) {
            System.out.println(line.substring(0, n));
        }
    }

    /**
     * 12. Checks if String is not null and not empty.
     */
    public static boolean isNotNullOrEmpty(String text) {
        return text != null && !text.isEmpty();
    }

    /**
     * 13. Splits by comma and finds the longest segment.
     */
    public static String findLongestByComma(String text) {
        String[] parts = text.split(",");
        String longest = "";
        for (String part : parts) {
            String trimmed = part.trim();
            if (trimmed.length() > longest.length()) {
                longest = trimmed;
            }
        }
        return longest;
    }

    public static void main(String[] args) {
        // Test calls can be added here
        System.out.println("--- Results ---");
        concatenateExamples();
        System.out.println("Reverse 'sample': " + reverseString("sample"));
        System.out.println("Longest word: " + findLongestWord("We are living in an yellow submarine."));
        System.out.println("Index of 'a': " + findFirstIndex("We are living in an yellow submarine.", "a"));
    }
}