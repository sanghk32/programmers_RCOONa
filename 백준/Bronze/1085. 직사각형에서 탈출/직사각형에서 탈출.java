
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int num1 = Integer.parseInt(st.nextToken());//x좌표
        int num2 = Integer.parseInt(st.nextToken());//y좌표
        int num3 = Integer.parseInt(st.nextToken());//w
        int num4 = Integer.parseInt(st.nextToken());//h

        int min = Math.min(num3-num1,num4-num2);
        int min2 = Math.min(num1,num2);
        if(min<min2){
            System.out.println(min);
        }else{
            System.out.println(min2);
        }
    }
}
