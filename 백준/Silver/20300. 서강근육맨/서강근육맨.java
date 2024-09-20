import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        long[] loss = new long[n];
        long max = 0;
        
        for(int i=0; i<n; i++){
            loss[i] = s.nextLong();
        }
        Arrays.sort(loss);
        
        if(n%2==0){
            for(int i=0; i<n/2; i++){
                long tmp = loss[i] + loss[n-(i+1)];
                max = Math.max(max,tmp);
            }
        }
        else{
            for(int i=0; i<n/2; i++){
                long tmp = loss[i] + loss[n-(i+2)];
                max = Math.max(max,tmp);
            }
        }
        
        System.out.println(max);
    }
}