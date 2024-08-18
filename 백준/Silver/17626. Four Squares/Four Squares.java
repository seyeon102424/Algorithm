import java.util.Scanner;
import java.lang.Math;

public class Main {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int n, min=1000;
        int [] dp;
        n = s.nextInt();
        dp = new int[n+1];
        dp[0] = 0;
        dp[1] = 1;

        for(int i=2; i<=n; i++){
            dp[i] = dp[i-1];
            if(Math.sqrt(i)%1 == 0){dp[i] = 1;}
            for(int j=1; j*j<=i; j++){
               dp[i] = Math.min(dp[i], dp[i-j*j]);
            }
            dp[i]++;
        }
        System.out.println(dp[n]);
    }
}