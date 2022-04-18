import java.util.*;
import java.util.Map.Entry;
import java.util.HashMap;

class singleOneXor {
    public static void main(String args[]){
        int[] nums = {1,2,4,4,3,2,1};
        int x = 0;
        for(int i : nums ){
            x = x^i;
        }
        // int y = singleOne.singleOneFunction(nums);
        System.out.println(x);
    }
}