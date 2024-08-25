import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    static int n;

    static Queue<Integer> q = new LinkedList<>();
    static ArrayList<ArrayList<Integer>> arr;
    static boolean [] check;
    static int [] parent;

    static public void bfs(int start){
        q.add(start);
        check[start] = true;

        while(!q.isEmpty()){
            start = q.poll();

            for(int next : arr.get(start)){
                if(!check[next]){
                    q.add(next);
                    parent[next] = start;
                    check[next] = true;
                }
            }
        }
    }

    public static void main(String[] args){
        Scanner s = new Scanner(System.in);

        n = s.nextInt();
        s.nextLine();

        arr = new ArrayList<>(n+1);
        check = new boolean[n+1];
        parent = new int[n+1];

        for(int i = 0; i <= n; i++){
            arr.add(new ArrayList<>());
        }

        for(int i=1; i<n; i++){
            int a = s.nextInt();
            int b = s.nextInt();
            arr.get(a).add(b);
            arr.get(b).add(a);
            s.nextLine();
        }

        bfs(1);

        for(int i=2; i<=n; i++){
            System.out.println(parent[i]);
        }
    }
}