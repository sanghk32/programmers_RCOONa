

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int max = 1;
        int level = 1;


        while (n > max) {
            max += level * 6;
            level++;
        }

        System.out.println(level);


    }
}
