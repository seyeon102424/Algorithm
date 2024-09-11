import java.util.*;

public class Main{
    static int n;
    static int num=0;
    static int[][] map;
    static boolean[][] check;
    static int[] result;
    static int[] dx = {-1,1,0,0};
    static int[] dy = {0,0,1,-1};
    static Queue<int[]>q = new LinkedList<>();

    static void bfs(int a, int b){
        q.add(new int[]{a,b});
        check[a][b] = true;
        result[num]++;

        while(!q.isEmpty()){
            int [] tmp = q.poll();
            int x = tmp[0];
            int y = tmp[1];

            for(int i=0; i<4; i++){
                int nx = dx[i] + x;
                int ny = dy[i] + y;

                if(nx>=0 && ny>=0 && nx<n && ny<n){
                    if(map[nx][ny]==1 && !check[nx][ny]){
                        q.add(new int[]{nx,ny});
                        check[nx][ny] = true;
                        result[num]++;
                    }
                }
            }
        }
    }

    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        n = s.nextInt();
        map = new int[n][n];
        check = new boolean[n][n];
        result = new int[n*n];

        for(int i=0; i<n; i++){
            String[] str = s.next().split("");
            for(int j=0; j<n; j++){
                map[i][j] = Integer.parseInt(str[j]);
            }
        }
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                if(map[i][j]==1 && !check[i][j]){
                    num++;
                    bfs(i,j);
                }
            }
        }
        System.out.println(num);
        Arrays.sort(result);

        for(int i=0; i<result.length; i++){
            if(result[i]==0){}
            else{System.out.println(result[i]);}
        }
    }
}