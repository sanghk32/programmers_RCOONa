

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        HashMap<String, Integer> map = new HashMap<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        List<String> list = new ArrayList<>();
        int count =0;
        for(int i=0; i<n; i++){
            map.put(br.readLine(),i);
        }

        for(int j=0; j<m; j++){
            list.add(br.readLine());
        }

        for(int k=0; k<list.size(); k++){
            if(map.containsKey(list.get(k))){
                count++;
            }
        }
        System.out.println(count);

    }
}
