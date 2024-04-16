import java.util.*;

class BESTCOUPON{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int x = sc.nextInt();
            if((100)<(x*(.1))){
                double val = x*.1;
                int date = (int)val;
                System.out.println(date);
            }
            else{
                System.out.println(100);
            }
        }
    }
}

//Six friends go on a trip and are looking for accommodation. 
// After looking for hours, they find a hotel which offers 
// two types of rooms — double rooms and triple rooms. 
//A double room costs Rs. X, while a triple room costs Rs. Y.

//The friends can either get three double rooms or get two triple rooms. Find the minimum amount they will have to pay to accommodate all six of them.

