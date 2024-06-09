package strings;

import java.util.*;

/**
 * 2103. Rings and Rods
 * Easy
 * Topics
 * Companies
 * Hint
 * There are n rings and each ring is either red, green, or blue. The rings are distributed across ten rods labeled from 0 to 9.
 * <p>
 * You are given a string rings of length 2n that describes the n rings that are placed onto the rods. Every two characters in rings forms a color-position pair that is used to describe each ring where:
 * <p>
 * The first character of the ith pair denotes the ith ring's color ('R', 'G', 'B').
 * The second character of the ith pair denotes the rod that the ith ring is placed on ('0' to '9').
 * For example, "R3G2B1" describes n == 3 rings: a red ring placed onto the rod labeled 3, a green ring placed onto the rod labeled 2, and a blue ring placed onto the rod labeled 1.
 * <p>
 * Return the number of rods that have all three colors of rings on them.
 * <p>
 * Input: rings = "B0B6G0R6R0R6G9"
 * Output: 1
 * Explanation:
 * - The rod labeled 0 holds 3 rings with all colors: red, green, and blue.
 * - The rod labeled 6 holds 3 rings, but it only has red and blue.
 * - The rod labeled 9 holds only a green ring.
 * Thus, the number of rods with all three colors is 1.
 */
public class RingsAndRods {
    public static int countPoints(String rings) {
        int counter=0;
        char[] input = rings.toCharArray();
        Map<Character, String> countMap = new HashMap<>();
        int i = 0;
        while (i < input.length) {
            if (!Character.isDigit(input[i])){
                String current = countMap.getOrDefault(input[i + 1], "");
                current = current + input[i];
                countMap.put(input[i+1],current);
                i+=2;
            }
        }
        for(Map.Entry<Character,String> entry : countMap.entrySet()){
            if(entry.getValue().contains("R") && entry.getValue().contains("G") && entry.getValue().contains("B")){
                counter++;
            }
        }
        return counter;
    }

    public static void main(String[] args) {
        String input = "B0B6G0R6R0R6G9";
        System.out.println(countPoints(input));
    }
}
