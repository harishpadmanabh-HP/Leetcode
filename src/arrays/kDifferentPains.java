package arrays;

import java.util.ArrayList;
import java.util.HashMap;


/**
 * <h1>k different pairs</h1>
 * Given an array of integers nums and an integer k, write a program to return the number of unique k-diff pairs in the array.
 * A k-diff pair is defined as an integer pair (nums[i], nums[j]), where the following conditions are true:
 *
 * 0≤i,j<length of nums and i≠j.
 *
 * The absolute difference between the two numbers is exactly k, i.e., ∣nums[i]−nums[j]∣=k.
 *
 * Input Format:
 * The first line contains an integer n and k space-separated, representing the number of elements in the array nums.
 *
 * The second line contains n space-separated integers, the elements of the array nums.
 *
 * Output Format:
 * Print a single integer representing the number of unique k-diff pairs in the array.
 *
 * Sample Input:
 * 5 2
 * 3 1 4 1 5
 *
 * Sample Output:
 * 2
 *
 * Explanation:
 * In the given array, there are two unique pairs that have a difference of 2: the pair (1, 3) and the pair (3, 5). Hence, the output is 2.
 *
 * Constraints:
 * The number of elements in the array nums is within the range [1,10^4].
 *
 * The value of each element in nums is in the range [−10^7 ,10^7].
 *
 * k is a non-negative integer within the range [0,10^7].
 */
public class kDifferentPains {

    public int findPairs(ArrayList<Integer> nums, int k) {
        // Edge case: if the list is null, empty, or k is negative, return 0
        if (nums == null || nums.size() == 0 || k < 0) {
            return 0;
        }

        // Create a HashMap to store the frequency of each number in the array
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        int count = 0;

        // Iterate over each unique key in the map
        for (int num : map.keySet()) {
            // If k is greater than 0, check if the map contains the number (num + k)
            if (k > 0 && map.containsKey(num + k)) {
                count++;
            }
            // If k is 0, check if there are multiple occurrences of the number
            else if (k == 0 && map.get(num) > 1) {
                count++;
            }
        }

        // Return the total count of unique k-diff pairs
        return count;
    }

    public static void main(String[] args) {
        // Create an instance of the Solution class
        kDifferentPains solution = new kDifferentPains();

        // Example input
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(3);
        nums.add(1);
        nums.add(4);
        nums.add(1);
        nums.add(5);
        int k = 2;

        // Call the findPairs method and print the result
        System.out.println(solution.findPairs(nums, k)); // Output: 2
    }
}
