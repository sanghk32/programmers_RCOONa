

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception{
        Map<String,String> map = new HashMap<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        Set<String> set = new HashSet<>();

        int n= Integer.parseInt(br.readLine());

        for(int i=0; i<n; i++){
            st = new StringTokenizer(br.readLine());
            String key = st.nextToken();
            String value = st.nextToken();
            set.add(key);
            map.put(key,value);
        }

        List<String>list = new ArrayList<>(set);
        Collections.sort(list,Collections.reverseOrder());
        for(int j=0; j<list.size(); j++){
            if(map.get(list.get(j)).equals("enter")){
                System.out.println(list.get(j));
            }
        }




    }
}
