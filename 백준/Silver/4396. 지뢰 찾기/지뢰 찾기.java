import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        String[][] map = new String[n][n];
        String[][] play = new String[n][n];
        String[][] result = new String[n][n];
        int[] dx = {-1,1,0,0,-1,1,-1,1};
        int[] dy = {0,0,1,-1,-1,1,1,-1};
        int cnt = 0;
        boolean flag = true;
        
        for(int i=0; i<n; i++){
            String[] str = s.next().split("");
            for(int j=0; j<n; j++){
                map[i][j] = str[j];
            }
        }
        for(int i=0; i<n; i++){
            String[] str = s.next().split("");
            for(int j=0; j<n; j++){
                play[i][j] = str[j];
                result[i][j] = ".";
            }
        }
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                if(play[i][j].equals("x")){
                    if(map[i][j].equals("*")){
                        flag = false;
                    }
                    else{
                        for(int k=0; k<8; k++){
                            int nx = dx[k] + i;
                            int ny = dy[k] + j;
                        
                            if(nx>=0 && ny>=0 && nx<n && ny<n){
                                if(map[nx][ny].equals("*")){
                                    cnt++;
                                }
                            }
                        }
                        result[i][j] = Integer.toString(cnt);
                        cnt = 0;
                    } 
                }
            }
        }
        
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                if(!flag && map[i][j].equals("*")){result[i][j] = "*";}
                System.out.print(result[i][j]);
            }
            System.out.println();
        }
        
    }
}