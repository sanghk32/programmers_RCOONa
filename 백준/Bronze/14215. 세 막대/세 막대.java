

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] a = new int[3];
        int sum = 0;

        StringTokenizer st = new StringTokenizer(br.readLine());

        a[0] = Integer.parseInt(st.nextToken());
        a[1] = Integer.parseInt(st.nextToken());
        a[2] = Integer.parseInt(st.nextToken());

        if (a[0] >= a[1] + a[2]) {
            a[0] = a[1] + a[2] - 1;
        }
        if (a[1] >= a[0] + a[2]) {
            a[1] = a[0] + a[2] - 1;
        }
        if (a[2] >= a[0] + a[1]) {
            a[2] = a[0] + a[1] - 1;
        }
        sum = a[0] + a[1] + a[2];
        System.out.println(sum);


    }
}
