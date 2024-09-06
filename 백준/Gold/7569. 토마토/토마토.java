import java.util.*;

public class Main {
    static int n;
    static int m;
    static int h;
    static int days = 0;
    static int[] dx = {0, 0, 1, -1, 0, 0};
    static int[] dy = {1, -1, 0, 0, 0, 0};
    static int[] dz = {0, 0, 0, 0, 1, -1};

    static Queue<int[]> q = new LinkedList<>();
    static int [][][] tomato;

    static public int bfs(){
        while(!q.isEmpty()){
            int [] arr = q.poll();
            int z = arr[0];
            int x = arr[1];
            int y = arr[2];
            for(int i=0; i<6; i++){
                int nx = x + dx[i];
                int ny = y + dy[i];
                int nz = z + dz[i];
                if(nx>=0 && ny>=0 && nz>=0 && nx<n && ny<m && nz<h){
                    if(tomato[nz][nx][ny] == 0){
                        q.add(new int[]{nz,nx,ny});
                        tomato[nz][nx][ny] = tomato[z][x][y]+1;
                    }
                }
            }
        }
        for(int k=0; k<h; k++){
            for(int i=0; i<n; i++){
                for(int j=0; j<m; j++){
                    if(tomato[k][i][j] == 0){return -1;}
                    days = Math.max(days, tomato[k][i][j]);
                }
            }
        }

        if(days==1){return 0;}
        else{return days-1;}
    }

    public static void main(String[] args){
        Scanner s = new Scanner(System.in);

        m = s.nextInt();
        n = s.nextInt();
        h = s.nextInt();
        s.nextLine();

        tomato = new int[h][n][m];

        for(int k=0; k<h; k++){
            for(int i=0; i<n; i++){
                for(int j=0; j<m; j++){
                    tomato[k][i][j] = s.nextInt();
                    if(tomato[k][i][j] == 1){q.add(new int[]{k,i,j});}
                }
                //s.nextLine();
            }
            //s.nextLine();
        }

        System.out.println(bfs());
    }
}