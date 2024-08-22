class Solution {
    public int solution(int n, int k) {
        int answer = 0;
        int drink = n/10;
        
        if(drink >= 1) { k -= drink; }
        answer = n*12000 + k*2000;
        
        return answer;
    }
}