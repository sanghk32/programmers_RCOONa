
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        List<Integer> list = new ArrayList<>();
        int num1 = Integer.parseInt(br.readLine());
        int num2 = Integer.parseInt(br.readLine());
        int num3 = Integer.parseInt(br.readLine());
        int num4 = Integer.parseInt(br.readLine());
        int num5 = Integer.parseInt(br.readLine());
        int avg = (num1 + num2 + num3 + num4 + num5) / 5;

        list.add(num1);
        list.add(num2);
        list.add(num3);
        list.add(num4);
        list.add(num5);
        Collections.sort(list);

        System.out.println(avg);
        System.out.println(list.get(2));
    }
}
