import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int n, max = 0;
        int [] A;
        int [] dp;
        n = s.nextInt();
        A = new int[n];
        dp = new int[n];
        s.nextLine();

        for(int i=0; i<n; i++){
            A[i] = s.nextInt();
            dp[i] = A[i];
        }

        for(int i=1; i<n; i++){
            for(int j=0; j<i; j++){
                if(A[j]<A[i] && dp[i]<dp[j]+A[i]){
                    dp[i] = dp[j] + A[i];
                }
            }
        }

        for(int i=0; i<n; i++){
            max = Math.max(dp[i], max);
        }

        System.out.println(max);
    }
}