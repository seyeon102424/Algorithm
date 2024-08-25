import java.util.Scanner;
import java.lang.Math;

public class Main {
    static int n;
    static int connect;
    static int count=0;
    static int [][] arr;
    static boolean [] check;

    public static void dfs(int start){
        check[start] = true;
        count++;

        for(int i=0; i<=n; i++){
            if(arr[start][i] == 1 && !check[i]){dfs(i);}
        }
    }
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);

        n = s.nextInt();
        s.nextLine();
        connect = s.nextInt();
        s.nextLine();

        arr = new int[n+1][n+1];
        check = new boolean[n+1];

        for(int i=0; i<connect; i++){
            int a = s.nextInt();
            int b = s.nextInt();
            s.nextLine();

            arr[a][b] = arr[b][a] = 1;
        }

        dfs(1);

        System.out.println(count-1);
    }
}