package arrays;

/**
 * Special Pair of Scores
 * You are given an array of integers representing the performance scores of n participants in a coding competition. Each participant is assigned a unique score based on their performance, and no two participants have the same score. Your task is to calculate the total number of Special pairs in the list of scores.
 * A Special pair is defined as a pair of indices (i, j) such that i < j and scores[i] > scores[j].
 * <p>
 * Sample Input:
 * 6
 * <p>
 * 8 4 2 1 5 3
 * Output:
 * 10
 * <p>
 * Constraints:
 * The number of participants (n): 2 ≤ n ≤ 10^5.
 * The scores of participants: 1 ≤ score[i] ≤ 10^9. For example, out of the 10 total pairs 3 possible pairs are : (8,4),(8,5),(4,3).
 */
public class SpecialPair {

    public static long inversionCount(long[] arr, int N) {
        return mergeSortAndCount(arr, 0, N - 1);
    }

    private static long mergeSortAndCount(long[] arr, int left, int right) {
        long count = 0;
        if (left < right) {
            int mid = (left + right) / 2;

            count += mergeSortAndCount(arr, left, mid);
            count += mergeSortAndCount(arr, mid + 1, right);

            count += mergeAndCount(arr, left, mid, right);
        }
        return count;
    }

    private static long mergeAndCount(long[] arr, int left, int mid, int right) {
        int n1 = mid - left + 1;
        int n2 = right - mid;

        long[] leftArr = new long[n1];
        long[] rightArr = new long[n2];

        for (int i = 0; i < n1; i++)
            leftArr[i] = arr[left + i];
        for (int i = 0; i < n2; i++)
            rightArr[i] = arr[mid + 1 + i];

        int i = 0, j = 0, k = left;
        long count = 0;

        while (i < n1 && j < n2) {
            if (leftArr[i] <= rightArr[j]) {
                arr[k++] = leftArr[i++];
            } else {
                arr[k++] = rightArr[j++];
                count += (n1 - i);
            }
        }

        while (i < n1) {
            arr[k++] = leftArr[i++];
        }

        while (j < n2) {
            arr[k++] = rightArr[j++];
        }

        return count;
    }

    public static void main(String[] args) {
        long[] arr = {8, 4, 2, 1, 5, 3};
        int N = arr.length;
        System.out.println(inversionCount(arr, N));
    }
}
