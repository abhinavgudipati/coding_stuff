class Solution {
    public int scoreOfString(String s) {
        int score = 0;

        for(int i = 0 ; i < s.length() - 1 ; i++){
            Character x = s.charAt(i);
            Character x1 = s.charAt(i+1);
            score = score + Math.abs((int) x - (int) x1);
        }
        return score;
    }
}