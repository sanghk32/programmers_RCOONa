import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken()); 
        int M = Integer.parseInt(st.nextToken()); 

        Queue<Integer> q = new LinkedList<>();
        boolean[] visit = new boolean[100001];
        int dist[] = new int[100001];

        
        q.add(N);
        visit[N] = true; 
        
        while(!q.isEmpty()){
            int x = q.poll();
            if(x==M){
                System.out.println(dist[x]);
                return; 
            }
            int[]next = {x-1 ,x+1, x*2};
            for(int i=0; i<3; i++){
               int nx = next[i];
                if(nx>=0 && nx<=100000 && !visit[nx]){
                    q.add(nx);
                    visit[nx] = true;
                    dist[nx]=dist[x] + 1;
                }
            }
        }
        
    }
}