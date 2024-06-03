package arrays;

import java.util.*;

/*
Given an array nums of size n, return the majority element.

The majority element is the element that appears more than ⌊n / 2⌋ times. You may assume that the majority element always exists in the array.



Example 1:

Input: nums = [3,2,3]
Output: 3
Example 2:

Input: nums = [2,2,1,1,1,2,2]
Output: 2
 */

/**
 * 229. Majority Element II
 * Given an integer array of size n, find all elements that appear more than ⌊ n/3 ⌋ times.
 * Example 1:
 * <p>
 * Input: nums = [3,2,3]
 * Output: [3]
 * Example 2:
 * <p>
 * Input: nums = [1]
 * Output: [1]
 * Example 3:
 * <p>
 * Input: nums = [1,2]
 * Output: [1,2]
 */
public class MajorityElement {
    public static int majorityElement(int[] nums) {
        Map<Integer, Integer> countMap = new HashMap<>();
        int majorityElement = -1;
        for (int num : nums) {
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
        }
        for (Map.Entry<Integer, Integer> entry : countMap.entrySet()) {
            if (entry.getValue() > nums.length / 2) {
                majorityElement = entry.getKey();
            }
        }
        System.out.println(majorityElement);
        return majorityElement;

    }

    public static List<Integer> allMajorityElement(int[] nums) {
        List<Integer> majorityElements = new ArrayList<>();
        Map<Integer, Integer> countMap = new HashMap<>();
        for (int num : nums) {
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
        }
        for(Map.Entry<Integer,Integer> entry : countMap.entrySet()){
            if(entry.getValue() > nums.length/3)
                majorityElements.add(entry.getKey());
        }

        System.out.println(majorityElements.toString());
        return majorityElements;
    }

    public static void main(String[] args) {
        int[] nums = {3,2,3};
        majorityElement(nums);
        allMajorityElement(nums);
    }
}
