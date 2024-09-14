import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int [] sub = new int[31];
        int [] result = new int[2];

        for(int i=1; i<29; i++){
            int success = s.nextInt();
            sub[success] = 1;
        }
        

        for(int i=1; i<31; i++){
            if(sub[i]!=1){System.out.println(i);}
        }
    }
}