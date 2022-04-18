import java.util.*;
import java.util.Map.Entry;
import java.util.HashMap;

class singleOneTHREE {
    public static int[] singleOneTHREEFunction(int[] nums) {
        HashMap<Integer,Integer> resultMap = new HashMap<Integer,Integer>();
        int[] finalResult = new int[2];
        for (int i = 0 ; i < nums.length ; i++) {
            if(resultMap.containsKey(nums[i])){
                resultMap.put(nums[i],resultMap.get(nums[i])+1);
            }
            else{
                resultMap.put(nums[i],1);
            }
        }
        int count = 0;
        for (Map.Entry mapElement : resultMap.entrySet()) {
            Integer key = (Integer)mapElement.getKey();
            Integer val = (Integer)mapElement.getValue();
            if(val == 1){
                finalResult[count] = key;
                count++;
            }
        }
        return finalResult;
    }
    public static void main(String args[]){
        int[] nums = {0,1};
        int[] y = singleOneTHREE.singleOneTHREEFunction(nums);
        for(int i:y){
            System.out.println(i);    
        }
    }
}