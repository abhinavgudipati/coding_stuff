import java.util.*;
import java.util.Map.Entry;
import java.util.HashMap;

class singleOne {
    public static int singleOneFunction(int[] nums) {
        HashMap<Integer,Integer> resultMap = new HashMap<Integer,Integer>();
        int finalResult = 0;
        for (int i = 0 ; i < nums.length ; i++) {
            if(resultMap.containsKey(nums[i])){
                resultMap.put(nums[i],resultMap.get(nums[i])+1);
            }
            else{
                resultMap.put(nums[i],1);
            }
        }
        for (Map.Entry mapElement : resultMap.entrySet()) {
            Integer key = (Integer)mapElement.getKey();
            Integer val = (Integer)mapElement.getValue();
            if(val == 1){
                finalResult = key;
            }
        }
        return finalResult;
    }
    public static void main(String args[]){
        int[] nums = {1,2,4,4,3,2,1};
        for(int i =)
        int y = singleOne.singleOneFunction(nums);
        System.out.println(y);
    }
}