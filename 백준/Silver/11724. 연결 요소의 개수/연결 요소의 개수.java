import java.util.*;
import java.io.*;

class Main {
    static boolean[] visit;
    static int N;
    static ArrayList<Integer>[] map;

    public static void dfs(int i){
        visit[i] = true;

         
        for(int j=0; j<map[i].size(); j++){
            int next = map[i].get(j);
            if(!visit[next] ){
                dfs(next);
            }
        }
    }

    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int count = 0;

        map = new ArrayList[N+1];
        visit = new boolean[N+1];

        for(int i=1; i<=N; i++){
            map[i] = new ArrayList<Integer>();
        }

        for(int i=0; i<M; i++){
            st = new StringTokenizer(br.readLine());
            int u = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());
            map[u].add(v);
            map[v].add(u);
        }

        for(int i=1; i<=N; i++){
            if(!visit[i]){
                dfs(i);
                count++;
            }
        }
        System.out.print(count);

    }
}