

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Map<String, Integer> map = new HashMap<>();
        String str = br.readLine();
        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j <= str.length(); j++) {
                map.put(str.substring(i, j), 1);
            }
        }

        System.out.println(map.size());

    }
}
