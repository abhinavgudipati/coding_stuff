import java.util.*;
import java.util.Scanner;

class palindrome {
    public static boolean isPalindrome(int x) {
        if(x==0){
            return true;
        }
        if(x<0 || x%10 ==0 ){
            return false;
        }
        int reversedNumber = 0;
        while(x > reversedNumber){
            int pop = x%10;
            x = x/10;
            reversedNumber =  (reversedNumber * 10) + pop;
        }
        if(x==reversedNumber || x==reversedNumber/10){
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        boolean y = palindrome.isPalindrome(x);
        System.out.println(y);
    }
}