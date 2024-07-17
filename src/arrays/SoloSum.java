package arrays;

import java.util.Arrays;

/**
 * SOLO SUM
 * Ramesh is working on a problem given by his teacher, the problem states that he is given an array(say nums),
 * <p>
 * He has to find such an array (say ans) such that ans[i]=leftsum[i]+rightsum[i]. Help Ramesh to solve the problem. leftsum[i] is the sum of all the elements to the left of index i in the array nums, if there is no such element leftsum[i]=0;
 * <p>
 * rightsum[i] is the sum of all the elements to the right of index i in the array nums, if there is no such element rightsum[i]=0;
 * <p>
 * Example 1
 * Input:
 * nums = [1, 2, 3, 4, 5]
 * Output:
 * [14, 13, 12, 11, 10]
 * Example 2
 * Input
 * nums =[1, 2, -3, 4, -5]
 * Output:
 * [-2, -3, 2, -5, 4]
 * Constraints :
 * 1 <= nums.length <= 1000
 * <p>
 * -10000 <= nums[i] <= 10000
 *
 *
 *
 *
 * Improved soln without inner loops
 * //https://chatgpt.com/c/d7376106-85ed-440f-b50d-ba9bda462ebc
 */
public class SoloSum {
    public static int[] leftRightSum(int[] nums) {
        int[] result = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
          result[i] = leftSum(i,nums) + rightSum(i,nums);
        }


        return result;
    }

    public static int leftSum(int index, int[] nums) {
        int sum = 0;
        if (index == 0)
            return 0;
        else {
            for (int i = 0; i < index; i++) {
                sum += nums[i];
            }
        }
        return sum;
    }

    public static int rightSum(int index, int[] nums) {
        int sum = 0;
        if (index == nums.length - 1)
            return 0;
        else {
            for (int i = index + 1; i < nums.length; i++) {
                sum += nums[i];
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] input = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(leftRightSum(input)));
    }
}
