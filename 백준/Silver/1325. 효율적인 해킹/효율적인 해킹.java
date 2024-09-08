import java.util.*;

public class Main{
    static int n;
    static int m;
    static int max = 0;
    static ArrayList<ArrayList<Integer>> arr;
    static Queue<Integer> q = new LinkedList<>();
    static boolean[] visit;
    static int[] result;

    public static void bfs(int n){
        q.add(n);
        visit[n] = true;

        while(!q.isEmpty()){
            int num = q.poll();
            for(int next : arr.get(num)){
                if(!visit[next]){
                    visit[next] = true;
                    result[next]++;
                    q.add(next);
                }
            }
        }
    }

    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        n = s.nextInt();
        m = s.nextInt();
        
        result = new int[n+1];
        arr = new ArrayList<>();
        for(int i=0; i<n+1; i++){
            arr.add(new ArrayList<Integer>());
        }

        for(int i=0; i<m; i++){
            int a = s.nextInt();
            int b = s.nextInt();

            arr.get(a).add(b);
        }
        for(int i=1; i<n+1; i++){
            visit = new boolean[n+1];
            bfs(i);
        }
        for(int i=1; i<n+1; i++){
            max = Math.max(max, result[i]);
        }
        for(int i=1; i<n+1; i++){
            if(result[i] == max){
                System.out.print(i + " ");
            }
        }
    }
}