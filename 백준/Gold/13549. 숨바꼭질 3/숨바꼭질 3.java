import java.util.*;

public class Main{
    static int n;
    static int k;
    static int min = 100000;
    static int max = 100000;
    static Queue<State> q = new LinkedList<>();
    static boolean [] visit = new boolean[max+1];

    public static class State{
        int x;
        int time;

        public State(int x, int time){
            this.x = x;
            this.time = time;
        }
    }

    public static void bfs(){
        while(!q.isEmpty()){
            State state = q.poll();
            visit[state.x] = true;
            
            if(state.x == k){min = Math.min(min, state.time);}
            
            if(state.x*2 <= max && visit[state.x*2] == false){
                q.add(new State(state.x*2,state.time));
            }
            if(state.x+1 <= max && visit[state.x+1] == false){
                q.add(new State(state.x+1,state.time+1));
            }
            if(state.x-1 >= 0 && visit[state.x-1] == false){
                q.add(new State(state.x-1,state.time+1));
            }
        }
    }

    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        n = s.nextInt();
        k = s.nextInt();

        q.add(new State(n,0));

        bfs();
        System.out.println(min);
    }
}