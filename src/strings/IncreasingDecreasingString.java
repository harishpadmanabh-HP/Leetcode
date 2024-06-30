package strings;


/**
 * 1370. Increasing Decreasing String
 * Easy
 * Topics
 * Companies
 * Hint
 * You are given a string s. Reorder the string using the following algorithm:
 * <p>
 * Pick the smallest character from s and append it to the result.
 * Pick the smallest character from s which is greater than the last appended character to the result and append it.
 * Repeat step 2 until you cannot pick more characters.
 * Pick the largest character from s and append it to the result.
 * Pick the largest character from s which is smaller than the last appended character to the result and append it.
 * Repeat step 5 until you cannot pick more characters.
 * Repeat the steps from 1 to 6 until you pick all characters from s.
 * In each step, If the smallest or the largest character appears more than once you can choose any occurrence and append it to the result.
 * <p>
 * Return the result string after sorting s with this algorithm.
 * <p>
 * <p>
 * <p>
 * Example 1:
 * <p>
 * Input: s = "aaaabbbbcccc"
 * Output: "abccbaabccba"
 * Explanation: After steps 1, 2 and 3 of the first iteration, result = "abc"
 * After steps 4, 5 and 6 of the first iteration, result = "abccba"
 * First iteration is done. Now s = "aabbcc" and we go back to step 1
 * After steps 1, 2 and 3 of the second iteration, result = "abccbaabc"
 * After steps 4, 5 and 6 of the second iteration, result = "abccbaabccba"
 */
public class IncreasingDecreasingString {
    public static String sortString(String s) {
        // Count the frequency of each character
        int[] count = new int[26];
        for (char c : s.toCharArray()) {
            count[c - 'a']++;
        }

        // Initialize an empty result string
        StringBuilder result = new StringBuilder();

        // Loop until the result string has the same length as the input string
        while (result.length() < s.length()) {
            // Append characters from 'a' to 'z'
            for (int i = 0; i < 26; i++) {
                if (count[i] > 0) {
                    result.append((char) ('a' + i));
                    count[i]--;
                }
            }
            // Append characters from 'z' to 'a'
            for (int i = 25; i >= 0; i--) {
                if (count[i] > 0) {
                    result.append((char) ('a' + i));
                    count[i]--;
                }
            }
        }

        return result.toString();
    }


    public static void main(String[] args) {
        String input = "aaaabbbbcccc";
        System.out.println(sortString(input));
    }
}
