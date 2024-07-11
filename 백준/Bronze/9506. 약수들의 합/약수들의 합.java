

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            int num = Integer.parseInt(br.readLine());
            int sum = 0;
            if (num == -1) {
                return;
            }
            List<Integer> list = new ArrayList<>();
            for (int i = 1; i < num; i++) {
                if (num % i == 0) {
                    list.add(i);
                    sum += i;
                }
            }
            System.out.print(num);
            if (num == sum) {
                System.out.print(" = ");
                for (int i = 0; i < list.size(); i++) {
                    if (i == list.size() - 1) {
                        System.out.print(list.get(i));
                    } else {
                        System.out.print(list.get(i) + " + ");
                    }
                }
                System.out.println();
            }else{
                System.out.println(" is NOT perfect.");
            }
        }

    }


}


