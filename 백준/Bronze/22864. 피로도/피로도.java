import java.util.Scanner;

public class Main {

    public boolean isInt(int num){
        return num % 1 == 0.0;
    }
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int A, B, C, M, time, hp=0, work=0;
        A = s.nextInt();
        B = s.nextInt();
        C = s.nextInt();
        M = s.nextInt();

        for(time=0; time<24; time++){
            if(A>M){break;}
            if(hp+A > M){
                hp -= C;
                if(hp<0){hp=0;}
            }
            else{
                work += B;
                hp += A;
            }
        }
        System.out.println(work);
    }
}