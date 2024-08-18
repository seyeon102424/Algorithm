import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int n, max = 1;
        int [] A;
        int [] dp;
        n = s.nextInt();
        A = new int[n];
        dp = new int[n];
        s.nextLine();

        for(int i=0; i<n; i++){
            dp[i] = 1;
            A[i] = s.nextInt();
        }

        for(int i=1; i<n; i++){
            for(int j=0; j<i; j++){
                if(A[j]<A[i]){
                    dp[i] = Math.max(dp[i],dp[j]+1);
                }
            }
            max = Math.max(max, dp[i]);
        }

        System.out.println(max);
    }
}