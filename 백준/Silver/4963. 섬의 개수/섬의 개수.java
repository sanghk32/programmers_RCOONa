
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    static int w;
    static int h;
    static int [][]map;
    static boolean[][]visit;

    static int[] dx = { -1, -1, -1, 0, 0, 1, 1, 1};
    static int[] dy = { -1, 0, 1, -1, 1, -1, 0, 1};

    public static void dfs(int x, int y){
        visit[x][y] = true;

        for(int i=0; i<8; i++){
            int nowX= x + dx[i];
            int nowY= y + dy[i];

            if(nowX>=0 && nowX<h && nowY>=0 && nowY<w){
                if(!visit[nowX][nowY] && map[nowX][nowY]==1){
                    dfs(nowX,nowY);
                }
            }
        }
    }
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        boolean c = true;
        while (c) {

            st = new StringTokenizer(br.readLine());
             w = Integer.parseInt(st.nextToken());
             h = Integer.parseInt(st.nextToken());
            map = new int[h][w];
            visit = new boolean[h][w];

            if (w == 0 && h == 0) {
                c = false;
            } else {
                for (int i = 0; i < h; i++) {
                    st = new StringTokenizer(br.readLine());
                    for (int j = 0; j < w; j++) {
                        map[i][j] = Integer.parseInt(st.nextToken());
                    }
                }
                int count=0;
                for(int i=0; i<h; i++){
                    for(int j=0; j<w; j++){
                        if(!visit[i][j]&&map[i][j]==1){
                            dfs(i,j);
                            count++;
                        }
                    }
                }
                System.out.println(count);

            }

        }
    }
}