import java.util.*;
import java.util.Map.Entry;
import java.util.HashMap;

class singleOneTWO {
    public static int singleOneTWOFunction(int[] nums) {
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
        int[] nums = {0,1,0,1,0,1,99};
        int y = singleOneTWO.singleOneTWOFunction(nums);
        System.out.println(y);
    }
}