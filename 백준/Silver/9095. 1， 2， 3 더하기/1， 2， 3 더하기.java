import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int test, n;
        int [] A = new int[11];
        int [] ans = new int[11];
        A[0] = 0;
        A[1] = 1;
        A[2] = 2;
        A[3] = 4;

        test = s.nextInt();
        s.nextLine();

        for(int i=4; i<=10; i++){
            A[i] = A[i-1] + A[i-2] + A[i-3];
        }

        for(int i=0; i<test; i++){
            n = s.nextInt();
            ans[i] = A[n];
            s.nextLine();
        }

        for(int i=0; i<test; i++){
               System.out.println(ans[i]);
        }
    }
}