import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    static int m; 
    static int n; 
    static int k; 
    static int[][] map; 
    static boolean[][] visit; 
    static int[] dx = {-1, 1, 0, 0};  
    static int[] dy = {0, 0, -1, 1};  
    
    static void dfs(int x, int y){
        visit[x][y] = true;
        for(int i=0; i<4; i++){
            int nowX = dx[i] + x;
            int nowY = dy[i] + y;
            if(nowX>=0 && nowY>=0 && nowX <m && nowY<n){
                if(map[nowX][nowY]==1 && !visit[nowX][nowY]){
                    dfs(nowX,nowY);
                }    
            }
        }
    }

    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st; 
        int t = Integer.parseInt(br.readLine());  

        for(int i=0; i<t; i++){
            st = new StringTokenizer(br.readLine());
            m = Integer.parseInt(st.nextToken());
            n = Integer.parseInt(st.nextToken());
            map = new int[m][n];
            visit = new boolean[m][n];
            int count = 0;
            
            k = Integer.parseInt(st.nextToken());
            for(int j=0; j<k; j++){
                st = new StringTokenizer(br.readLine());
				int p1 = Integer.parseInt(st.nextToken());
				int p2 = Integer.parseInt(st.nextToken());
				map[p1][p2] = 1;                
            }

            for(int x=0; x<m; x++){
                for(int y=0; y<n; y++){
                    if(!visit[x][y] && map[x][y]==1){
                        dfs(x,y);
                        count++;
                    }
                }
            }
            System.out.println(count);
        }
    }
}