package strings;

import java.util.HashSet;
import java.util.Set;

/**
 * 1832. Check if the Sentence Is Pangram
 * Easy
 * Topics
 * Companies
 * Hint
 * A pangram is a sentence where every letter of the English alphabet appears at least once.
 * <p>
 * Given a string sentence containing only lowercase English letters, return true if sentence is a pangram, or false otherwise.
 * <p>
 * <p>
 * <p>
 * Example 1:
 * <p>
 * Input: sentence = "thequickbrownfoxjumpsoverthelazydog"
 * Output: true
 * Explanation: sentence contains at least one of every letter of the English alphabet.
 * Example 2:
 * <p>
 * Input: sentence = "leetcode"
 * Output: false
 * <p>
 * <p>
 * Constraints:
 * <p>
 * 1 <= sentence.length <= 1000
 * sentence consists of lowercase English letters.
 */

public class Pangram {
    public static boolean checkIfPangram(String sentence) {
        if (sentence.length() < 26)
            return false;
        Set<Character> output = new HashSet<>();
        for(char c : sentence.toCharArray()){
            if(!output.contains(c))
                output.add(c);
        }
        return output.size()==26;


    }

    public static void main(String[] args) {
        String input = "thequickbrownfoxjumpsoverthelazydog";
        System.out.println(checkIfPangram(input));
    }
}
