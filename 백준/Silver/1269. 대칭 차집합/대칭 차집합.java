
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        Map<Integer, Integer> map;
        Map<Integer, Integer> map2;


        int count = 0;

        st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int[] arr = new int[n];
        int[] arr2 = new int[m];

        map = new HashMap<>();
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(st.nextToken());
            arr[i] = num;
            map.put(num, i);
        }

        map2 = new HashMap<>();
        st = new StringTokenizer(br.readLine());
        for (int j = 0; j < m; j++) {
            int num = Integer.parseInt(st.nextToken());
            arr2[j] = num;
            map2.put(num, num);
        }

        for (int k = 0; k < map.size(); k++) { //3
            if (!map2.containsKey(arr[k])) {
                count++;
            }
        }

        for (int z = 0; z < map2.size(); z++) {
            if (!map.containsKey(arr2[z])) {
                count++;
            }
        }
        System.out.println(count);

    }
}
