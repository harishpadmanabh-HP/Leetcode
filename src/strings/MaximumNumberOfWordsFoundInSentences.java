package strings;

/**
 * 2114. Maximum Number of Words Found in Sentences
 * <p>
 * A sentence is a list of words that are separated by a single space with no leading or trailing spaces.
 * <p>
 * You are given an array of strings sentences, where each sentences[i] represents a single sentence.
 * <p>
 * Return the maximum number of words that appear in a single sentence.
 * <p>
 * <p>
 * <p>
 * Example 1:
 * <p>
 * Input: sentences = ["alice and bob love leetcode", "i think so too", "this is great thanks very much"]
 * Output: 6
 * Explanation:
 * - The first sentence, "alice and bob love leetcode", has 5 words in total.
 * - The second sentence, "i think so too", has 4 words in total.
 * - The third sentence, "this is great thanks very much", has 6 words in total.
 * Thus, the maximum number of words in a single sentence comes from the third sentence, which has 6 words.
 */
public class MaximumNumberOfWordsFoundInSentences {
    public static int mostWordsFound(String[] sentences) {
        int maxWords = 0;
        for (String sentance : sentences){
            int words = sentance.split(" ").length;
            if(words>maxWords)
                maxWords=words;
        }
        return maxWords;
    }


    public static void main(String[] args) {
        String[] sentences = {"alice and bob love leetcode", "i think so too", "this is great thanks very much"};
        System.out.println(mostWordsFound(sentences));
    }
}
