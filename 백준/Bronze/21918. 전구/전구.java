import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int m = s.nextInt();
        int[] state = new int[n+1];
        
        for(int i=1; i<n+1; i++){
            state[i] = s.nextInt();
        }
        for(int i=0; i<m; i++){
            int a = s.nextInt();
            int b = s.nextInt();
            int c = s.nextInt();
            if(a==1){
                state[b] = c;
            }
            else if(a==2){
                for(int j=b; j<=c; j++){
                    if(state[j]==1){state[j] = 0;}
                    else{state[j] = 1;}
                }
            }
            else if(a==3){
                for(int j=b; j<=c; j++){
                    if(state[j]==1){state[j] = 0;}
                }
            }
            else{
                for(int j=b; j<=c; j++){
                    if(state[j]==0){state[j] = 1;}
                }
            }
        }
        for(int i=1; i<n+1; i++){
            System.out.print(state[i] + " ");
        }
    }
}