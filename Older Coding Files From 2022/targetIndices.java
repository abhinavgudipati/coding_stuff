import java.util.*;

class targetIndices{
    public static List<Integer> targetIndicesfunction(int[] nums, int target) {
        Arrays.sort(nums);
        List<Integer> resultList = new ArrayList<Integer>(nums.length);
        for(int i = 0 ; i < nums.length ; i++){
            if(nums[i]==target){
                resultList.add(i);
            }
        }
        return resultList;
    }
    public static void main(String[] args){
        int[] nums = new int[]{1,2,5,2,3};
        int target = 2;
        List<Integer> resultList = targetIndices.targetIndicesfunction(nums,target);
        System.out.println(resultList);
    }
}