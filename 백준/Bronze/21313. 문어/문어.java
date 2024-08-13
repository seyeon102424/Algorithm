import java.util.Scanner;
import java.util.*;

public class Main {
    public static void main(String[] args){
        Vector<Integer> ans = new Vector<>();
        Scanner s = new Scanner(System.in);
        int num;
        num = s.nextInt();

        if(num%2 == 0){
            for(int i=0; i<num; i++){
                if(i%2 == 0){System.out.print("1 ");}
                else if(i == num-1) {System.out.print("2");}
                else{System.out.print("2 ");}
            }
        }
        else{
            for(int i=0; i<num; i++){
                if(i == num-1){System.out.print("3");}
                else if(i%2 == 0) {System.out.print("1 ");}
                else{System.out.print("2 ");}
            }
        }
    }
}
