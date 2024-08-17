import java.util.Scanner;
import java.math.BigInteger;

public class Main {

    public boolean isInt(int num){
        return num % 1 == 0.0;
    }
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int n, m;
        BigInteger [][]C = new BigInteger[101][101];
        n = s.nextInt();
        m = s.nextInt();

        for(int i=1; i<=n; i++){
            for(int j=0; j<=i; j++){
                if(i==j || j==0){C[i][j] = BigInteger.ONE;}
                else{C[i][j] = C[i-1][j-1].add(C[i-1][j]);}
            }
        }

        System.out.println(C[n][m]);
    }
}