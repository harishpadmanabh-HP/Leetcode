package arrays;

/**
 * 724. Find Pivot Index

 * Given an array of integers nums, calculate the pivot index of this array.
 *
 * The pivot index is the index where the sum of all the numbers strictly to the left of the index is equal to the sum of all the numbers strictly to the index's right.
 *
 * If the index is on the left edge of the array, then the left sum is 0 because there are no elements to the left. This also applies to the right edge of the array.
 *
 * Return the leftmost pivot index. If no such index exists, return -1.
 */



public class PivotIndexOfArray {
    public static int pivotIndex(int[] nums) {
        int sum = 0;
        for (int num : nums)
            sum += num;
        int left = 0;
        int right = sum;
        for (int i = 0; i < nums.length; i++) {
            right -= nums[i];
            if (left == right)
                return i;
            left += nums[i];

        }
        return -1;
    }

    public static void main(String[] args) {
        int[] nums = {1, 7, 3, 6, 5, 6};
        System.out.println(pivotIndex(nums));
    }
}
