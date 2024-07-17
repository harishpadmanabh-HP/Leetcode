package searching;

/**
 * Smallest Divisor Satisfying the Limit
 * Given an integer n, an array of integers nums, and an integer limit, we will choose any positive integer d, divide all the array elements by it, and sum up the value of each division into result. Find the smallest d such that the result for it is less than or equal to limit.
 *
 * Each result of the division is rounded to the nearest integer greater than or equal to that element. (For example: 7/3 = 3 and 10/2 = 5).
 *
 * Input Format
 *
 * 1st Line contains a single interger n, size of the nums array.
 * 2nd Line contains n space seperated integers denoting the nums array.
 * 3rd Line contains a single interger limit.
 * Output Format:
 *
 * Single Integer denoting the smallest possible divisor.
 * Example 1:
 *
 * Input: n = 4, nums = [1,2,5,9], limit = 6
 *
 * Output: 5
 *
 * Explanation:
 *
 * We can get a sum of 17 (1+2+5+9) if the d is 1. If the d is 4 we can get a sum of 7 (1+1+2+3) and if the d is 5 the sum will be 5 (1+1+1+2).
 *
 * Example 2:
 *
 * Input:
 *
 * n = 5, nums = [44,22,33,11,1], limit = 5
 * Output:
 * 44
 */
public class SmallestDivisor {
    public static int smallestDivisor(int n, int[] nums, int limit) {
        int left = 1;
        int right = getMax(nums);

        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (canDivide(nums, mid, limit)) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        return left;
    }

    private static int getMax(int[] nums) {
        int max = nums[0];
        for (int num : nums) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }

    private  static boolean canDivide(int[] nums, int d, int limit) {
        int sum = 0;
        for (int num : nums) {
            sum += (num + d - 1) / d; // This is ceiling division
            if (sum > limit) {
                return false;
            }
        }
        return true;
    }


    public static void main(String[] args) {
        int[] input = {44,22,33,11,1};
        System.out.println(smallestDivisor(input.length,input,5));
    }
}
