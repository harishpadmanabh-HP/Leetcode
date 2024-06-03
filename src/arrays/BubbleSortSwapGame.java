package arrays;

public class BubbleSortSwapGame {
    public static void main(String[] args) {
        int[] anishArray = {7, 2, 8, 9, 5};
        int[] binishArray = {4, 6, 2, 5, 3};
        System.out.println(findWinner(anishArray,binishArray));;

    }

    public static String findWinner(int[] Anish, int[] Binish) {
        int n = Anish.length;
        int anishSwapped = 0;
        int binishSwapped = 0;

        for(int i =0;i<n-1;i++){
            for(int j=0;j<n-i-1;j++){
                if(Anish[j]>Anish[j+1])
                    anishSwapped++;
                if(Binish[j]>Binish[j+1])
                    binishSwapped++;
            }
        }

        if(anishSwapped==binishSwapped)
            return "Tie";
        else if (anishSwapped<binishSwapped)
            return "Anish";
        else
            return "Binish";
    }

}
