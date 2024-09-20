import java.util.*;

class Solution {
    public int[] solution(int N, int[] stages) {
        int[] step = new int[N+1]; //스테이지에 도달한 사람의 수
        int[] num = new int[N+1]; //스테이지에 도달했지만 풀지 못한 사람의 수
        double[] perc = new double[N]; //확률
        int[] ans = new int[N];
        double[] tmp = new double[N];
        int t = 0;
        
        for(int i=0; i<stages.length; i++){
            int n = stages[i];
            for(int j=0; j<n; j++){
                step[j] += 1;
            }
            if(n<=N){
                num[n-1]+=1;
            }
            
        }
        
        for(int i=0; i<N; i++){
            if(step[i] == 0){
                perc[i] = 0;
            }
            else{
                perc[i] = (double)num[i] / step[i];
            }
            tmp[i] = perc[i];
        }
        
        Arrays.sort(perc); //오름차순으로 정렬
        
        for(int i=N-1; i>=0; i--){
            for(int j=0; j<N; j++){
                if(perc[i] == tmp[j]){
                    ans[t] = j+1;
                    t++;
                    tmp[j] = -1;
                    break;
                }
            }
        }
        return ans;
    }
}