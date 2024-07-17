package arrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

/**
 * <h1>Coin Chase on Main Street</h1>
 * In the lively town of Main Street, two HeyCoach students, Ram and Shyam, embarked on an intriguing challenge. Tasked by their mentor, they ventured onto a straight road lined with an even number of buildings. Each building held a stash of gold coins, but here's the twist – certain buildings were occupied by cunning thieves who could pilfer coins from their pockets.
 * <p>
 * Ram kicked off the adventure from the 0th building, while Shyam began at the (n-1)th building, both determined to maximize their gold haul. Guided by their mentor's strategy, they aimed to visit n/2 buildings, ensuring they'd eventually meet in the middle.
 * <p>
 * You have to return an array of size n/2 where ith index would denote who has the maximum number of coins collected at ith time.
 * <p>
 * if Ram has maximum coins answer would be 1, -1 if Shyam has maximum coins, 0 if both have same number of coins.
 * <p>
 * Example 1
 * <p>
 * Input:
 * [1,2,-1,4,-1,1]
 * Output:
 * [0,1,-1]
 * Explanation:
 * At moment 1 Ram will have 1 coin and Shyam will have 1 coin thus the output would be 0 at zeroth index. The next moment Ram will have 2+1 coin which in total is 3 and Shyam will have -1+1=0 coin and that's why the output for the next index would be 1 (Ram has more coins than Shyam). Then at the next moment Ram will have 3-1 = 2 coins and Shyam would have 0+4=4 coins and since Shyam has more coins the output for that should be -1. They have now covered all the houses so, return the output as array which in this case is: [0 1 -1].
 * <p>
 * Example 2
 * <p>
 * Input:
 * [1,-1]
 * Output:
 * <p>
 * [1]
 * Example 3
 * <p>
 * Input:
 * [2,2,2,2]
 * Output:
 * [0,0]
 * Constraints
 * <p>
 * 2 <= n <= 200000
 * <p>
 * n is even
 * <p>
 * -1e^9 <= coins[i] <= 1e^9
 */


public class CoinChase {
    public static ArrayList<Integer> maximizeCoins(ArrayList<Integer> coins) {

        ArrayList<Integer> output = new ArrayList<>();
        int ramPrefixSum = 0, shyamPrefixSum = 0, i = 0;
        while (i < coins.size() / 2) {
            ramPrefixSum += coins.get(i);
            shyamPrefixSum += coins.get(coins.size() - 1 - i);
            if(shyamPrefixSum==ramPrefixSum)
                output.add(0);
            else if(ramPrefixSum>shyamPrefixSum)
                output.add(1);
            else
                output.add(-1);

            i++;
        }


        return output;
    }

    public static void main(String[] args) {
        int[] input = {1, 2, -1, 4, -1, 1};
        ArrayList<Integer> coins = new ArrayList();
        for (int coin : input) {
            coins.add(coin);
        }
        System.out.println(maximizeCoins(coins));

    }
}
