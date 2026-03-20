import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    static int[][] map;
    static boolean[][] visit;
    static int M;
    static int N;
    static int K;
    static int sum=1;
   static int[] dx = {1, 0, -1, 0};
   static int[] dy = {0, 1, 0, -1};
    
    static int dfs(int x, int y){
        
        visit[x][y] = true; 
        
        for(int i=0; i<4; i++){ 
            int nowX = dx[i] + x; 
            int nowY = dy[i] + y; 
            if(nowX>=0 && nowY>=0 && nowX<M && nowY<N){
                if(map[nowX][nowY]==1 && !visit[nowX][nowY]){
                    sum++;
                    dfs(nowX,nowY);
                                                
                    }
                }
        }   
        return sum;
    }
    
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        M = Integer.parseInt(st.nextToken());
        N = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());
            
        
        map = new int[M][N];
        visit = new boolean[M][N];
        
        for(int i=0; i<M; i++){
            for(int j=0; j<N; j++){
                map[i][j] = 1;
            }
        }

        for(int i=0; i<K; i++){
            st = new StringTokenizer(br.readLine());
                int x1 = Integer.parseInt(st.nextToken());
                int y1 = Integer.parseInt(st.nextToken());
                int x2 = Integer.parseInt(st.nextToken());
                int y2 = Integer.parseInt(st.nextToken());

                for(int y=y1; y<y2; y++){
                    for(int x=x1; x<x2; x++){
                        map[y][x] = 0; 
                    }
                }
        }
        int count = 0;

    
        List<Integer> list = new ArrayList<>();
        
        for(int i=0; i<M; i++){
            for(int j=0; j<N; j++){
                if(map[i][j]==1 && !visit[i][j]){
                sum = dfs(i,j);
                list.add(sum);            
                    count++;
                    sum=1;
                    
                }
            }
        }
        
        System.out.println(count);
        Collections.sort(list);
        for (int num : list) {
            System.out.print(num+" ");
        }
    }
}