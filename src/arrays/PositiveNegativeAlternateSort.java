package arrays;

import java.util.*;

/**
 * <h1>Positive Negative Alternate</h1>
 * In a town, residents have a unique way of arranging numbers in arrays. They prefer to maintain an alternating pattern of Negative and positive numbers to create a harmonious sequence. However, sometimes they need a little help rearranging their arrays to achieve this pattern.
 *
 * <h2>Task</h2>
 * <p>
 * As an assistant to the townspeople of Alternville, your task is to write a function that takes an array of integers as input and rearranges it to create an alternating pattern of negative and positive numbers. If there are more of one kind than other (meaning if there are more positive numbers or more negative numbers) you should move all the remaining to the end of the array and if there is a zero do not include it in the array.
 * Also make sure that positive and negative numbers are sorted in their own individual group, for example, if the given array is [-1, 3,4,-6,2,5,9,-2] then the output should be: [-6,2,-2,3,-1,4,5,9]. The resulting array should start with the lowest number of the given array.
 * <p>
 * Input
 * <p>
 * An integer n (1 ≤ n ≤ 100), represents the number of elements in the array.
 * A list of n integers, where each integer is in the range of -1000 to 1000 (inclusive).
 * Output:
 * <p>
 * A list of n integers, representing the rearranged array with an alternating begative-positive pattern.
 * <p>
 * Sample Input:
 * <p>
 * 5
 * -9 11 4 6 -2
 * Sample Output:
 * <p>
 * -9 4 -2 6 11
 * Sample Input:
 * <p>
 * 7
 * 0 -3 5 9 -4 10 -6
 * Sample Output:
 * <p>
 * -6 5 -4 9 -3 10
 * Note you don't have to include zeroes in result
 */
public class PositiveNegativeAlternateSort {
    public static void alternatePandE(int[] ar) {
        SortedMap<Integer, Integer> negatives = new TreeMap<Integer,Integer>();
        SortedMap<Integer, Integer> positives = new TreeMap<>();

        for (int i = 0; i < ar.length; i++) {
            if (ar[i] < 0)
                negatives.put(ar[i], i);
            else if (ar[i] > 0)
                positives.put(ar[i], i);
        }

        StringBuilder output = new StringBuilder();
        List<Integer> listNegatives = new ArrayList<>(negatives.keySet());
        List<Integer> listPositives = new ArrayList<>(positives.keySet());
        int combinedSize = listPositives.size() + listNegatives.size();

        for(int i =0;i<combinedSize;i++){
            if(i<listNegatives.size()  )
                output.append(listNegatives.get(i)).append(" ");
            if(i<listPositives.size())
                output.append(listPositives.get(i)).append(" ");
        }

        System.out.println(output.toString());


    }

    public static void main(String[] args) {
        int[] input = {5, -9, 11, 4, 6, -2};
        alternatePandE(input);
    }
}
