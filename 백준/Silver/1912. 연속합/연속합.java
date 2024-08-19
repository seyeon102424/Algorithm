import java.util.Scanner;
import java.lang.Math;

public class Main {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int n, max=0;
        int [] dp;
        int [] A;
        n = s.nextInt();
        s.nextLine();

        A = new int[n];
        dp = new int[n];

        for(int i=0; i<n; i++){
            A[i] = s.nextInt();
            dp[i] = A[i];
        }
        max = A[0];
        for(int i=1; i<n; i++){
            if(A[i]+dp[i-1] > A[i]){
                dp[i] = A[i]+dp[i-1];
            }
            max = Math.max(max, dp[i]);
        }

        System.out.println(max);
    }
}