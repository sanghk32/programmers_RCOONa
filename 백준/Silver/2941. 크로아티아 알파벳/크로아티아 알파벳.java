import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);

            // c=, c-
            if (c == 'c' && i + 1 < str.length()) {
                if (str.charAt(i + 1) == '=' || str.charAt(i + 1) == '-') {
                    count++;
                    i++; // 다음 문자 스킵
                    continue;
                }
            }

            // dz=
            if (c == 'd' && i + 2 < str.length()) {
                if (str.charAt(i + 1) == 'z' && str.charAt(i + 2) == '=') {
                    count++;
                    i += 2; // dz= 전체 스킵
                    continue;
                }
            }

            // d-
            if (c == 'd' && i + 1 < str.length()) {
                if (str.charAt(i + 1) == '-') {
                    count++;
                    i++;
                    continue;
                }
            }

            // lj
            if (c == 'l' && i + 1 < str.length()) {
                if (str.charAt(i + 1) == 'j') {
                    count++;
                    i++;
                    continue;
                }
            }

            // nj
            if (c == 'n' && i + 1 < str.length()) {
                if (str.charAt(i + 1) == 'j') {
                    count++;
                    i++;
                    continue;
                }
            }

            // s=
            if (c == 's' && i + 1 < str.length()) {
                if (str.charAt(i + 1) == '=') {
                    count++;
                    i++;
                    continue;
                }
            }

            // z=
            if (c == 'z' && i + 1 < str.length()) {
                if (str.charAt(i + 1) == '=') {
                    count++;
                    i++;
                    continue;
                }
            }

            // 일반 알파벳
            count++;
        }

        System.out.println(count);
    }
}