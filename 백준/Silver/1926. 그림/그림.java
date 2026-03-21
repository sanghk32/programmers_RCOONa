import java.util.*;
import java.io.*;

class Main {

    static int[][] map;
    static boolean[][] visit;
    static int h, m;

    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};

    static int bfs(int x, int y) {
        int sum = 1;
        visit[x][y] = true;

        Queue<int[]> q = new LinkedList<>();
        q.add(new int[]{x, y});

        while (!q.isEmpty()) {
            int[] now = q.poll();
            int cx = now[0];
            int cy = now[1];

            for (int i = 0; i < 4; i++) {
                int nx = cx + dx[i];
                int ny = cy + dy[i];

                if (nx >= 0 && ny >= 0 && nx < h && ny < m) {
                    if (map[nx][ny] == 1 && !visit[nx][ny]) {
                        visit[nx][ny] = true;
                        q.add(new int[]{nx, ny});
                        sum++;
                    }
                }
            }
        }

        return sum;
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        h = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        map = new int[h][m];
        visit = new boolean[h][m];

        for (int i = 0; i < h; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < m; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        int count = 0;
        int max = 0;

        for (int i = 0; i < h; i++) {
            for (int j = 0; j < m; j++) {
                if (map[i][j] == 1 && !visit[i][j]) {
                    int area = bfs(i, j);
                    max = Math.max(max, area);
                    count++;
                }
            }
        }

        System.out.println(count);
        System.out.println(max);
    }
}