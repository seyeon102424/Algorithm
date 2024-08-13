import java.util.Scanner;
import java.util.*;

public class Main {

    public static long GCD(long a, long b){
        if(b==0) return a;
        else return GCD(b, a%b);
    }

    public static void main(String[] args){
        Vector<Long> ans = new Vector<>();
        Scanner s = new Scanner(System.in);
        long test, a, b, gcd;
        String arg;

        test = s.nextLong();
        s.nextLine();

        for(int i=0; i<test; i++){
            a = s.nextLong();
            b = s.nextLong();

            gcd = GCD(a,b);
            ans.add((a*b)/gcd);

            s.nextLine();
        }
        for(int i=0; i<test; i++){
            System.out.println(ans.get(i));
        }
    }
}
