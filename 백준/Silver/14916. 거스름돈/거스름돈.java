import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int tmp = 0;
        int num = 1;
        int result = 0;
        boolean flag = false;
       
        tmp = n%5;     
        if(tmp%2==0){
            result += n/5;
            result += tmp/2;
            flag = true;
        }
        
        while(!flag){
            tmp = n/5 - num;
            tmp = n - tmp*5;
            
            if(num > n/5){
                result = -1;
                break;
            }
            
            if(tmp%2==0){
                result += n/5 - num;
                result += tmp/2;
                flag = true;
            }
            else{
                num++;
            }
        }
        
        System.out.println(result);
    }
}