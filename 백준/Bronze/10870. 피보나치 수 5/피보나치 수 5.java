import java.util.Scanner;
import java.util.*;

public class Main {
    public static void main(String[] args){
        Vector<Integer> ans = new Vector<>();
        Scanner s = new Scanner(System.in);
        int num, n=0, n0=0, n1=1;
        num = s.nextInt();

        if(num == 0){System.out.println("0");}
        else if(num == 1){System.out.println("1");}
        else{
            for(int i=0; i<num-1; i++){
                n = n0 + n1;
                n0 = n1;
                n1 = n;
            }

            System.out.println(n);
        }
    }
}