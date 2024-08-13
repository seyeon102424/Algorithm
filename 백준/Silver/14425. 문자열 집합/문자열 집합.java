import java.util.Scanner;
import java.util.*;

public class Main {
    public static void main(String[] args){
        Stack<String> stack = new Stack<>();
        Scanner s = new Scanner(System.in);
        int num1, num2, ans=0;
        String arg;

        num1 = s.nextInt();
        num2 = s.nextInt();
        s.nextLine();

        for(int i=0; i<num1; i++){
            arg = s.nextLine();
            stack.push(arg);
        }

        for(int i=0; i<num2; i++){
            arg = s.nextLine();
            if(stack.contains(arg)){ans++;}
        }

        System.out.println(ans);
    }
}