package strings;

/**
 * Bucket Sort
 * You are the manager at "Dream Wheels" which is a Car Showroom and there are 'n' number of cars available here.
 * You read an analysis that customers tend to buy expensive rare cars if they come across them after the common cheaper cars.
 * Your task is to arrange the cars in the decreasing order of their frequency, cars are represented by a string of characters,
 * if two or more cars have the same number of frequencies sort them lexicographically.
 *
 * Sample Input:
 * ssgysyqa
 *
 * Sample Output:
 * sssyyagq
 *
 * Constraints:
 * 1<= n <= 10^5
 * All characters are lowercase only and are English alphabets.
 */


import java.util.*;

public class BucketSortCars {

    public static String bucketSortCars(String cars) {
        // Step 1: Count frequency of each character
        Map<Character, Integer> frequencyMap = new HashMap<>();
        for (char c : cars.toCharArray()) {
            frequencyMap.put(c, frequencyMap.getOrDefault(c, 0) + 1);
        }

        // Step 2: Group characters by their frequency
        List<List<Character>> buckets = new ArrayList<>();
        for (int i = 0; i <= cars.length(); i++) {
            buckets.add(new ArrayList<>());
        }

        for (Map.Entry<Character, Integer> entry : frequencyMap.entrySet()) {
            char c = entry.getKey();
            int frequency = entry.getValue();
            buckets.get(frequency).add(c);
        }

        // Step 3: Sort each bucket lexicographically
        for (List<Character> bucket : buckets) {
            Collections.sort(bucket);
        }

        // Step 4: Build the result string by concatenating characters in the sorted order
        StringBuilder result = new StringBuilder();
        for (int i = buckets.size() - 1; i >= 0; i--) {
            for (char c : buckets.get(i)) {
                for (int j = 0; j < i; j++) {
                    result.append(c);
                }
            }
        }

        return result.toString();
    }


    public static void main(String[] args) {
        String cars = "ssgysyqa";
        System.out.println(bucketSortCars(cars));
    }
}
