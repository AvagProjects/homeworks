public class StringUtil {

    public static void main(String[] args) {

        System.out.println("1․ Concatenation Examples:");
        concatExamples();

        System.out.println("2․ Print each word from string (without split):");
        printWordsNewLine("The quick brown fox jumps over the lazy dog");

        System.out.println("3․ Reverse a string:");
        System.out.println(reverse("sample"));

        System.out.println("4․ Count how many times 'an' appears:");
        System.out.println("Count: " + countSubString("The quick brown fox jumps over a lazy dog and finds an apple", "an"));

        System.out.println("5․ Uppercase using StringBuilder:");
        System.out.println(toUpperCaseBuilder("hello world"));

        System.out.println("6․ Pad string to 20 characters:");
        System.out.println(padToTwenty("Armenia"));

        System.out.println("7․ Remove all 'a' characters:");
        System.out.println(removeAUsingBuilder("The quick brown fox jumps over a lazy dog and finds an apple"));

        System.out.println("8․ Replace all 'a' with '*':");
        System.out.println(replaceAWithStarBuilder("The quick brown fox jumps over a lazy dog and finds an apple"));

        System.out.println("9․ Find the longest word:");
        System.out.println("Longest: " + findLongestWordBuilder("The quick brown fox jumps over a lazy dog and finds an apple"));

        System.out.println("10․ The first time the letter 'a' appears is at index:");
        System.out.println("Index: " + findCharIndex("The quick brown fox jumps over a lazy dog and finds an apple", "a"));

        System.out.println("11․ Print substring from 0 to n:");
        printSubLine("Hello World!", 5);
        printSubLine(new StringBuilder("Hello World!"), 5);

        System.out.println("12․ Is string not empty?");
        System.out.println(isNotEmpty("Test"));

        System.out.println("13․ Longest part separated by comma:");
        System.out.println("Longest: " + longestAfterComma("Quick, brown, fox, jumps high, over the dog, and catches something"));
    }

    public static void concatExamples() {
        System.out.println("hello" + "world");
        System.out.println(1 + 2 + "hello");
        System.out.println("1" + 2 + "hello");
        System.out.println("hello" + 1 + 2 + "world");
    }

    public static void printWordsNewLine(String line) {
        StringBuilder word = new StringBuilder();
        for (int i = 0; i < line.length(); i++) {
            char c = line.charAt(i);
            if (c != ' ') {
                word.append(c);
            } else {
                if (word.length() > 0) {
                    System.out.println(word.toString());
                    word.setLength(0);
                }
            }
        }
        if (word.length() > 0) {
            System.out.println(word.toString());
        }
    }

    public static String reverse(String str) {
        return new StringBuilder(str).reverse().toString();
    }

    public static int countSubString(String line, String token) {
        int count = 0;
        int index = 0;
        while ((index = line.indexOf(token, index)) != -1) {
            count++;
            index += token.length();
        }
        return count;
    }

    public static String toUpperCaseBuilder(String text) {
        StringBuilder sb = new StringBuilder(text);
        for (int i = 0; i < sb.length(); i++) {
            sb.setCharAt(i, Character.toUpperCase(sb.charAt(i)));
        }
        return sb.toString();
    }

    public static String padToTwenty(String line) {
        StringBuilder sb = new StringBuilder(line);
        while (sb.length() < 20) {
            sb.append("*");
        }
        return sb.toString();
    }

    public static String removeAUsingBuilder(String text) {
        StringBuilder sb = new StringBuilder(text);
        for (int i = 0; i < sb.length(); i++) {
            if (sb.charAt(i) == 'a') {
                sb.deleteCharAt(i);
                i--;
            }
        }
        return sb.toString();
    }

    public static String replaceAWithStarBuilder(String text) {
        StringBuilder sb = new StringBuilder(text);
        for (int i = 0; i < sb.length(); i++) {
            if (sb.charAt(i) == 'a') {
                sb.setCharAt(i, '*');
            }
        }
        return sb.toString();
    }

    public static String findLongestWordBuilder(String text) {
        StringBuilder word = new StringBuilder();
        String longest = "";
        for (int i = 0; i <= text.length(); i++) {
            if (i < text.length() && text.charAt(i) != ' ') {
                word.append(text.charAt(i));
            } else {
                if (word.length() > longest.length()) {
                    longest = word.toString();
                }
                word.setLength(0);
            }
        }
        return longest;
    }

    public static int findCharIndex(String line, String c) {
        return line.indexOf(c);
    }

    public static void printSubLine(String line, int n) {
        System.out.println(line.substring(0, Math.min(n + 1, line.length())));
    }

    public static void printSubLine(StringBuilder line, int n) {
        System.out.println(line.substring(0, Math.min(n + 1, line.length())));
    }

    public static boolean isNotEmpty(String input) {
        return input != null && !input.isEmpty();
    }

    public static String longestAfterComma(String sentence) {
        StringBuilder part = new StringBuilder();
        String longest = "";
        for (int i = 0; i <= sentence.length(); i++) {
            if (i < sentence.length() && sentence.charAt(i) != ',') {
                part.append(sentence.charAt(i));
            } else {
                String trimmed = part.toString().trim();
                if (trimmed.length() > longest.length()) {
                    longest = trimmed;
                }
                part.setLength(0);
            }
        }
        return longest;
    }
}
