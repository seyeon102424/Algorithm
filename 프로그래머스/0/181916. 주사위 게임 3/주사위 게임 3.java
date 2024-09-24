import java.util.*;

class Solution {
    public int solution(int a, int b, int c, int d) {
        int answer = 0;
        int[] arr = {a,b,c,d};
        int[] tmp = new int[4];
        int k = 0;
        int index = 0;
        int cnt = 0;
        boolean flag = false;
        int p = 0;
        
        if(a==b && b==c && c==d){answer = 1111*a;}
        else{
            for(int i=0; i<4; i++){
                for(int j=0; j<4; j++){
                    if(arr[i] == tmp[j]){
                        flag = true;
                        p = tmp[j];
                        break;
                    }
                    else{continue;}
                }
                if(!flag){
                    tmp[k] = arr[i];
                    k++;
                }
                else if(flag){flag = false;}
            }
            
            for(int i=0; i<4; i++){
                if(arr[i]==p){
                    cnt++;
                }
            } 
        
            for(int i=0; i<4; i++){
                if(tmp[i]==0){
                    index = i;
                    break;
                }
            } 
            if(index==2){
                if(cnt==3){//31일 경우
                    if(tmp[0]==p){answer = (10*p + tmp[1])*(10*p + tmp[1]);}
                    else{answer = (10*p + tmp[0])*(10*p + tmp[0]);}
                }
                else{//22일 경우
                    answer = (tmp[0]+tmp[1]) * Math.abs(tmp[0]-tmp[1]);
                }
            }
            else if(index==3){//211일 경우
                if(tmp[0]==p){answer = tmp[1]*tmp[2];}
                else if(tmp[1]==p){answer = tmp[0]*tmp[2];}
                else{answer = tmp[0]*tmp[1];}
            }
            else if(index==0){//1111일 경우
                int min = Math.min(a,b);
                min = Math.min(min,c);
                min = Math.min(min,d);
                answer = min;
            }
        }
        
        return answer;
    }
}