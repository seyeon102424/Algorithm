import java.util.Scanner;
import java.lang.Math;

public class Main {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int n, move;

        n = s.nextInt();
        s.nextLine();

        long [][] dp = new long[n][n];
        dp[0][0] = 1;

        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                move = s.nextInt();

                if(dp[i][j]>=1 && move!=0){
                    if(move+j<n){
                        dp[i][j+move] += dp[i][j];
                    }
                    if(move+i<n){
                        dp[i+move][j] += dp[i][j];
                    }
                }
            }
            s.nextLine();
        }

        System.out.println(dp[n-1][n-1]);
    }
}
