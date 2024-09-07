import java.util.*;

public class Main{
    public static class Node{
        int x;
        int y;
        int cnt;
        boolean gram;

        public Node(int x, int y, int cnt, boolean gram){
            this.x = x;
            this.y = y;
            this.cnt = cnt;
            this.gram = gram;
        }
    }

    static int n;
    static int m;
    static int t;
    static int[][] map;
    static int[] dx = {-1,1,0,0};
    static int[] dy = {0,0,1,-1};
    static boolean[][][] visit;

    static int bfs(int x, int y){
        Queue<Node> q = new LinkedList<>();
        q.offer(new Node(x,y,0,false));
        visit[x][y][0] = true;

        while(!q.isEmpty()){
            Node tmp = q.poll();

            if(tmp.cnt > t){break;}
            if(tmp.x == n-1 && tmp.y == m-1){return tmp.cnt;}

            for(int i=0; i<4; i++){
                int nx = tmp.x + dx[i];
                int ny = tmp.y + dy[i];
                if(nx>=0 && ny>=0 && nx<n && ny<m){
                    if(!tmp.gram){
                        if(!visit[nx][ny][0] && map[nx][ny]==0){
                            q.offer(new Node(nx,ny,tmp.cnt+1, tmp.gram));
                            visit[nx][ny][0] = true;
                        }
                        else if(!visit[nx][ny][0] && map[nx][ny]==2){
                            q.offer(new Node(nx,ny,tmp.cnt+1, true));
                            visit[nx][ny][0] = true;
                        }
                    }
                    else{
                        if(!visit[nx][ny][1]){
                            q.offer(new Node(nx,ny,tmp.cnt+1, tmp.gram));
                            visit[nx][ny][1] = true;
                        }
                    }
                }
            }
        }
        return -1;
    }

    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        n = s.nextInt();
        m = s.nextInt();
        t = s.nextInt();
        map = new int[n][m];
        visit = new boolean[n][m][2];

        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                map[i][j] = s.nextInt();
            }
        }
        int result = bfs(0,0);

        if(result == -1){System.out.println("Fail");}
        else {System.out.println(result);}
    }
}