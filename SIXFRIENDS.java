import java.util.*;

class SIXFRIENDS{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int x = sc.nextInt();
            int y = sc.nextInt();
            if(x*3>2*y){
                System.out.println(2*y);
            }
            else{
                System.out.println(3*x);
            }
        }
    }
}

//Six friends go on a trip and are looking for accommodation. 
// After looking for hours, they find a hotel which offers 
// two types of rooms — double rooms and triple rooms. 
//A double room costs Rs. X, while a triple room costs Rs. Y.

//The friends can either get three double rooms or get two triple rooms. Find the minimum amount they will have to pay to accommodate all six of them.

