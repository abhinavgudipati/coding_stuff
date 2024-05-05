class Solution {
    public boolean isPalindrome(int x) {
        String xS = Integer.toString(x);
        StringBuilder xBuild = new StringBuilder();
        for(int i = xS.length() - 1 ; i >=0 ; i-- ){
            xBuild.append(xS.charAt(i));
        }
        System.out.println(xS);
        System.out.println(xBuild.toString());
        return xS.equals(xBuild.toString());
    }
}