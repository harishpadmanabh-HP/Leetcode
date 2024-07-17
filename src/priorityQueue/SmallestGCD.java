package priorityQueue;

import java.util.ArrayList;
import java.util.Collections;
import java.util.PriorityQueue;


/**
 * GCD of the smallest
 * You have been given an array of size n. You need to perform certain operations on the array to reduce the size of the array to one according to the following rule:
 * <p>
 * 1). Add two smallest numbers from the array and append the number back to the array.
 * <p>
 * 2). The cost of doing the above operation is equal to GCD (Greatest Common Divisor) of the smallest two numbers in the array.
 * <p>
 * Return the total cost after the last number is left in the array.
 * <p>
 * Example:
 * <p>
 * Input : n = 5  ar =  [5,4,2,3,1]
 * <p>
 * Output:  8
 * Constraints:
 * <p>
 * 1 <= n <= 1000
 * <p>
 * 1 <= array[i] <= 1000
 */
public class SmallestGCD {
    public int solve(ArrayList<Integer> ar) {
        // Using a min-heap to always get the smallest two elements efficiently
        PriorityQueue<Integer> minHeap = new PriorityQueue<>(ar);
        int totalCost = 0;

        while (minHeap.size() > 1) {
            // Get the two smallest elements
            int firstMin = minHeap.poll();
            int secondMin = minHeap.poll();

            // Calculate the GCD of the two smallest elements
            int gcd = gcd(firstMin, secondMin);

            // Add the GCD to the total cost
            totalCost += gcd;

            // Add the sum of the two smallest elements back to the heap
            minHeap.offer(firstMin + secondMin);
        }

        return totalCost;
    }

    // Helper method to calculate the GCD of two numbers
    private int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }

    public static void main(String[] args) {
        SmallestGCD sol = new SmallestGCD();
        ArrayList<Integer> ar = new ArrayList<>();
        Collections.addAll(ar, 5, 4, 2, 3, 1);
        int result = sol.solve(ar);
        System.out.println(result);  // Output: 8
    }
}

