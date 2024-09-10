import java.util.*;

public class Main{
    static int n;
    static int m;
    static int[][] map;
    static boolean[][] check;
    static int[] dx = {-1,1,0,0};
    static int[] dy = {0,0,1,-1};
    static Queue<int[]> q = new LinkedList<>();

    static void bfs(){
        q.add(new int[]{0,0});
        check[0][0] = true;

        while(!q.isEmpty()){
            int[] tmp = q.poll();
            int x = tmp[0];
            int y = tmp[1];

            for(int i=0; i<4; i++){
                int nx = dx[i] + x;
                int ny = dy[i] + y;

                if(nx>=0 && ny>=0 && nx<n && ny<m){
                    if(map[nx][ny]==1){
                        check[nx][ny] = true;
                        q.add(new int[]{nx,ny});
                        map[nx][ny] = map[x][y]+1;
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

        for(int i=0; i<n; i++){
            String[] str = s.next().split("");
            for(int j=0; j<m; j++){
                map[i][j] = Integer.parseInt(str[j]);
            }
        }
        bfs();
        System.out.println(map[n-1][m-1]);
    }
}
