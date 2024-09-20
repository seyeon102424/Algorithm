import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] tip = new int[n];
        long result = 0;
        int seq = 1;

        for(int i=0; i<n; i++){
            tip[i] = s.nextInt();
        }
        Arrays.sort(tip);

        for(int i=n-1; i>=0; i--){
            int money = tip[i] - (seq-1);
            if(money>0){result = result + money;}
            seq++;
        }

        System.out.println(result);
    }
}