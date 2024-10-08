

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

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
                        sb.append(stack.pop()+"\n");
                    }else{
                        sb.append(-1+"\n");
                    }
                    break;
                case 3:
                    sb.append(stack.size()+"\n");
                    break;
                case 4:
                    if(stack.isEmpty()){
                        sb.append(1+"\n");
                    }else{
                        sb.append(0+"\n");
                    }
                    break;
                case 5:
                    if(!stack.isEmpty()){
                        sb.append(stack.peek()+"\n");
                    }else{
                        sb.append(-1+"\n");
                    }
                    break;

            }

        }
        String result = sb.toString();
        System.out.println(result);
    }
}
