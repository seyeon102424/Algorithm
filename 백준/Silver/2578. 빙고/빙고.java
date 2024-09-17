import java.util.*;

public class Main{
    static int[][] board = new int[5][5];
    static boolean[][] check = new boolean[5][5];
    static int cnt = 0;
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);

        for(int i=0; i<5; i++){
            for(int j=0; j<5; j++){
                board[i][j] = s.nextInt();
            }
        }

        for(int i=0; i<25; i++){
            int num = s.nextInt();
            for(int a=0; a<5; a++){
                for(int b=0; b<5; b++){
                    if(board[a][b]==num){
                        check[a][b] = true;
                    }
                }
            }
            rcheck();
            ccheck();
            rdcheck();
            ldcheck();
            if(cnt>=3){
                System.out.println(i+1);
                break;
            }
            cnt = 0;
        }
    }
    public static void rcheck(){
        for(int i=0; i<5; i++){
            int five = 0;
            for(int j=0; j<5; j++){
                if(check[i][j]){five++;}
            }
            if(five == 5){cnt++;}
        }
    }
    public static void ccheck(){
        for(int i=0; i<5; i++){
            int five = 0;
            for(int j=0; j<5; j++){
                if(check[j][i]){five++;}
            }
            if(five == 5){cnt++;}
        }
    }
    public static void rdcheck(){
        int five = 0;
        for(int i=0; i<5; i++){
            if(check[i][i]){five++;}
        }
        if(five == 5){cnt++;}
    }
    public static void ldcheck(){
        int five = 0;
        for(int i=0; i<5; i++){
            if(check[i][4-i]){five++;}
        }
        if(five == 5){cnt++;}
    }
}