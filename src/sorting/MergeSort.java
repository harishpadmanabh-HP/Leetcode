package sorting;

import java.util.Arrays;

public class MergeSort {

    public static void mergeSort(int[] input) {
        divide(input);

    }

    public static int[] divide(int[] input) {
        if (input.length == 1)
            return input;

        int mid = input.length / 2;

        //Recursive calls to get left and right array.
        int[] left = divide(Arrays.copyOfRange(input, 0, mid)); //excludes mid
        int[] right = divide(Arrays.copyOfRange(input, mid , input.length));

      return   conquer(input , left, right);
    }

    public static int[] conquer(int[] originalArray,int[] left, int[] right) {
        int i = 0, j = 0, k = 0; //i-left array  j-right array  k-original array

        //Compare items in left and right array and store in original array which one is smaller.
        //After storing item in original array increment the position variable.
        //stop if either i or j reaches the end of its array.
        while (i < left.length  && j < right.length ) {
            if (left[i] < right[j])
                originalArray[k++] = left[i++]; // Post increment -- increase value of k and i after storing
            else
                originalArray[k++] = right[j++]; // Post increment -- increase value of k and i after storing
        }

        //if there i or j reached the end, store the remaining items in original array

        while (i < left.length)
            originalArray[k++] = left[i++];

        while (j < right.length )
            originalArray[k++] = right[j++];

        return originalArray;
    }

    public static void main(String[] args) {
        int[] input = {9, 4, 7, 2};
        mergeSort(input);
        System.out.println("Arrays Sorted " + Arrays.toString(input));

    }


}
