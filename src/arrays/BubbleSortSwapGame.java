package arrays;

public class BubbleSortSwapGame {
    public static void main(String[] args) {
        int[] anishArray = {7, 2, 8, 9, 5};
        int[] binishArray = {4, 6, 2, 5, 3};
        System.out.println(findWinner(anishArray,binishArray));;

    }

    public static String findWinner(int[] Anish, int[] Binish) {
        int anishSwaps = countSwaps(Anish);
        int binishSwaps = countSwaps(Binish);

        if (anishSwaps < binishSwaps) {
            return "Anish";
        } else if (anishSwaps > binishSwaps) {
            return "Binish";
        } else {
            return "Tie";
        }
    }
    public static int countSwaps(int[] stones) {
        int swaps = 0;
        boolean sorted = false;
        while (!sorted) {
            sorted = true;
            for (int i = 0; i < stones.length - 1; i++) {
                if (stones[i] > stones[i + 1]) {
                    int temp = stones[i];
                    stones[i] = stones[i + 1];
                    stones[i + 1] = temp;
                    swaps++;
                    sorted = false;
                }
            }
        }
        return swaps;
    }

}
