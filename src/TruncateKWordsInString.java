/**
 * A sentence is a list of words that are separated by a single space with no leading or trailing spaces. Each of the words consists of only uppercase and lowercase English letters (no punctuation).
 *
 * For example, "Hello World", "HELLO", and "hello world hello world" are all sentences.
 * You are given a sentence s​​​​​​ and an integer k​​​​​​. You want to truncate s​​​​​​ such that it contains only the first k​​​​​​ words. Return s​​​​​​ after truncating it.
 *
 * Input Format:
 *
 * First line takes a string 's' as input which represents the sentence which is to be truncated.
 *
 * Second line takes an integer 'k' as input which denotes the the first k​​​​​​ words that are to be truncated from s.
 *
 * Output format:
 *
 * Return s​​​​​​ after truncating it.
 *
 * Example 1
 * Input
 *  s = "Hello how are you Contestant", k = 4
 * Output
 * "Hello how are you"
 */

public class TruncateKWordsInString {
    public static String onlyKString(String s, int k) {
        if (!s.matches("^[a-zA-Z]+( [a-zA-Z]+)*$")) {
            System.out.println("Invalid input: The sentence contains invalid characters.");
            return "";
        }

        String[] words = s.split(" "); // Split the sentence into words
        StringBuilder truncated = new StringBuilder();

        // Append the first k words to the truncated string
        for (int i = 0; i < k; i++) {
            truncated.append(words[i]);
            if (i < k - 1) // Add a space after each word except the last one
                truncated.append(" ");
        }
        return truncated.toString();

    }

    public static void main(String[] args) {
        String input = " What is the solution to this problem";
        System.out.println(onlyKString(input,4));
    }
}
