

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String id = br.readLine();
        String fan = ":fan:";

        for (int i = 0; i < 3; i++) {
            System.out.print(fan);
        }
        System.out.println();

        for (int i = 0; i < 1; i++) {
            System.out.print(fan + ":");
            System.out.print(id);
            System.out.print(":" + fan);

        }
        System.out.println();

        for (int i = 0; i < 3; i++) {
            System.out.print(fan);
        }
    }
}
