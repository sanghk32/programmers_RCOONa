

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        Map<Integer, Integer> map = new HashMap<>();


        int n = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            int index = Integer.parseInt(st.nextToken());
            map.put(index, index);
        }

        int m = Integer.parseInt(br.readLine());
        int[] arr = new int[m];
        st = new StringTokenizer(br.readLine());
        for (int j = 0; j < m; j++) {
            arr[j] = Integer.parseInt(st.nextToken());
        }

        for (int k = 0; k < arr.length; k++) {
            if (map.containsKey(arr[k])) {
                System.out.println("1");
            } else {
                System.out.println("0");
            }
        }

    }
}
