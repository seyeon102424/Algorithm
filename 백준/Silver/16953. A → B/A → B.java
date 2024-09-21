import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        long A = s.nextLong();
        long B = s.nextLong();
        int time = 1;
        
        while(true){
            long tmp = B%10;
            if(tmp == 1){
                B = B/10;
                time++;
            }
            else if(B%2==0){
                B = B/2;
                time++;
            }
            else{
                time = -1;
                break;
            }
            
            if(B == A){break;}
            else if(B < A){
                time = -1;
                break;
            }
        }
        
        System.out.println(time);
    }
}