package arrays;

/**
 * Given two sorted arrays nums1 and nums2 of sizes m and n respectively, return the median of the two sorted arrays. You have to return an integer kind of value.
 *
 * The overall run time complexity should be O(log (m+n)).
 *
 * Example:
 *
 * Input:
 *
 * nums1 = [1,3], nums2 = [2]
 * Output:
 *
 * 2
 * Explanation:
 * Merged array = [1,2,3] and the median is 2.
 *
 * Input:
 *
 * nums1 = [1,2], nums2 = [3,4]
 * Output:
 *
 * 2
 * Explanation:
 * Merged array = [1,2,3,4] and the median is (2 + 3) / 2 = 2.5 but you have to return (2+3)/2 which will give the final output as 2, so basically return the floor(median).
 *
 * Constraints:
 *
 * nums1.length == m
 * nums2.length == n
 * 0 <= m <= 1000
 * 0 <= n <= 1000
 * 1 <= m + n <= 2000
 * -10^6 <= nums1[i], nums2[i] <= 10^6
 */

//https://www.geeksforgeeks.org/median-two-sorted-arrays-different-sizes-ologminn-m/

public class MedianOfTwoSortedArrays {
    public static int getMedian(int[] ar1, int[] ar2, int m, int n) {
        int min_index = 0, max_index = n, i=0, j=0, median=0;

        while (min_index <= max_index) {
            i = (min_index + max_index) / 2;
            j = ((n + m + 1) / 2) - i;


            if (j < 0) {
                max_index = i - 1;
                continue;
            }


            if (i < n && j > 0 && ar2[j - 1] > ar1[i])
                min_index = i + 1;

            else if (i > 0 && j < m && ar2[j] < ar1[i - 1])
                max_index = i - 1;

            else {

                if (i == 0)
                    median = ar2[j - 1];
                else if (j == 0)
                    median = ar1[i - 1];
                else
                    median = maximum(ar1[i - 1], ar2[j - 1]);
                break;
            }
        }


        if ((n + m) % 2 == 1)
            return median;

        if (i == n)
            return (median + ar2[j]) / 2;

        if (j == m)
            return (median + ar1[i]) / 2;

        return (median + minimum(ar1[i], ar2[j])) / 2;
    }


    // Function to find max
   static int maximum(int a, int b) { return a > b ? a : b; }

    // Function to find minimum
    static int minimum(int a, int b) { return a < b ? a : b; }

    public static void main(String[] args) {
        int[] nums1 = {1,2};
        int[] nums2 = {3,4};
        System.out.println(getMedian(nums1,nums2,nums1.length,nums2.length));
    }
}
