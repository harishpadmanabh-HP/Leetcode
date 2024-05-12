/**
 * Given an unsorted array arr of n non-negative integers, you have to find the range of an array. The range of an array is the difference between the maximum and minimum value of the array. If a single value is present return 0.
 *
 * Example 1
 * Input
 * arr = [3,2,10,4,7,8]
 * Output
 * 8
 */


public class RangeOfArray {

    public static int rangeOfAnArray(int[] arr) {
        if (arr.length == 1 || arr.length ==0)
            return 0;

        int min = arr[0];
        int max = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            } else if (arr[i] > max) {
                max = arr[i];
            }
        }

        return max - min;
    }

    public static void main(String[] args) {
       int[] arr = {30};
        System.out.println(rangeOfAnArray(arr));
    }
}
