import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        String expression = s.next();
        String[] sub = expression.split("-");
        int result = Integer.MAX_VALUE;
        
        for(int i=0; i<sub.length; i++){
            int tmp = 0;
            String[] add = sub[i].split("\\+");
            
            for(int j=0; j<add.length; j++){
                tmp += Integer.parseInt(add[j]);
            }
            
            if(result == Integer.MAX_VALUE){
                result = tmp;
            }
            else{
                result = result - tmp;
            }
        }
        
        
        System.out.println(result);
    }
}