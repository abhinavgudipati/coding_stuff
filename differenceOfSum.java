class Solution {
    public int differenceOfSum(int[] nums) {
        int elementSum = 0;
        int digitSum = 0;
        for(int i = 0 ; i < nums.length ; i++){
            if(nums[i]>=10){
                digitSum+=helpSum(nums[i]);
            }
            else{
                digitSum+=nums[i];
            }
            elementSum+=nums[i];
        }
        return Math.abs(elementSum-digitSum);
    }
    public int helpSum(int k){
        int sum=0;
        while(k>0){
            sum = sum + k%10;
            k = k / 10;
        }
        return sum;
    }
}