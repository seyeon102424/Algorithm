import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int test, nation, flight;
        int [] ans = new int[1000];

        test = s.nextInt();
        s.nextLine();

        for(int i=0; i<test; i++){
            nation = s.nextInt();
            flight = s.nextInt();
            s.nextLine();
            ans[i] = nation-1;
            for(int j=0; j<flight; j++){
                s.nextLine();
            }
        }

        for(int i=0; i<test; i++){
            System.out.println(ans[i]);
        }
    }
}