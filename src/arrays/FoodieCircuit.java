package arrays;

/**
 * <h1>Foodie</h1>
 * There are n food stations along a circular route, where the amount of food at the ith station is food[i].
 * <p>
 * You have a body with an unlimited storage capacity for food, and it costs cost[i] of food to travel from the ith station to its next (i + 1)th station. You begin your journey with an empty stomach at one of the food stations.
 * <p>
 * Given two integer arrays food and cost, return the starting food station's index if you can travel around the circuit once in the clockwise direction without running out of food, otherwise return -1. If there exists a solution, it is guaranteed to be unique.
 * <p>
 * Example 1:
 * <p>
 * Input:
 * food = [1,2,3,4,5], cost = [3,4,5,1,2]
 * <p>
 * Output :
 * 3
 * <p>
 * Example 2:
 * <p>
 * Input :
 * food = [2,3,4], cost = [3,4,3]
 * <p>
 * Output:
 * -1
 * <p>
 * Constraints:
 * <p>
 * n == food.length() == cost.length()
 * <p>
 * 2 <= n <= 200000
 * <p>
 * 0 <= food[i], cost[i] <= 10000
 */


public class FoodieCircuit {

    public static int canCompleteCircuit(int[] food, int[] cost) {
        int totalFood = 0, totalCost = 0;
        for (int i = 0; i < food.length; i++) {
            totalFood += food[i];
            totalCost += cost[i];
        }

        /**
         * If the total food is less than the total cost, it's impossible to complete the circuit.
         */
        if (totalFood < totalCost)
            return -1;

        int currentFood = 0;
        int start = 0;

        for (int i = 0; i < food.length; i++) {
            currentFood += food[i] - cost[i];

            //if currentFood is negative go for the next index
            if (currentFood < 0) {
                start = i + 1;
                currentFood = 0;
            }

        }

        return start;

    }

    public static void main(String[] args) {
        int[] food = {1, 2, 3, 4, 5}, cost = {3, 4, 5, 1, 2};
        System.out.println(canCompleteCircuit(food, cost));
    }
}
