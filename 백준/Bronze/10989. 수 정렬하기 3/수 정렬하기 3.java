

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            int m = Integer.parseInt(br.readLine());
            arr[i] = m;


        }
        Arrays.sort(arr);
        for (int j = 0; j < arr.length; j++) {
            sb.append(arr[j]).append('\n');
        }
        System.out.println(sb);

    }
}
