

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());

        int k = Integer.parseInt(st.nextToken());

        int[] arr = new int[n];
        int[] prefix = new int[n + 1];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
            prefix[i + 1] = prefix[i] + arr[i];
        }

        int maxSum = Integer.MIN_VALUE;

        for (int j = k; j <= n; j++) {
            int sum = prefix[j] - prefix[j - k];
            maxSum = Math.max(maxSum, sum);
        }
        System.out.println(maxSum);
    }
}
