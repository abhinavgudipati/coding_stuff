import java.util.HashMap;

class twoSum {
    public static int[] twoSumFunction(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<Integer,Integer>();
        for( int i = 0 ; i < nums.length; i++){
            int complement = target - nums[i];
            if(map.containsKey(complement)){
                return new int[] {map.get(complement),i};
            }
            map.put(nums[i],i);
        }
        throw new IllegalArgumentException("No Match");
    }
    public static void main(String args[]){
        int[] arr = {2,7,11,15};
        int target = 13;
        int[] ans = twoSumFunction(arr, target);
        for(int i : ans){
            System.out.println(i);
        }
    }
}