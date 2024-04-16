import java.util.*;

class shuffleString {
    public static String restoreString(String s, int[] indices) {
        HashMap<Integer,Character> resultHashmap = new HashMap<Integer,Character>();
        for(int i = 0 ; i < s.length() ; i++){
            resultHashmap.put(indices[i],s.charAt(i));
            System.out.println(s.charAt(i));
        }
        TreeMap<Integer,Character> sorted = new TreeMap<Integer,Character>();
 
        // Copy all data from hashMap into TreeMap
        sorted.putAll(resultHashmap);
 
        // Display the TreeMap which is naturally sorted
        for (Map.Entry<Integer,Character> entry : sorted.entrySet())
            System.out.println("Key = " + entry.getKey() +
                         ", Value = " + entry.getValue());       

        String result = "";

        for (Map.Entry<Integer,Character> entry : sorted.entrySet()){
            result = result + entry.getValue();
        }  
        return result;
    }
    public static void main(String[] args){
        String s = "codeleet";
        int[] indices = {4,5,6,7,0,2,1,3};
        String x = shuffleString.restoreString(s,indices);
        System.out.println(x);
    }
}