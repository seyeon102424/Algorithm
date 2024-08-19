import java.util.Scanner;
import java.lang.Math;

public class Main {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int test, n;

        test = s.nextInt();
        s.nextLine();

        for(int k=0; k<test; k++) {
            n = s.nextInt();
            int [][] A = new int[2][n+1];
            int [][] dp = new int[2][n+1];

            for(int i=0; i<2; i++){
                for(int j=1; j<=n; j++){
                    A[i][j] = s.nextInt();
                }
                s.nextLine();
            }

            dp[0][1] = A[0][1];
            dp[1][1] = A[1][1];

            for(int i=2; i<=n; i++){
                dp[0][i] = Math.max(dp[1][i-1], dp[1][i-2]) + A[0][i];
                dp[1][i] = Math.max(dp[0][i-1], dp[0][i-2]) + A[1][i];
            }
            System.out.println(Math.max(dp[0][n], dp[1][n]));
        }
    }
}