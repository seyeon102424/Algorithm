import java.util.*;

public class Main{
    static int n;
    static int m;
    static int[][] map;
    static boolean[][] check;
    static int[][] result;
    static int[] dx = {-1,1,0,0};
    static int[] dy = {0,0,1,-1};
    
    public static void bfs(int x, int y){
        Queue<int[]> q = new LinkedList<>();
        q.add(new int[]{x,y});
        check[x][y] = true;
        
        while(!q.isEmpty()){
            int[] tmp = q.poll();
            int a = tmp[0];
            int b = tmp[1];
            
            for(int i=0; i<4; i++){
                int nx = a + dx[i];
                int ny = b + dy[i];
                
                if(nx>=0 && ny>=0 && nx<n && ny<m){
                    if(!check[nx][ny] && map[nx][ny]==1){
                        check[nx][ny] = true;
                        q.add(new int[]{nx,ny});
                        result[nx][ny] = result[a][b] + 1;
                    }
                }
            }
        }
    }
    
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        n = s.nextInt();
        m = s.nextInt();
        map = new int[n][m];
        check = new boolean[n][m];
        result = new int[n][m];
        
        int x=0;
        int y=0;
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                map[i][j] = s.nextInt();
                if(map[i][j]==2){
                    x = i;
                    y = j;
                }
                else if(map[i][j]==0){
                    check[i][j] = true;
                }
            }
        }
        bfs(x,y);
        
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                if(!check[i][j]){
                    result[i][j] = -1;
                }
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }
}