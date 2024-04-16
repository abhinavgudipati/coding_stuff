import java.util.*;

class threeSumClosest {
    public static int threeSumClosestFunction(int[] nums, int target) {
        int result = nums[0] + nums[1] + nums[nums.length-1] ;
        Arrays.sort(nums);
        for(int i = 0 ; i < nums.length-2 ; i++ ){
            int a_pointer = i + 1;
            int b_pointer = nums.length - 1;
            
            while(a_pointer < b_pointer){
                int currentSum = nums[i] + nums[a_pointer] + nums[b_pointer];
                if(currentSum > target){
                    b_pointer--;
                }
                else{
                    a_pointer++;
                }
                if(Math.abs(currentSum-target) < Math.abs(result-target)){
                    result = currentSum;
                }
            }
            
        }
        return result;
    }
    public static void main(String args[]){
        int[] nums = {-1,2,1,-4};
        int target = 1;
        int y = threeSumClosest.threeSumClosestFunction(nums, target);
        System.out.println(y);
    }
}