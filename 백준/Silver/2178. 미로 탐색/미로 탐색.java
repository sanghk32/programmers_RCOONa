import java.util.*;   
import java.lang.*;   
import java.io.*;     


class Main {
    static int[][] arr;          
    static boolean[][] visit;    
    static int N, M;             
    static int[] dx = {1, -1, 0, 0}; 
    static int[] dy = {0, 0, 1, -1}; 

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken()); 
        M = Integer.parseInt(st.nextToken()); 

        arr = new int[N][M];
        visit = new boolean[N][M];

        
        for(int i=0; i<N; i++){
            String line = br.readLine(); 
            for(int j=0; j<M; j++){
                arr[i][j] = line.charAt(j) - '0';
            }
        }

        bfs(0,0);

        System.out.println(arr[N-1][M-1]);
    }

    static void bfs(int x, int y){
        visit[x][y] = true;

        Queue<int[]> q = new LinkedList<>();

        q.add(new int[]{x, y});

        while(!q.isEmpty()){
            int[] now = q.poll();
            int cx = now[0]; 
            int cy = now[1]; 

            for(int i=0; i<4; i++) {
                int nx = cx + dx[i]; 
                int ny = cy + dy[i]; 

                if(nx >= 0 && ny >= 0 && nx < N && ny < M) {
                    if(arr[nx][ny] == 1 && !visit[nx][ny]) {
                        visit[nx][ny] = true;
                        arr[nx][ny] = arr[cx][cy] + 1;
                        q.add(new int[]{nx, ny});
                    }
                }
            }
        }
    }
}