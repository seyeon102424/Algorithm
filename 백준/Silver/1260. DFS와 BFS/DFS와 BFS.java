import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    static int n;
    static int m;
    static int v;

    static StringBuilder sb = new StringBuilder();
    static Queue<Integer> q = new LinkedList<>();
    static int [][] arr;
    static boolean [] check;

    public static void dfs(int start){
        check[start] = true;
        sb.append(start + " ");

        for(int i=0; i<=n; i++){
            if(arr[start][i]==1 && !check[i]){dfs(i);}
        }
    }

    public static void bfs(int start){
        q.add(start);
        check[start] = true;

        while(!q.isEmpty()){
            start = q.poll();
            sb.append(start + " ");

            for(int i=0; i<=n; i++){
                if(arr[start][i]==1 && !check[i]){
                    q.add(i);
                    check[i] = true;
                }
            }
        }
    }

    public static void main(String[] args){
        Scanner s = new Scanner(System.in);

        n = s.nextInt();
        m = s.nextInt();
        v = s.nextInt();
        s.nextLine();

        arr = new int[n+1][n+1];
        check = new boolean[n+1];

        for(int i=0; i<m; i++){
            int a = s.nextInt();
            int b = s.nextInt();
            arr[a][b] = arr[b][a] = 1;
            s.nextLine();
        }

        dfs(v);
        sb.append("\n");
        check = new boolean[n+1];
        bfs(v);

        System.out.println(sb);
    }
}