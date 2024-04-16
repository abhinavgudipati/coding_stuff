import java.util.*;

class maxSubArray {
    public static int helperFunction(int[] nums) {
        int currentSum = 0;
        int maxSum = Integer.MIN_VALUE;

        for(int i = 0 ; i < nums.length ; i++ ){
            currentSum += nums[i];

            if(currentSum>maxSum){
                maxSum = currentSum;
            }
            if(currentSum<0){
                currentSum=0;
            }
        }
        return maxSum;
    }
    public static void main(String[] args){
        int[] numArray = new int[]{-2,1,-3,4,-1,2,1,-5,4};
        int x = maxSubArray.helperFunction(numArray);
        System.out.println(x);
    }
}