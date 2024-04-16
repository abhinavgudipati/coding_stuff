import java.util.*;
import java.util.Map.Entry;
import java.util.HashMap;


class findDifferenceHashmap {
    public static char findDifferenceFunction(String s, String t) {
        HashMap<Character,Integer> hashResult = new HashMap<Character,Integer>();
        char result = 'a';
        for(char ch : t.toCharArray()){
            if(hashResult.containsKey(ch)){
                hashResult.put(ch,hashResult.get(ch)+1);
            }
            else{
                hashResult.put(ch,1);
            }
        }
        for(char ch : s.toCharArray()){
            for (Map.Entry mapElement : hashResult.entrySet()) {
                Character key = (Character)mapElement.getKey();
                if ( key == ch ){
                    hashResult.remove(key);
                    break;
                }
            }
        }
        for (Map.Entry mapElement : hashResult.entrySet()) {
            Character key = (Character)mapElement.getKey();
            result = key;   
        }
        return result;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String s = "abcd";
        String t = "abcde";
        char y = findDifferenceHashmap.findDifferenceFunction(s, t);
        System.out.println(y);
    }
}