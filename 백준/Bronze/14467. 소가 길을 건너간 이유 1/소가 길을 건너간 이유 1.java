import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int [] cow = new int[n+1];
        boolean [] check = new boolean[n+1];
        int cnt = 0;
        
        for(int i=0; i<n; i++){
            if(i==0){
                int a = s.nextInt();
                cow[a] = s.nextInt(); 
                check[a] = true;
            }
            else{
                int a = s.nextInt();
                int b = s.nextInt();
                if(cow[a] != b && check[a]){cnt++;}
                cow[a] = b;
                check[a] = true;
            }
        }
        System.out.println(cnt);
    }
}