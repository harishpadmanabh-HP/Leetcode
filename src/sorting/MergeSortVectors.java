package sorting;

import java.util.Arrays;
import java.util.Vector;

/**
 * In the friendly village of Sortville, there lived a kind wizard named Willy. Willy was known for his love of arranging things neatly. One day, while exploring the forest, he found a box filled with jumbled-up numbers written on colourful pebbles. Willy wanted to put them in order because he thought it would be fun.
 * <p>
 * Task:
 * Now, it's your job to help Willy arrange these colourful pebbles in the correct order. Write a program named mergeSort to sort the numbers on the pebbles using this method.
 * <p>
 * Expected Time Complexity is O(n*log(n))
 * Input:
 * An integer n (1 to 100,000), tells you how many pebbles there are.
 * <p>
 * A list of n numbers, written on the pebbles. Each number is between 1 and 100,000.
 * <p>
 * Output:
 * A list of n numbers, the pebbles sorted from the smallest to the biggest.
 * <p>
 * Input:
 * 4
 * <p>
 * 10 5 3 7
 * <p>
 * Output:
 * 3 5 7 10
 */
public class MergeSortVectors {

    public static void mergeSort(Vector<Integer> arr, int left, int right) {
        int[] input = new int[arr.size()];
        for (int i = 0; i < arr.size(); i++)
            input[i] = arr.elementAt(i);
        int[] output = divide(input);
        for (int i = 0; i < output.length;i++){
            arr.setElementAt(output[i],i);
        }

    }

    public static int[] divide(int[] input) {
        if (input.length == 1)
            return input;

        int mid = input.length / 2;

        int[] left = divide(Arrays.copyOfRange(input, 0, mid)); //excludes mid
        int[] right = divide(Arrays.copyOfRange(input, mid, input.length));

        return conquer(input, left, right);
    }

    public static int[] conquer(int[] originalArray, int[] left, int[] right) {
        int i = 0, j = 0, k = 0;
        while (i < left.length && j < right.length) {
            if (left[i] < right[j])
                originalArray[k++] = left[i++];
            else
                originalArray[k++] = right[j++];
        }


        while (i < left.length)
            originalArray[k++] = left[i++];

        while (j < right.length)
            originalArray[k++] = right[j++];

        return originalArray;
    }


    public static void main(String[] args) {
        Vector<Integer> input = new Vector<>();
        input.add(4);
        input.add(1);
        input.add(9);
        input.add(6);
        mergeSort(input, input.indexOf(input.firstElement()), input.indexOf(input.lastElement()));
        System.out.println(input.toString());
    }
}

/**
 * class Solution {
 *       public void mergeSort(Vector<Integer> arr, int left, int right) {
 *              if (left < right) {
 *             int middle = (left + right) / 2;
 *
 *             // Recursively sort the first half
 *             mergeSort(arr, left, middle);
 *
 *             // Recursively sort the second half
 *             mergeSort(arr, middle + 1, right);
 *
 *             // Merge the sorted halves
 *             merge(arr, left, middle, right);
 *         }
 *       }
 *
 *
 *     private void merge(Vector<Integer> arr, int left, int middle, int right) {
 *         int n1 = middle - left + 1;
 *         int n2 = right - middle;
 *
 *         // Create temporary arrays
 *         Vector<Integer> leftArray = new Vector<>(n1);
 *         Vector<Integer> rightArray = new Vector<>(n2);
 *
 *         // Copy data to temporary arrays
 *         for (int i = 0; i < n1; ++i)
 *             leftArray.add(arr.get(left + i));
 *         for (int j = 0; j < n2; ++j)
 *             rightArray.add(arr.get(middle + 1 + j));
 *
 *         // Merge the temporary arrays
 *
 *         // Initial indices of first and second subarrays
 *         int i = 0, j = 0;
 *
 *         // Initial index of merged subarray array
 *         int k = left;
 *         while (i < n1 && j < n2) {
 *             if (leftArray.get(i) <= rightArray.get(j)) {
 *                 arr.set(k, leftArray.get(i));
 *                 i++;
 *             } else {
 *                 arr.set(k, rightArray.get(j));
 *                 j++;
 *             }
 *             k++;
 *         }
 *
 *         // Copy remaining elements of leftArray if any
 *         while (i < n1) {
 *             arr.set(k, leftArray.get(i));
 *             i++;
 *             k++;
 *         }
 *
 *         // Copy remaining elements of rightArray if any
 *         while (j < n2) {
 *             arr.set(k, rightArray.get(j));
 *             j++;
 *             k++;
 *         }
 *     }
 * }
 */
