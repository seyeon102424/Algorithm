import java.util.Scanner;
import java.lang.Math;

public class Main {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int n;

        n = s.nextInt();
        s.nextLine();

        int [] wine = new int[n+1];
        int [] dp = new int[n+1];

        for(int i=1; i<=n; i++){
            wine[i] = s.nextInt();
            s.nextLine();
        }

        for(int i=1; i<=n; i++){
            if(i==1){dp[i] = wine[1];}
            else if(i==2){dp[i] = wine[1]+wine[2];}
            else{
                dp[i] = Math.max(dp[i-1], Math.max(dp[i-2]+wine[i], dp[i-3]+wine[i-1]+wine[i]));
            }
        }

        System.out.println(dp[n]);
    }
}
