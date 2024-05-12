public class PivotIndexOfArray {
    public static int pivotIndex(int[] nums) {
        int leftSum = 0, rightSum = 0,totalSum=0;

        for(int i=0;i<nums.length;i++){
            leftSum = sumBeforeIndex(i,nums);
            rightSum=sumAfterIndex(i,nums);
            System.out.println("leftSum = "+leftSum+" rightSum= "+rightSum+" index = "+i);
            if(leftSum==rightSum)
                return i;
        }
        return -1;
    }

    public static int sumBeforeIndex(int index,int[] arr){
        int leftSum = 0;
        for(int i=0;i<index;i++){
            leftSum += arr[i];
        }
        return leftSum;
    }

    public static int sumAfterIndex(int index,int[] arr){
        int rightSum = 0;
        for(int i=index+1;i<arr.length;i++){
            rightSum += arr[i];
        }
        return rightSum;
    }
    public static void main(String[] args) {
       int[] nums = {1,7,3,6,5,6};
        System.out.println(pivotIndex(nums));
    }
}
