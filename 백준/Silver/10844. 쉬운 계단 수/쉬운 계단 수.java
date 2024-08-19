import java.util.Scanner;
import java.lang.Math;

public class Main {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int n;
        long ans=0;
        long [][] dp;
        n = s.nextInt();

        dp = new long[n+1][10];

        for(int i=1; i<=9; i++){
            dp[1][i] = 1;
        }

        for(int i=2; i<=n; i++){
            dp[i][0] = dp[i-1][1]%1000000000;
            for(int j=1; j<=8; j++){
                dp[i][j] = (dp[i-1][j-1] + dp[i-1][j+1])%1000000000;
            }
            dp[i][9] = dp[i-1][8]%1000000000;
        }

        for(int i=0; i<10; i++){
            ans = (ans+dp[n][i])%1000000000;
        }

        System.out.println(ans);
    }
}
