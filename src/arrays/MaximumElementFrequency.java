package arrays;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * You are given an array a consisting of n integers. Your task is to find the frequency of the maximum element in the array.
 * <p>
 * Input format
 * The first line contains an integer n (1 ≤ n ≤ 10^5) — the size of the array.
 * The second line contains n integers a1, a2, ..., an (1 ≤ ai ≤ 10^9) — the elements of the array. You will be given a function to implement with parameters as array a and its length n.
 * <p>
 * Output format
 * Return a single integer — the frequency of the maximum element in the array.
 * <p>
 * Examples
 * Example 1
 * Input
 * <p>
 * 5
 * 1 3 2 3 3
 * Output
 * <p>
 * 3
 * Example 2
 * Input
 * <p>
 * 5 5 5 5 5 5
 * Output
 * <p>
 * 6
 * Explanation
 * In the first example, the maximum element is 3, and it appears 3 times in the array.
 * In the second example, all elements are the same, and the maximum element (5) appears 6 times.
 */
public class MaximumElementFrequency {

    public static int maxElementFrequency(int n, ArrayList<Integer> a) {
     /*   int max = 0;
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        for (int i = 0; i < n; i++) {
            frequencyMap.put(a.get(i),frequencyMap.getOrDefault(a.get(i),0)+1);
        }

        for (Map.Entry<Integer,Integer> entry : frequencyMap.entrySet()){
            max = Math.max(max,entry.getValue());
        }

        return max;*/

        int maxElement = a.get(0);
        int frequency = 1;

        // Find the maximum element and its frequency
        for (int i = 1; i < n; i++) {
            if (a.get(i) > maxElement) {
                maxElement = a.get(i);
                frequency = 1;
            } else if (a.get(i) == maxElement) {
                frequency++;
            }
        }

        return frequency;
    }

    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<Integer>();
        arr.add(1);
        arr.add(3);
        arr.add(2);
        arr.add(3);
        arr.add(3);
        System.out.println(maxElementFrequency(arr.size(), arr));
    }
}
