class Solution {
    public boolean isHappy(int n) {
        int sumOfProducts = 0;
        while(n>0){
            int count = n%10;
            sumOfProducts += count*count;
            n = n / 10;
        }
        if( sumOfProducts == 1 || sumOfProducts == 7 ){
            return true;
        }
        else if( sumOfProducts>=10 ){
            System.out.println(sumOfProducts);
            return isHappy(sumOfProducts);
        }
        else{
            return false;
        }
    }
}