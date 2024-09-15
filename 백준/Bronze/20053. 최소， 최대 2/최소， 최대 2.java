import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int test = s.nextInt();

        for(int i=0; i<test; i++){
            int n = s.nextInt();
            int[] arr = new int[n];
            int max = -1000001;
            int min = 1000001;

            for(int j=0; j<n; j++){
                arr[j] = s.nextInt();
                max = Math.max(arr[j], max);
                min = Math.min(arr[j], min);
            }
            System.out.println(min + " " + max);
        }
    }
}