import java.util.*;
import java.util.Map.Entry;
import java.util.HashMap;

class missingNumber {
    public static int missingNumberFunction(int[] nums) {
        Arrays.sort(nums);
        int result=0;
        int len = nums.length;
        if((len == 1 && nums[0]==1) || (len>1 && nums[0]!=0)){
            result = 0;
        }
        else if(len == 1 && nums[0]==0){
            result = 1;
        }
        else{
            for(int i = 0 ; i < len - 1 ; i++){ //{0,1,2,3,4,5,6,7,9}
                if( nums[i+1] != nums[i]+1 ){ //{0,2,3} 2!=1
                    result = nums[i]+1;
                    break;
                }
                else{
                    result = nums[i+1]+1;
                }
            }
        }
        return result;
    }
    public static void main(String args[]){
        int[] nums = {0,2,3};
        int y = missingNumber.missingNumberFunction(nums);
        System.out.println(y);
    }
}