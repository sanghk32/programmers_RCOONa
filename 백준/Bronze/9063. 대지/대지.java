

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int input = Integer.parseInt(br.readLine());

        int[] x = new int[input];
        int[] y = new int[input];

        int xCompare = 0;
        int yCompare = 0;


        for (int i = 0; i < input; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int xValue = Integer.parseInt(st.nextToken());
            int yValue = Integer.parseInt(st.nextToken());

            x[i] = xValue;
            y[i] = yValue;

        }
        Arrays.sort(x);
        Arrays.sort(y);

        int xResult = x[x.length - 1] - x[0];
        int yResult = y[y.length - 1] - y[0];

        System.out.println(xResult * yResult);
    }
}
