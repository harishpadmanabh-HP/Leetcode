import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int[] input = {-5,1,5,0,-7};
        largestAltitude(input);
    }

    public static int[] buildArray(int[] nums){
        int[] permutedArray = new int[nums.length];
        int order = nums.length-1;
        for(int i=0;i<nums.length;i++){
            permutedArray[i] = nums[nums[i]];
        }
        System.out.println(Arrays.toString(permutedArray));
        return permutedArray;
    }

    public static int[] getConcatenation(int[] nums) {
        int[] concatenatedArray = new int[nums.length*2];
        for(int i=0;i<nums.length*2;i++){
            if(i<nums.length)
                concatenatedArray[i]=nums[i];
            else
                concatenatedArray[i]=nums[i-nums.length];

        }
        System.out.println(Arrays.toString(concatenatedArray));
        return concatenatedArray;
    }

    //1470. Shuffle the array
    /**
     * Given the array nums consisting of 2n elements in the form [x1,x2,...,xn,y1,y2,...,yn].
     Return the array in the form [x1,y1,x2,y2,...,xn,yn].
     **/
    public static int[] shuffle(int[] nums, int n) {
        int[] shuffledArray = new int[n*2];
        int count =0;
        for(int i=0;i<n;i++){
            shuffledArray[count] = nums[i];
            shuffledArray[count+1] = nums[i+n];
            count+=2;
        }


        System.out.println(Arrays.toString(shuffledArray));

        return shuffledArray;
    }
    //1431. Kids With the Greatest Number of Candies
    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> outList = new ArrayList<Boolean>();
        for(int i=0;i<candies.length;i++){
            if(i>0){
                Boolean haveMaxCandies = (candies[i-1]+extraCandies)<(candies[i]+extraCandies);
                outList.add(haveMaxCandies);
            }
        }
        System.out.println(outList);
        return outList;
    }

    public static int[] decode(int[] encoded, int first) {
        int[] decodedArray = new int[encoded.length+1];
        decodedArray[0]=first;
        for(int i=0;i<encoded.length;i++){
            decodedArray[i+1] = decodedArray[i]^encoded[i];
        }
        System.out.println(Arrays.toString(decodedArray));
        return decodedArray;
    }

    public static int[] runningSum(int[] nums) {
        int[] sum = new int[nums.length];
        sum[0]=nums[0];
        for(int i=1;i<nums.length;i++ ){
            sum[i] = sum[i-1]+nums[i];
        }
        System.out.println(Arrays.toString(sum));
        return sum;
    }
    public static int largestAltitude(int[] gain) {
        int currentAltitude = gain[0];
        int maxAltitude = gain[0];
        for(int i=1;i<gain.length;i++){
            currentAltitude += gain[i];
            maxAltitude = Math.max(maxAltitude,currentAltitude);
        }
        System.out.println(maxAltitude);
        return maxAltitude;

    }
}