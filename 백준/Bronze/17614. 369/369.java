
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String str = "";
        int count = 0;

        char c;
        for (int i = 1; i <= n; i++) {
            str = Integer.toString(i);
            for (int j = 0; j < str.length(); j++) {
                c = str.charAt(j);
                if (c == '3' || c == '6' || c == '9') {
                    count++;
                }
            }
        }
        System.out.println(count);


    }
}
