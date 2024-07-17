package arrays;

import java.util.ArrayList;

/**
 * <h1>All Zeroes End</h1>
 * You are given a set of cards, each having either a number or a symbol. Your task is to rearrange the cards in such a way that all the cards with numbers come first,
 * followed by the cards with symbols, while maintaining the relative order of numbers and symbols.
 * <p>
 * Example :
 * <p>
 * Input:
 * <p>
 * 8
 * <p>
 * 3 2 + 4 * - $ 5
 * <p>
 * Output:
 * <p>
 * 3  2 4 5 + * - $
 * <p>
 * Input Format:
 * <p>
 * The first line of input contains an integer N (1 ≤ N ≤ 10^5), representing the number of cards.
 * The second line of input contains N space-separated elements, where each element is either a positive integer or a single symbol ('+', '-', '*', '$', etc.).
 * Output Format:
 * <p>
 * Output the rearranged set of cards on a single line, separated by spaces.
 * Constraints :
 * <p>
 * 1 ≤ N ≤ 10^5
 */
public class ReorderCards {

    public static void sortCards(ArrayList<String> cards, int n) {
        ArrayList<String> numbers = new ArrayList<>();
        ArrayList<String> symbols = new ArrayList<>();

        for (String card : cards) {
            if (Character.isDigit(card.charAt(0)))
                numbers.add(card);
            else
                symbols.add(card);
        }

        StringBuilder output = new StringBuilder();
        for(String number : numbers){
            output.append(number).append(" ");
        }
        for (String symbol : symbols){
            output.append(symbol).append(" ");
        }
        System.out.println(output.toString());

    }

    public static void main(String[] args) {
        ArrayList<String> cards = new ArrayList<>();
        cards.add("3");
        cards.add("2");
        cards.add("+");
        cards.add("4");
        cards.add("*");
        cards.add("-");
        cards.add("$");
        cards.add("5");
        sortCards(cards, cards.size());

    }
}
