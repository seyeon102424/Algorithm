import java.util.*;

public class Main{
    static int money;
    static int[] price = new int[14];
    static int stock=0;
    static int resBnp=0;
    static int resTiming=0;
    static int up=0;
    static int down=0;
    static boolean flag;
    
    static int BNP(){
        for(int i=0; i<14; i++){
            if(money>=price[i]){
                stock += money/price[i];
                money = money%price[i];
            }
            if(money<=0){break;}
        }
        return money + price[13]*stock;
    }
    
    static int Timing(){
        for(int i=1; i<14; i++){
            if(price[i]>price[i-1] && flag){
                up++;
                down=0;
            }
            else if(price[i]<price[i-1]){
                down++;
                up=0;
            }
            else{
                up = 0;
                down = 0;
            }
            if(down==3){
                stock += money/price[i];
                money = money%price[i];
                flag = true;
                down = 0;
            }
            if(up==3){
                money = money + price[i]*stock;
                stock = 0;
                flag = false;
                up = 0;
            }
        }
        return money + price[13]*stock;
    }
    
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        money = s.nextInt();
        int tmp = money;
        
        for(int i=0; i<14; i++){
            price[i] = s.nextInt();
        }
        
        resBnp = BNP();
        stock = 0;
        money = tmp;
        resTiming = Timing();
        
        if(resBnp > resTiming){System.out.println("BNP");}
        else if(resBnp < resTiming){System.out.println("TIMING");}
        else{System.out.println("SAMESAME");}
    }
}