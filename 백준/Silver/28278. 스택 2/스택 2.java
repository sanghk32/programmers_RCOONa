

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());

        Stack<Integer>stack = new Stack<>();

        for(int i=0; i<n; i++){
            st = new StringTokenizer(br.readLine());
            int m = Integer.parseInt(st.nextToken());
            switch (m){
                case 1:
                    int x = Integer.parseInt(st.nextToken());
                    stack.add(x);
                    break;
                case 2:
                    if(!stack.isEmpty()){
                        System.out.println(stack.pop());
                    }else{
                        System.out.println(-1);
                    }
                    break;
                case 3:
                    System.out.println(stack.size());
                    break;
                case 4:
                    if(stack.isEmpty()){
                        System.out.println(1);
                    }else{
                        System.out.println(0);
                    }
                    break;
                case 5:
                    if(!stack.isEmpty()){
                        System.out.println(stack.peek());
                    }else{
                        System.out.println(-1);
                    }
                    break;

            }

        }
    }
}
