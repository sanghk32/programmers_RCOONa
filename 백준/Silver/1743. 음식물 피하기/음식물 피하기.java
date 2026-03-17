import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    
    static boolean[][] visit;
    
    static int[][] map; 

    static int[] x = {-1,0,1,0};
    static int[] y = {0,1,0,-1};
    
    
    static int dfs(int dx, int dy){
        visit[dx][dy] = true;
        int size = 1;
        
        for(int i=0; i<4; i++){
            int rx = dx + x[i];
            int ry = dy + y[i];

            if(rx>=0 && ry>=0 && rx < map.length && ry < map[0].length){
                if(map[rx][ry]==1 && !visit[rx][ry]){
                    size += dfs(rx, ry);
                }
            }
        }
        return size;
    }

    
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        int max = 0;
        map = new int[n][m];
        visit = new boolean[n][m];
        
        for(int i=0; i<k; i++){
            st= new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            
            map[x-1][y-1] = 1; 
        }

        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                if(!visit[i][j] && map[i][j]==1){
                    int size = dfs(i,j);
            max = Math.max(max, size);
                }
            }
        }
        System.out.print(max);
    }
}