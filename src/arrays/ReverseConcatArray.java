package arrays;

import java.util.Arrays;

/**
 * Reverse Array
 * Given an integer array a[ ] of length n, you want to create an array res of length 2n where x res[i] == a[i] and res[i + n] == a[n-i-1] for 0 <= i < n (0-indexed).
 * <p>
 * Hint:
 * res[ ] array is the concatenation of a[ ] and reverse of a[ ].
 * <p>
 * Constraints:
 * <p>
 * 1 <= n <= 1000
 * <p>
 * -1000 <= nums[i] <= 1000
 */
public class ReverseConcatArray {

    public static int[] reverseArray(int n, int[] a) {
      int[] result = new int[2*n];

        for (int i = 0; i < n; i++) {
            result[i] = a[i]; // First half: copy original array
            result[i + n] = a[n - i - 1]; // Second half: copy reversed array
        }


      return result;
    }

    public static void main(String[] args) {
        int[] input = {44, 22, 33, 11, 1};
        System.out.println(Arrays.toString(reverseArray(input.length,input)));
    }
}
