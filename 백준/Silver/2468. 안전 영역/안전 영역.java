import java.util.*;
import java.lang.*;
import java.io.*;

class Main {

    static int N;
    static int[][] map;
    static boolean[][] visit;
    static int[] dx = {1, 0, -1, 0};
    static int[] dy = {0, 1, 0, -1};
    static int max = 0;
    static int height = 0;
    
    static void dfs(int x, int y){
        visit[x][y] = true;
        for(int i=0; i<4; i++){
            int nowX = dx[i] + x;
            int nowY = dy[i] + y;

            if(nowX>=0 && nowX<N && nowY>=0 && nowY<N){
                if(!visit[nowX][nowY] && map[nowX][nowY]>height){
                    dfs(nowX,nowY);
                }
            }
        }    
    }

    
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        
        N = Integer.parseInt(br.readLine());
        map = new int[N][N];
        for(int i=0; i<N; i++){
            st = new StringTokenizer(br.readLine());
            for(int j=0; j<N; j++){
                map[i][j] = Integer.parseInt(st.nextToken());
                max = Math.max(max,map[i][j]);
            }
        }
        
        int answer = 0;
        for(height=0; height<=max; height++){
        visit = new boolean[N][N];
        int count = 0;
            for(int i=0; i<N; i++){
                for(int j=0; j<N; j++){
                    if(!visit[i][j] && map[i][j]>height){
                        dfs(i,j);
                        count++;
                    }
                }
                
            }
            answer = Math.max(answer,count);
        }
        
        

        System.out.print(answer);
    }
}