import java.util.*;

public class commonPrefix {
    public static String helperFunction(String[] stringss){
        String result = "";
        if(stringss.length == 0 ){
            result = "";
        }
        else if(stringss.length == 1 ){
            return stringss[0];
        }
        else{
            Arrays.sort(stringss);
            int len = stringss[0].length();
            int c = 0;
            StringBuilder buildNewString = new StringBuilder();
            while(c<len){
                if(stringss[0].charAt(c)==stringss[stringss.length-1].charAt(c)){
                   buildNewString.append(stringss[0].charAt(c));
                }
                else{
                    break;
                }
                c++;
            }
            return buildNewString.toString();
        }
        return result;
    }
    public static void main(String[] args){
        String[] stringss = new String[]{"flower","flow","flight"};
        String x = commonPrefix.helperFunction(stringss);
        System.out.println(x);
    }
    
}
