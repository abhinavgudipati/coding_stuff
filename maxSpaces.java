import java.util.*;

class maxSpaces {
    public static int mostWordsFound(String[] sentences) {
        int[] count = new int[sentences.length];
        for( int i = 0; i < sentences.length ; i++){
            String curr = sentences[i];
            int countIndex = 0;
            for(char c : curr.toCharArray()){
                if (c == ' ') {
                    countIndex++;
                }
            }
            count[i]=countIndex;
        }
        Arrays.sort(count);
        int x = count[count.length-1];
        return x+1;
    }
    public static void main(String[] args){
        String[] sentences = {"alice and bob love leetcode", "i think so too", "this is great thanks very much"};
        int x = maxSpaces.mostWordsFound(sentences);
        System.out.println(x);
    }
}