import java.util.*;
import java.lang.*;
import java.io.*;

class Main {

    static boolean[][] visit;
    static int[][] map;
    static int m;
    static int n;

    static int[] dx = {-1, -1, -1, 0, 0, 1, 1, 1};
    static int[] dy = {-1, 0, 1, -1, 1, -1, 0, 1};
    static int count = 0;

    
    
    
    public static void dfs(int x, int y){
        visit[x][y] = true;
        for(int i=0; i<8; i++){
           int nextX = x + dx[i];
           int nextY = y + dy[i];

            if(nextX >=0 && nextY >=0 && nextX < m && nextY < n){
                if(!visit[nextX][nextY] && map[nextX][nextY]==1){
                    dfs(nextX,nextY);
                }
            }
    }
        
    }
    

    
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        m = Integer.parseInt(st.nextToken());
        n = Integer.parseInt(st.nextToken());
        map = new int[m][n];
        visit = new boolean[m][n];
        
        for(int i=0; i<m; i++){
            st = new StringTokenizer(br.readLine());
            for(int j=0; j<n; j++){
                map[i][j] = Integer.parseInt(st.nextToken()); 
            }
        }

        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
               if(map[i][j]==1 && !visit[i][j]){
                   dfs(i,j);
                   count ++;
               } 
                
            }
        }
        System.out.print(count);
        
    }
}