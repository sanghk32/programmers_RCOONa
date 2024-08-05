
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr = new int[6];

        int x = 1;
        int y = 1;

        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        for (int i = -999; i <= 999; i++) {
            x = i;
            for (int j = -999; j <= 999; j++) {
                y = j;

                if ((arr[0] * x) + (arr[1] * y) == arr[2]) {
                    if ((arr[3] * x) + (arr[4] * y) == arr[5]) {
                        System.out.print(x + " ");
                        System.out.print(y);
                    }
                }

            }
        }

    }
}
