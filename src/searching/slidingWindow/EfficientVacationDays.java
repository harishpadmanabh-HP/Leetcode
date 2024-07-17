package searching.slidingWindow;

/**
 * Mr. Yadav's Vacation
 * Rajesh Yadav is a English teacher at school who deceived the school into giving him 'n' days off from the school. Yadav wanted to go to Kerala with his daughters, so he wants to allocate several consecutive days to enjoy the holidays. Since he wants to make the best use of his time thus requiring careful preparation, he will only go for at least 'k' days.
 * <p>
 * You are given an array 'Weather' containing the weather forecast (That is temperature on the i-th day) in Kerala. Temperature is in degrees. Mr. Yadav was born in Himachal, so he can go on vacation only if the temperature does not rise above 't' degrees throughout his trip. He asks you to help him and count the number of ways to choose vacation dates in Kerala.
 * <p>
 * Example:
 * <p>
 * Input: n = 3 , k = 1, t = 15
 * <p>
 * Weather = [-5,0,-10]
 * <p>
 * Output: 6
 * <p>
 * Explanation :
 * <p>
 * In this example Mr. Yadav can go on these suitable dates [1], [2], [3], [1, 2], [2, 3], [1, 2, 3] which is equal to 6.
 * <p>
 * Constraints:
 * <p>
 * 1 ≤ n ≤ 10^5
 * <p>
 * 1 ≤ k ≤ n
 * <p>
 * −100 ≤ t ≤ 100
 */

//Sliding Window
public class EfficientVacationDays {
    public static void solve(int[] weather, int n, int k, int t) {
        int count = 0;

        for (int start = 0; start < n; start++) {
            int maxTemp = Integer.MIN_VALUE;
            for (int end = start; end < n; end++) {
                maxTemp = Math.max(maxTemp, weather[end]);
                if (maxTemp > t) {
                    break;
                }
                if (end - start + 1 >= k) {
                    count++;
                }
            }
        }

        System.out.println(count);
    }

    public static void main(String[] args) {
        int n = 3;
        int k = 1;
        int t = 15;
        int[] weather = {-5, 0, -10};
        solve(weather, n, k, t);  // Output: 6
    }
}
