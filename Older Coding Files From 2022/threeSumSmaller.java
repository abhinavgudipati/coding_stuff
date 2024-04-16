import java.util.*;

class threeSumSmaller {
    public static HashMap<Integer,ArrayList> threeSumSmallerFunction(int[] nums, int target) {
        int count = 0;
        HashMap<Integer,ArrayList> hashResult = new HashMap<Integer,ArrayList>();
        Arrays.sort(nums);
        for(int i = 0 ; i < nums.length-2 ; i++ ){
            int a_pointer = i + 1;
            int b_pointer = nums.length - 1;
            
            while(a_pointer < b_pointer){
                int currentSum = nums[i] + nums[a_pointer] + nums[b_pointer];
                ArrayList<Integer> a = new ArrayList<Integer>();
                if(currentSum < target){
                    a.add(nums[i]);
                    a.add(nums[a_pointer]);
                    a.add(nums[b_pointer]);
                    hashResult.put(count,a);
                    count++;
                    b_pointer--;
                }
                else{
                    a_pointer++;
                }
            }
        }
        return hashResult;
    }
    public static void main(String args[]){
        int[] nums = {-2,0,1,3,5};
        int target = 6;
        HashMap<Integer,ArrayList> y = threeSumSmaller.threeSumSmallerFunction(nums, target);
        for(Map.Entry mp : y.entrySet()){
            System.out.println(mp.getKey());
        }
        System.out.println(y);
    }
}