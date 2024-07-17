
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int x = 0;
        int y = 0;

        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr = {Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken())};
        st = new StringTokenizer(br.readLine());
        int[] arr2 = {Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken())};
        st = new StringTokenizer(br.readLine());
        int[] arr3 = {Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken())};

        if (arr[0] == arr2[0]) {
            x = arr3[0];
        } else if (arr[0] == arr3[0]) {
            x = arr2[0];
        } else {
            x = arr[0];
        }

        if (arr[1] == arr2[1]) {
            y = arr3[1];
        } else if (arr[1] == arr3[1]) {
            y = arr2[1];
        } else {
            y = arr[1];
        }
        System.out.println(x + " " + y);

    }
}

