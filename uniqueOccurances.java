class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        TreeMap<Integer,Integer> hm = new TreeMap<Integer,Integer>();

        for(int i = 0 ; i < arr.length ;i++ ){
            int valCount = 0;
            for(int j = 0 ; j < arr.length ; j++ ){
                if(arr[i]==arr[j]){
                    valCount++;
                }
            }
            hm.put(arr[i],valCount);
        }
        System.out.println(hm);
        Set<Integer> uniqueCounts = new HashSet<Integer>(hm.values());
        return uniqueCounts.size() == hm.size();
    }
}