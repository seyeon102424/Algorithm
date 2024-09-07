import java.util.*;

public class Main{
    static int n;
    static int m;
    static boolean found = false;
    static boolean [] check;
    static ArrayList<ArrayList<Integer>> friend;
    
    static void dfs(int node, int depth){
        if(depth == 4){
            found = true;
            return;
        }
        
        check[node] = true;
        for(int next : friend.get(node)){
            if(!check[next]){
                dfs(next, depth+1);
            }
        }
        check[node] = false;
    }
    
    public static void main(String [] args){
        Scanner s = new Scanner(System.in);
        n = s.nextInt();
        m = s.nextInt();
        check = new boolean[n];
        friend = new ArrayList<>();
        
        for(int i=0; i<n; i++){
            friend.add(new ArrayList<>());
        }
        
        for(int i=0; i<m; i++){
            int a = s.nextInt();
            int b = s.nextInt();
            friend.get(a).add(b);
            friend.get(b).add(a);
        }
        
        for(int i=0; i<n; i++){
            if(!found){
                dfs(i,0);
            }
        }
        
        System.out.println(found ? 1 : 0);
    }
}