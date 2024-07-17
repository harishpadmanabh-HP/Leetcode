package searching;

import java.util.Arrays;

/**
 * Maximum Sweetness of Toffee Jar
 * You are given an integer n, an array of positive integers price where price[i] denotes the price of the ith toffee and a positive integer k.
 * <p>
 * The store sells jars of k distinct toffees. The sweetness of a toffee jar is the smallest absolute difference of the prices of any two toffees in the jar.
 * <p>
 * Return the maximum sweetness of a toffee jar.
 * <p>
 * Input Format
 * 1st Line contains a single interger n, size of the price array.
 * 2nd Line contains the price array, denoting price of ith toffee.
 * 3rd Line contains a single interger k, denoting the number of disctict toffees in each jar.
 * Output Format
 * Single Integer denoting the maximum possible sweetness.
 * <p>
 * Input:
 * n = 6, price = [13,5,1,8,21,2], k = 3
 * Output:
 * 8
 * <p>
 * `Explanation:
 * Choosing the toffees with the prices [13, 5, 21].
 * The sweetness of the toffee jar is: min(|13 - 5|, |13 - 21|, |5 - 21|) = min(8, 8, 16) = 8.
 * It can be proven that 8 is the maximum sweetness that can be achieved.
 * <p>
 * <p>
 * <p>
 * https://www.youtube.com/watch?v=LfFjcmE165Y
 */
public class MaximumSweetnessOfCandy {

    public static int maximumSweetness(int n, int[] price, int k) {
        Arrays.sort(price);

        int low = 0;
        int high = price[n - 1] - price[0];

        while (low < high) {
            int mid = (high + low + 1) / 2;

            if (canAchieveSweetness(price, k, mid)) {
                low = mid; // Try for a higher sweetness value
            } else {
                high = mid - 1; // Try for a lower sweetness value
            }
        }

        return low;
    }

    private static boolean canAchieveSweetness(int[] price, int k, int sweetness) {
        int count = 1;
        int lastPicked = price[0];

        for (int i = 1; i < price.length; i++) {
            if (price[i] - lastPicked >= sweetness) {
                count++;
                lastPicked = price[i];
            }
            if (count >= k) {
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {
      int[] candies = {13,5,1,8,21,2};
        System.out.println(maximumSweetness(candies.length,candies,3));
    }
}
