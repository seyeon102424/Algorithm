import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] w = new int[n];
        int max = 0;

        for(int i=0; i<n; i++){
            w[i] = s.nextInt();
        }

        Arrays.sort(w);

        for(int i=0; i<n; i++){
            max = Math.max(max, w[i]*(n-i));
        }

        System.out.println(max);
    }
}