package arrays;

/**
 * 1979. Find Greatest Common Divisor of Array
 * Given an integer array nums, return the greatest common divisor of the smallest number and largest number in nums.
 * <p>
 * The greatest common divisor of two numbers is the largest positive integer that evenly divides both numbers.
 * <p>
 * <p>
 * <p>
 * Example 1:
 * <p>
 * Input: nums = [2,5,6,9,10]
 * Output: 2
 * Explanation:
 * The smallest number in nums is 2.
 * The largest number in nums is 10.
 * The greatest common divisor of 2 and 10 is 2.
 * Example 2:
 * <p>
 * Input: nums = [7,5,6,8,3]
 * Output: 1
 * Explanation:
 * The smallest number in nums is 3.
 * The largest number in nums is 8.
 * The greatest common divisor of 3 and 8 is 1.
 * Example 3:
 * <p>
 * Input: nums = [3,3]
 * Output: 3
 * Explanation:
 * The smallest number in nums is 3.
 * The largest number in nums is 3.
 * The greatest common divisor of 3 and 3 is 3.
 * <p>
 * <p>
 * Constraints:
 * <p>
 * 2 <= nums.length <= 1000
 * 1 <= nums[i] <= 1000
 */
public class GcdOfArray {
    public static int findGCD(int[] nums) {
        int smallest = nums[0], largest = 0;
        for (int num : nums) {
            smallest = Math.min(num, smallest);
            largest = Math.max(num, largest);
        }
        int gcd = Math.min(smallest,largest);
        while (gcd>0){
            if(smallest % gcd == 0 && largest % gcd ==0)
                break;
            gcd--;
        }
       return gcd;
    }

    public static void main(String[] args) {
        int[] arr = {7, 5, 6, 8, 3};
        System.out.println(findGCD(arr));
    }
}
