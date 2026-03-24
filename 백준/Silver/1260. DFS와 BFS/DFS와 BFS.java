import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    static int n;
    static int m;
    static int v;
    
    static boolean[] visited;

    static int[][] map;

    static Queue<Integer> queue;
    
    static void bfs(int v){
            queue.offer(v);
            visited[v]=true;
        
        while(!queue.isEmpty()){ 
            int x = queue.poll();
            System.out.print(x + " ");
            for(int i=1; i<=n; i++){
                if(map[x][i]==1 && !visited[i]){
                visited[i]=true;
                queue.offer(i);
            }
            }
            
            
        }
    }
    static void dfs(int v){
        Stack<Integer> stack = new Stack<>();
        stack.push(v);
        
        while(!stack.isEmpty()){
            int x = stack.pop();
            if(visited[x]) continue;
            visited[x]=true;
            
            System.out.print(x+" ");
            for(int i=n; i>=1; i--){
                if(map[x][i]==1 && !visited[i]){
                    stack.push(i);
                }
            }
        }
    }
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
    
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        v = Integer.parseInt(st.nextToken());

        visited = new boolean[n+1];
        
        map = new int[1001][1001];
        
        queue = new LinkedList<>();
        
        for(int i=0; i<m; i++){
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            map[x][y]=1;
            map[y][x]=1;
    }
        dfs(v);
        System.out.println();
        visited = new boolean[n+1];
        bfs(v);
        
}
}