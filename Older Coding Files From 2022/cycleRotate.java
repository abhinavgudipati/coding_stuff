import java.util.*;

class cycleRotate {
    
    public void rotate(int arr[], int n)
    {
        HashMap<Integer,Integer> result = new HashMap<Integer,Integer>();
        int[] newArr = new int[arr.length];
        newArr[0] = arr[arr.length-1];
        for(int i = 1 ; i < arr.length ; i++){
            newArr[i] = arr[i-1];
        }
        for(int i = 0 ; i < arr.length ; i++){
            System.out.println(newArr[i]);
        }
    }

    public static void main(String[] args){
        int[] arr = new int[]{1,2,3,4,5};
        int n = arr.length;
        cycleRotate x = new cycleRotate();
        x.rotate(arr,n);
    }
}