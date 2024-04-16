import java.util.*;

class findDifference {
    public static char findDifferenceFunction(String s, String t) {
        int[] list = new int[26];
        char result = 'a';
        for(char ch : t.toCharArray()){
            list[ch-'a']++;
        }
        for(char ch : s.toCharArray()){
            list[ch-'a']--;
        }
        for(int i = 0 ; i < list.length ;  i++){
            if(list[i]==1){
                result = (char)('a'+i);
            }
        }
        return result;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String s = "abcd";
        String t = "abcde";
        char y = findDifference.findDifferenceFunction(s, t);
        System.out.println(y);
    }
}