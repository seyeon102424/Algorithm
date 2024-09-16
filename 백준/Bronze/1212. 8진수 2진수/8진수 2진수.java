import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        String str = s.next();
        StringBuilder result = new StringBuilder();

        for(int i=0; i<str.length(); i++){
            String a = Integer.toBinaryString(str.charAt(i) - '0');
            if(a.length()==2 && i!=0){a = "0" + a;}
            else if(a.length()==1 && i!=0){a = "00" + a;}
            
            result.append(a);
        }

        System.out.println(result);
    }
}