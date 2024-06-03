package arrays;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * RBI wants to introduce currency of new denominations,so for this, the Governor conducts a poll about the among N banks. Governor imposed a restriction on the denomination of the currency that is the denomination can be in the range of ==[1,N]==.Votes of all the banks have been stored in the votes array and the RBI will release currency of only those denominations which have got more than 1 vote. So you have been provided with the votes array and you need to return the array which will contain the denominations of the currency which is going to be released by the RBI sorted in increasing order. If no denominations got more than 1 vote then simply return an empty array.
 *
 * Note: Can you wirte an algorithm that runs in O(N) Time complexity and O(1) space complexity if we exclude the space used by the answer array?
 *
 * Example 1
 * Input
 * votes = [4,3,2,1,2,1]
 * Output
 * [1,2]
 */
public class HelpTheGovernor {
    public static List<Integer> findCurrency(List<Integer> votes) {
        List<Integer> result = new ArrayList<>();
        Map<Integer, Integer> countMap = new HashMap<>();

        for (int vote : votes) {
            countMap.put(vote, countMap.getOrDefault(vote, 0) + 1);
        }

        for (Map.Entry<Integer, Integer> entry : countMap.entrySet()) {
            if (entry.getValue() > 1) {
                result.add(entry.getKey());
            }
        }

        return result;
    }

    public static void main(String[] args) {
        List<Integer> votes = List.of(3,4,1);
        List<Integer> denominations = findCurrency(votes);
        System.out.println(denominations);
    }

}
