import java.util.*;

public class triple {
    public static void main(String[] args){
        Scanner sc  = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int rating = sc.nextInt();
            if(rating>=1900){
                System.out.println("Division 1");
            }
            if(rating>=1600 && rating<=1899){
                System.out.println("Division 2");                
            } //1600≤rating≤1899
            if(rating>=1400 && rating<=1599){
                System.out.println("Division 3");                
            } //1600≤rating≤1899
            if(rating<=1399){
                System.out.println("Division 4");                
            } //1600≤rating≤1899
        }
    }
}
