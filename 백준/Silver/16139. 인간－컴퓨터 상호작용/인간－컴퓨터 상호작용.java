

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        String s = br.readLine();
        int q = Integer.parseInt(br.readLine());

        for (int i = 0; i < q; i++) {
            st = new StringTokenizer(br.readLine());
            String ch = "";
            int first = 0;
            int second = 0;

            ch = st.nextToken();
            first = Integer.parseInt(st.nextToken());
            second = Integer.parseInt(st.nextToken());

            String str = s.substring(first, second + 1);
            sb.append(str.length() - str.replace(ch, "").length() + "\n");
        }
        System.out.println(sb);
    }
}
