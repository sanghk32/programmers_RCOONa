import javax.imageio.IIOException;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        HashMap<String,Integer> map = new HashMap<>();
        HashMap<Integer,String> map2 = new HashMap<>();


        int n= Integer.parseInt(st.nextToken());
        int m= Integer.parseInt(st.nextToken());
        boolean s =true;


        for(int i=1; i<=n; i++){
            String str=br.readLine();
            map.put(str,i);
            map2.put(i,str);
        }

        for(int j=0; j<m; j++){
           String str= br.readLine();
           s = isNum(str);
           if(s){
               int num = Integer.parseInt(str);
               System.out.println(map2.get(num));
           }else{
               System.out.println(map.get(str));
           }

        }
        //정수면 true
        //문자면 false


    }
    public static boolean isNum(String str){
        for(int i=0; i<str.length(); i++){
            if(!Character.isDigit(str.charAt(i))){
                return false;
            }
        }
        return true;
    }
}
