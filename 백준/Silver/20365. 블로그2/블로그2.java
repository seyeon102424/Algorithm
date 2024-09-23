import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();
        int b = 0;
        int r = 0;
        int result = 0;
        char cur = 'N';
        
        for(int i=0; i<n; i++){
            if(s.charAt(i) == 'B'){
                if(cur == 'B'){continue;}
                else{
                    b++;
                    cur = 'B';
                }
            }
            else if(s.charAt(i) == 'R'){
                if(cur == 'R'){continue;}
                else{
                    r++;
                    cur = 'R';
                }
            }
        }
        System.out.println(Math.min(r,b)+1);
    }
}