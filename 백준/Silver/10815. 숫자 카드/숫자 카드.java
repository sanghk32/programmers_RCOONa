
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        Map<String,Integer> map= new HashMap<>();
        int n = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        for(int i=0; i<n; i++){

            map.put(st.nextToken(),i);
        }

        int m = Integer.parseInt(br.readLine());
        String[]arr =new String[m];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i <m ; i++) {
            arr[i] =st.nextToken();
        }
        for(int i=0; i<arr.length;i++){
            if(map.containsKey(arr[i])){
                System.out.print(1+" ");
            }else{
                System.out.print(0+" ");
            }
        }
    }
}
