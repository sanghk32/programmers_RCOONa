
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        Map<String, Integer> map = new HashMap<>();
        StringBuilder sb = new StringBuilder();

        String[] total = new String[n];
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < n; i++) {
            total[i] = st.nextToken();
        }

        int m = Integer.parseInt(br.readLine());
        String[] arr = new String[m];

        st = new StringTokenizer(br.readLine());

        for (int j = 0; j < m; j++) {
            arr[j] = st.nextToken();
            map.put(arr[j], 0);
        }

        for (int k = 0; k < n; k++) {
            if (map.containsKey(total[k])) {
                map.put(total[k], map.get(total[k]) + 1);
            }
        }

        for (int z = 0; z < arr.length; z++) {
            sb.append(map.get(arr[z])).append(" ");
        }
        System.out.print(sb);
    }

}

