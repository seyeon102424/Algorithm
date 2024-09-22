import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] c = new int[n];
        long tmp = 0;
        long result = 0;
        
        for(int i=0; i<n; i++){
            c[i] = s.nextInt();
            result += c[i];
        }
        Arrays.sort(c);
        
        for(int i=n-1; i>=0; i-=3){
            if(i-2<0){break;}
            else{tmp += c[i-2];}
        }
        
        System.out.println(result-tmp);
    }
}