package arrays;

import java.util.ArrayList;

/**
 * Given an array arr with n balls numbered 0, 1, or 2, sort them in place so that balls of the same number are adjacent, with the numbers in the order 0, 1, and 2.
 * <p>
 * Note:-
 * You must solve this problem without using the library's sort function.
 * <p>
 * Input format:
 * n == arr.length
 * 1 <= n <= 200
 * arr[i] is either 0, 1, or 2.
 * <p>
 * Output format:
 * You do not need to return anything, sort them in place.
 * <p>
 * Examples
 * Example 1
 * Input: n=6 , arr = [2,0,2,1,1,0]
 * Output: [0,0,1,1,2,2]
 * Example 2
 * Input: n=5 , nums = [2,0,1,1,1]
 * Output: [0,1,1,1,2]
 */
public class SortBalls {
    static void sortBalls(ArrayList<Integer> nums) {
        int low = 0;
        int mid = 0;
        int high = nums.size() - 1;

        while (mid <= high) {
            switch (nums.get(mid)) {
                case 0:
                    // Swap nums[low] and nums[mid]
                    int temp0 = nums.get(low);
                    nums.set(low, nums.get(mid));
                    nums.set(mid, temp0);
                    low++;
                    mid++;
                    break;
                case 1:
                    mid++;
                    break;
                case 2:
                    // Swap nums[mid] and nums[high]
                    int temp2 = nums.get(high);
                    nums.set(high, nums.get(mid));
                    nums.set(mid, temp2);
                    high--;
                    break;
            }
        }

    }

    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<Integer>();
        arr.add(0);
        arr.add(0);
        arr.add(0);
        arr.add(0);
        arr.add(1);
        arr.add(2);
        arr.add(2);
        arr.add(2);
        arr.add(1);
        arr.add(2);
        sortBalls(arr);
        System.out.println(arr.toString());
    }
}
