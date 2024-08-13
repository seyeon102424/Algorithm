import java.util.Collections;
import java.util.Scanner;
import java.util.Vector;

public class Main {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int year;

        year = s.nextInt();

        if(year%4 == 0){ //윤년일 경우
            if(year%400 == 0){
                System.out.println("1");
            }
            else if(year%100 == 0){
                System.out.println("0");
            }
            else{
                System.out.println("1");
            }
        }
        else{
            System.out.println("0");
        }
    }
}
