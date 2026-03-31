import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    static int n;
    static int [][] map;
    static boolean[][] visit;
    static int[] dx = {-1, 1, 0, 0};  
    static int[] dy = {0, 0, -1, 1};  
    static int count = 0;

    static int dfs(int x, int y){

        visit[x][y]=true;
        count++;

        for(int i=0; i<4; i++){
            int nowx = dx[i] + x;
            int nowy = dy[i] + y;

            if(nowx>=0 && nowy>=0 && nowx<n && nowy<n){
                if(map[nowx][nowy]==1 && !visit[nowx][nowy]){
                    visit[x][y]=true;
                    dfs(nowx,nowy);

                }
            }

        }
        return count;
    }
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        map = new int[n+1][n+1];
        visit = new boolean[n+1][n+1];
        ArrayList<Integer> result = new ArrayList<>();
        for(int i=0; i<n; i++){
            String str = br.readLine();
            for(int j=0; j<n; j++){
                map[i][j] = str.charAt(j)-'0';
            }
        }

        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                if(map[i][j]==1 && !visit[i][j]){
                    count = 0;
                    dfs(i,j);
                    result.add(count);

                }
            }
        }
        System.out.println(result.size());
        Collections.sort(result);

        for(int i=0; i<result.size(); i++){
            System.out.println(result.get(i));
        }


    }
}