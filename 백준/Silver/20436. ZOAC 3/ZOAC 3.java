import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        String sl = s.next();
        String sr = s.next();
        int lx=0;
        int ly=0;
        int rx=0;
        int ry=0;
        char tmp;
        int time = 0;
        char[][] keyboard = {
                {'q', 'w', 'e', 'r', 't', 'y', 'u', 'i', 'o', 'p'},
                {'a', 's', 'd', 'f', 'g', 'h', 'j', 'k', 'l', '.'},
                {'z', 'x', 'c', 'v', 'b', 'n', 'm', '.', '.', '.'}
        };
        String str = s.next();

        for(int i=0; i<3; i++){
            for(int j=0; j<10; j++){
                if(sl.charAt(0) == keyboard[i][j]){
                    lx = i;
                    ly = j;
                }
                if(sr.charAt(0) == keyboard[i][j]){
                    rx = i;
                    ry = j;
                }
            }
        }

        for(int k=0; k<str.length(); k++){
            boolean flag = false;
            tmp = str.charAt(k);
            
            for(int i=0; i<3; i++) {
                if (flag) {
                    break;
                }
                for (int j = 0; j < 10; j++) {
                    if (tmp == keyboard[i][j]) {
                        if ((j >= 0 && j <= 3) || (i == 0 && j >= 0 && j <= 4) || (i == 1 && j >= 0 && j <= 4)) {
                            int disl = Math.abs(lx - i) + Math.abs(ly - j);
                            time += disl;
                            time++;
                            lx = i;
                            ly = j;
                        } else {
                            int disr = Math.abs(rx - i) + Math.abs(ry - j);
                            time += disr;
                            time++;
                            rx = i;
                            ry = j;
                        }
                        flag = true;
                        break;
                    }
                }
            }
        }
        System.out.println(time);
    }
}