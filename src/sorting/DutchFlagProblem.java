package sorting;

import java.util.Arrays;

/**
 * <h1>Dutch Flag Problem</h1>
 * You are given an array of colourful balls represented by integers, where each integer can have one of three distinct values: 0 (red), 1 (white), or 2 (blue). Your task is to sort the array in such a way that all the red balls come first, followed by all the white balls, and then all the blue balls, effectively solving the Dutch National Flag problem.
 * <p>
 * Input Format:
 * <p>
 * The first line of input contains an integer N (1 ≤ N ≤ 10^5), representing the number of colourful balls in the array.
 * The second line of input contains N space-separated integers, where each integer is either 0 (red), 1 (white), or 2 (blue).
 * Output Format:
 * <p>
 * Output the sorted array of colourful balls on a single line, separated by spaces.
 * <p>
 * Input:
 * <p>
 * 8
 * <p>
 * 1 0 2 1 0 2 1 0
 * Output:
 * 0 0 0 1 1 1 2 2
 */
public class DutchFlagProblem {

    /**
     * Approach - Dijkstras sorting, Only Applicable to sort array of only 3 repeated numbers
     *
     * @param nums
     * @param n
     */
    public static void dutchFlagSort(int[] nums, int n) {
        int low = 0, mid = 0, high = nums.length - 1;
        int temp = 0; //for swapping

        while (mid <= high) {
            switch (nums[mid]) {
                case 0: {
                    //swap nums[low] and nums[mid]
                    temp = nums[low];
                    nums[low] = nums[mid];
                    nums[mid] = temp;

                    //increase low and mid
                    low++;
                    mid++;

                    break;

                }
                case 1: {
                   //increase mid
                    mid++;
                    break;

                }
                case 2: {
                   //swap nums[mid] and nums[high]
                    temp = nums[mid];
                    nums[mid] = nums[high];
                    nums[high] = temp;

                    //Decrease high
                    high--;

                    break;

                }
            }
        }

        for (int num:nums) {
            System.out.print(num+" ");
        }

    }


    public static void main(String[] args) {
        int[] input = {1, 0, 2, 1, 0, 2, 1, 0};
        dutchFlagSort(input, input.length);
        System.out.println(Arrays.toString(input));
    }
}
