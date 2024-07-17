package arrays;


import java.util.ArrayList;

/**
 * <h1>Count Inversions</h1>
 * Given an array of integers, write a function to count the number of elements that are greater than a specified threshold.
 * <p>
 * Input Format:
 * <p>
 * The first line contains the size of the array (n).
 * The next line contains n space-separated integers i.e. elements of array arr.
 * The third line contains the threshold value x.
 * Output Format:
 * <p>
 * Return a single integer equal to the number of elements greater than the threshold value.
 * <p>
 * Input:
 * <p>
 * 5
 * <p>
 * 1 3 5 7 9
 * <p>
 * 10
 * Output:
 * <p>
 * 0
 * <p>
 * Explanation:
 * <p>
 * Since the threshold value is equal to 10 and there are no values greater than that in the array hence the result is zero.
 * <p>
 * Constraints:
 * <p>
 * Size of the array (n): 1 ≤ n ≤ 10^5
 * <p>
 * Elements of the array: -10^9 ≤ arr[i] ≤ 10^9
 * <p>
 * Threshold: -10^9 ≤ threshold ≤ 10^9
 */
public class CountInversions {
    public static int solve(ArrayList<Integer> arr, int x) {
        int count = 0;
        for (int num : arr) {
            if (num > x)
                count++;
        }
        return count;
    }

    public static void main(String[] args) {
        ArrayList<Integer> input = new ArrayList<>();
        input.add(1);
        input.add(3);
        input.add(5);
        input.add(7);
        input.add(9);

        System.out.println(solve(input, 10));
    }
}
