class Solution {
    public String reversePrefix(String word, char ch) {
        StringBuilder res = new StringBuilder();
        
        int first = 0;
        int last = 0; 
        int index = 0;
        for(int i = 0 ; i < word.length() ; i++ ){
            Character x = word.charAt(i);
            if(x == ch){
                index = i;
                break;
            }
        }
        last = index;
        while(last>=0){
            res.append(word.charAt(last));
            last--;
        }
        int k = index+1;
        while(k<word.length()){
            res.append(word.charAt(k));
            k++;
        }
        return res.toString();
    }
}