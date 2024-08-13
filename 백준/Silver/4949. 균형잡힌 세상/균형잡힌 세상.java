

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            String str = br.readLine();
            if (str.equals(".")) {
                break;
            }

            Stack<Character> stack = new Stack<>();
            boolean isBalanced = true;

            for (int i = 0; i < str.length(); i++) {
                char ch = str.charAt(i);

                if (ch == '(' || ch == '[') {
                    stack.push(ch);
                } else if (ch == ')' || ch == ']') {
                    if (stack.isEmpty() ||
                            (ch == ')' && stack.pop() != '(') ||
                            (ch == ']' && stack.pop() != '[')) {
                        isBalanced = false;
                        break;
                    }
                }
            }

            // 스택이 비어있지 않으면 균형이 맞지 않음
            if (!stack.isEmpty()) {
                isBalanced = false;
            }

            System.out.println(isBalanced ? "yes" : "no");
        }
    }
}
