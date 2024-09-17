import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int [] state = new int[n+1];
        int num;

        for(int i=1; i<n+1; i++){
            state[i] = s.nextInt();
        }
        num = s.nextInt();
        for(int i=0; i<num; i++){
            int a = s.nextInt();
            int b = s.nextInt();

            if(a==1){
                for(int j=1; j<=n/b; j++){
                    if(state[b*j]==1){state[b*j]=0;}
                    else{state[b*j]=1;}
                }
            }
            else{
                if(state[b]==1){state[b]=0;}
                else{state[b]=1;}

                for(int j=1; j<n; j++){
                    if(b==1 || b==n){break;}
                    if(b-j<1 || b+j>n){break;}
                    if(state[b-j] == state[b+j]){
                        if(state[b-j]==1){
                            state[b-j] = 0;
                            state[b+j] = 0;
                        }
                        else{
                            state[b-j] = 1;
                            state[b+j] = 1;
                        }
                    }
                    else{break;}
                }
            }
        }

        for(int i=1; i<n+1; i++){
            System.out.print(state[i] + " ");
            if(i%20 == 0){
                System.out.println();
            }
        }
    }
}