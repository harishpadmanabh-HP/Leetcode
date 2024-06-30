package sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Combine the Books
 * In the enchanting village of Bookland, there are two mystical bookstores, Alara's Books and Balin's Reads.
 * Your task is to create a program that combines their inventories into a single sorted list.
 * <p>
 * Input:
 * 4 4
 * <p>
 * book enchanted spell wand
 * <p>
 * ancient dragon magic scroll
 * Output:
 * ancient book dragon enchanted magic scroll spell wand
 * <p>
 * Constraints:
 * The size of each inventory (n) and (m): 1 ≤ n, m ≤ 10^5
 * <p>
 * Length of each book title: 1 ≤ length ≤ 100
 * <p>
 * The inventories are sorted in alphabetical order.
 */
public class CombineBooks {
    public static List<String> solve(List<String> inventory1, List<String> inventory2) {
        ArrayList<String> output = new ArrayList<>();
        int sizeInventory1 = inventory1.size();
        int sizeInventory2 = inventory2.size();
        int i = 0, j = 0;

        while (i < sizeInventory1 && j < sizeInventory2) {
            if (inventory1.get(i).compareTo(inventory2.get(j)) <= 0) {
                output.add(inventory1.get(i));
                i++;
            } else {
                output.add(inventory2.get(j));
                j++;
            }
        }

        // Add remaining elements from inventory1
        while (i < sizeInventory1) {
            output.add(inventory1.get(i));
            i++;
        }

        // Add remaining elements from inventory2
        while (j < sizeInventory2) {
            output.add(inventory2.get(j));
            j++;
        }

        return output;
    }


    public static void main(String[] args) {
        List<String> inventory1 = Arrays.asList("book", "enchanted", "spell", "wand");
        List<String> inventory2 = Arrays.asList("ancient", "dragon", "magic", "scroll");
        List<String> output = solve(inventory1,inventory2);
        System.out.println(output.toString());
    }
}
