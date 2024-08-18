

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int count = 0;
        Map<String, String> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            String str = br.readLine();
            map.put(str, str);
        }

        List<String> list = new ArrayList<>();
        for (int j = 0; j < m; j++) {
            String isCheck = br.readLine();
            if (map.containsKey(isCheck)) {
                count++;
                list.add(isCheck);
            }
        }

        System.out.println(count);
        Collections.sort(list);
        for (int k = 0; k < list.size(); k++) {
            System.out.println(list.get(k));
        }
    }
}
