public class StringUtil {
    public static void main(String[] args) {

        StringUtil util = new StringUtil();
        System.out.println(util.concatHelloWorld()); // 1.1
        System.out.println(util.concatNumbersAndWord()); // 1.2
        System.out.println(util.concatStringNumberWord()); // 1.3
        System.out.println(util.concatWordNumbersWord()); // 1.4
        util.printEachWordOnNewLine("We Are Living In"); // 2
        System.out.println(util.reverseString("Letting")); // 3
        System.out.println(util.countTokenOccurrences("We are living in a yellow submarine. We don't have anything", "in")); // 4
        System.out.println(util.toUpperCaseUsingString("hello")); // 5
        System.out.println(util.toUpperCaseUsingBuilder("hello")); // 5.1
        System.out.println(util.padWithStarsUntil20("Madness")); // 6
        System.out.println(util.removeLetterA("We are living in a yellow submarine. We don't have anything.")); // 7
        System.out.println(util.removeLetterAUsingBuilder("We are living in a yellow submarine. We don't have anything.")); // 7.1
        System.out.println(util.replaceAWithStar("We are living in a yellow submarine. We don't have anything.")); // 8
        System.out.println(util.findLongestWord("We are living in a yellow submarine. We don't have anything")); // 9
        System.out.println(util.indexOfFirstA("We are living in a yellow submarine. We don't have anything.")); // 10
        System.out.println(util.substringToN("We are living in a yellow submarine. We don't have anything.", 9)); // 11
        System.out.println(util.substringToNUsingBuilder("We are living in a yellow submarine. We don't have anything.", 16)); // 11.1
        System.out.println(util.checkNotEmpty("")); // 12
        System.out.println(util.isNotNullOrEmpty("aa")); // 12.1
        System.out.println(util.findLongestWordSplitByComma("We, are, living, in an, yellow, submarine, We don't, have anything")); // 13
    }

    /**
     * Concatenates "hello" and "world" with a space.
     * @return Combined string "hello world"
     */
    public String concatHelloWorld() {
        return "hello" + " " + "world";
    }

    /**
     * Concatenates integers 1 and 2, then appends "hello".
     * @return Combined result as a string
     */
    public String concatNumbersAndWord() {
        return 1 + 2 + "hello";
    }

    /**
     * Concatenates string "1", integer 2, and string "hello".
     * @return Combined result as a string
     */
    public String concatStringNumberWord() {
        return "1" + 2 + "hello";
    }

    /**
     * Concatenates "hello", integers 1 and 2, and "world".
     * @return Combined result as a string
     */
    public String concatWordNumbersWord() {
        return "hello" + 1 + 2 + "world";
    }

    /**
     * Prints each character of the input string on a new line. Replaces spaces with line breaks.
     * @param input The string to be processed
     */
    public void printEachWordOnNewLine(String input) {
        for (char ch : input.toCharArray()) {
            if (ch == ' ') {
                System.out.println();
            } else {
                System.out.println(ch);
            }
        }
    }

    /**
     * Reverses the given string using StringBuilder.
     * @param input String to reverse
     * @return Reversed string
     */
    public String reverseString(String input) {
        return new StringBuilder(input).reverse().toString();
    }

    /**
     * Counts how many times a specific token appears in a line.
     * @param line Text to search in
     * @param token Word or character to count
     * @return Number of occurrences
     */
    public int countTokenOccurrences(String line, String token) {
        int index = 0, count = 0;
        while ((index = line.indexOf(token, index)) != -1) {
            count++;
            index += token.length();
        }
        return count;
    }

    /**
     * Converts the input string to uppercase using String methods.
     * @param word The input string
     * @return Uppercased string
     */
    public String toUpperCaseUsingString(String word) {
        return word.toUpperCase();
    }

    /**
     * Converts the input string to uppercase using StringBuilder.
     * @param word The input string
     * @return Uppercased string
     */
    public String toUpperCaseUsingBuilder(String word) {
        StringBuilder sb = new StringBuilder();
        for (char ch : word.toCharArray()) {
            sb.append(Character.toUpperCase(ch));
        }
        return sb.toString();
    }

    /**
     * Pads the input string with '*' characters until the total length becomes 20.
     * @param input Input string
     * @return Padded string of length 20
     */
    public String padWithStarsUntil20(String input) {
        StringBuilder sb = new StringBuilder(input);
        while (sb.length() < 20) {
            sb.append("*");
        }
        return sb.toString();
    }

    /**
     * Removes all occurrences of the letter 'a' using String.replace.
     * @param input Input text
     * @return Modified string without 'a'
     */
    public String removeLetterA(String input) {
        return input.replace("a", "");
    }

    /**
     * Removes all occurrences of the letter 'a' using StringBuilder.
     * @param input Input text
     * @return Modified string without 'a'
     */
    public String removeLetterAUsingBuilder(String input) {
        StringBuilder sb = new StringBuilder();
        for (char ch : input.toCharArray()) {
            if (ch != 'a') sb.append(ch);
        }
        return sb.toString();
    }

    /**
     * Replaces all occurrences of 'a' with '*' using String.replace.
     * @param input Input string
     * @return Modified string
     */
    public String replaceAWithStar(String input) {
        return input.replace("a", "*");
    }

    /**
     * Finds the longest word in a sentence. Words are separated by spaces.
     * @param line Input sentence
     * @return Longest word found
     */
    public String findLongestWord(String line) {
        String[] words = line.split(" ");
        String longest = "";
        for (String word : words) {
            if (word.length() > longest.length()) {
                longest = word;
            }
        }
        return longest;
    }

    /**
     * Finds the index of the first occurrence of the character 'a' in a string.
     * @param input Input string
     * @return Index of the first 'a', or -1 if not found
     */
    public int indexOfFirstA(String input) {
        return input.indexOf('a');
    }

    /**
     * Returns a substring from the beginning to the nth index.
     * @param input Input string
     * @param n End index (exclusive)
     * @return Substring from 0 to n
     */
    public String substringToN(String input, int n) {
        if (n > input.length()) return input;
        return input.substring(0, n);
    }

    /**
     * Returns a substring from the beginning to the nth index using StringBuilder.
     * @param input Input string
     * @param n End index (exclusive)
     * @return Substring from 0 to n
     */
    public String substringToNUsingBuilder(String input, int n) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < input.length() && i < n; i++) {
            sb.append(input.charAt(i));
        }
        return sb.toString();
    }

    /**
     * Checks whether the given string is not empty.
     * @param input Input string
     * @return Status message
     */
    public String checkNotEmpty(String input) {
        return !input.isEmpty() ? "Not empty" : "Empty";
    }

    /**
     * Checks if the given string is not null and not empty.
     * @param input Input string
     * @return true if valid, false otherwise
     */
    public boolean isNotNullOrEmpty(String input) {
        return input != null && !input.isEmpty();
    }

    /**
     * Finds the longest word from a comma-separated list.
     * @param input Input string
     * @return Longest word
     */
    public String findLongestWordSplitByComma(String input) {
        String[] words = input.split(",");
        String longest = "";
        for (String word : words) {
            if (word.length() > longest.length()) {
                longest = word;
            }
        }
        return longest;
    }
}
