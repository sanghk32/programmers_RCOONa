

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
//Test
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr = new int[5];
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {

            int n = Integer.parseInt(st.nextToken());
            arr[i] = n * n;
        }
        for (int j = 0; j < arr.length; j++) {
            sum += arr[j];
        }
        System.out.println(sum % 10);
    }
}
