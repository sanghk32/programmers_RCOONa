

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Stack<Integer> stack = new Stack<>();

        int sum = 0;
        int num = Integer.parseInt(br.readLine());
        for (int i = 0; i < num; i++) {
            int k = Integer.parseInt(br.readLine());
            if (k == 0) {
                stack.pop();
            } else {
                stack.push(k);
            }
        }
        for (int j = 0; j < stack.size(); j++) {
            sum += stack.get(j);
        }
        System.out.println(sum);

    }
}
