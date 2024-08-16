

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int count = n;

        for (int i = 0; i < n; i++) {
            String str = br.readLine();
            int prev = 0;
            int[] arr = new int[26];
            for (int j = 0; j < str.length(); j++) {
                int ch = str.charAt(j);

                if (prev != str.charAt(j)) {
                    if (arr[ch - 97] == 0) {
                        arr[ch - 97]++;
                        prev = ch;
                    } else {
                        count--;
                        break;
                    }
                }

            }
        }
        System.out.println(count);

    }

}
