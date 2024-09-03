import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    static int n;
    static int m;
    static int days = 0;
    static int[] dx = {0, 0, 1, -1};
    static int[] dy = {1, -1, 0, 0};

    static Queue<int[]> q = new LinkedList<>();
    static int [][] map;

    static public int bfs(){
        while(!q.isEmpty()){
            int [] arr = q.poll();
            int x = arr[0];
            int y = arr[1];
            for(int i=0; i<4; i++){
                int nx = x + dx[i];
                int ny = y + dy[i];
                if(nx>=0 && ny>=0 && nx<n && ny<m){
                    if(map[nx][ny] == 0){
                        q.add(new int[]{nx,ny});
                        map[nx][ny] = map[x][y]+1;
                    }
                }
            }
        }
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                if(map[i][j] == 0){return -1;}
                days = Math.max(days, map[i][j]);
            }
        }

        if(days==1){return 0;}
        else{return days-1;}
    }

    public static void main(String[] args){
        Scanner s = new Scanner(System.in);

        m = s.nextInt();
        n = s.nextInt();
        s.nextLine();

        map = new int[n][m];

        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                map[i][j] = s.nextInt();
                if(map[i][j] == 1){q.add(new int[]{i,j});}
            }
            s.nextLine();
        }

        System.out.println(bfs());
    }
}
