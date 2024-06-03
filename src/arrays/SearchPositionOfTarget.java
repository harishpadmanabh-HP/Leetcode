package arrays;

import kotlin.Pair;

import java.util.ArrayList;
import java.util.Collections;

/**
 * You are given a sorted array arr containing distinct integers. Your task is to implement a function search_position that, given a target value, returns the index where the target is found in the array. If the target is not present, return the index where it would be if inserted in order.
 * <p>
 * Note:-
 * Implement an algorithm with O(log n) runtime complexity.
 * <p>
 * Input format:-
 * arr (1 <= len(nums) <= 10^4) is a sorted array of distinct integers.<br>
 * target (1 <= target <= 10^5) is the value to search for or insert.
 * Output format1 :-
 * Return an integer representing the index where the target is found or the index where it would be inserted.
 * <p>
 * Examples
 * Example 1
 * Input: arr = [1,3,5,6], target = 5
 * Output: 2
 * Example 2
 * Input: arr = [1,3,5,6], target = 2
 * Output: 1
 */
public class SearchPositionOfTarget {

    public static int searchPosition(ArrayList<Integer> arr, int target) {
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) == target || target - arr.get(i) < 0)
                return i;
        }
        return -1;
    }

    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<Integer>();
        arr.add(1);
        arr.add(3);
        arr.add(5);
        arr.add(6);
        System.out.println(searchPosition(arr, 2));
    }
}
