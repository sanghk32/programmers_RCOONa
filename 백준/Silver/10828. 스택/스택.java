import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int n = Integer.parseInt(br.readLine());
        Stack<Integer> stack = new Stack<>();
        
        
        for(int i=0; i<n; i++){
            st= new StringTokenizer(br.readLine());
            String q = st.nextToken();
            
            switch (q) {
                case "push":
                    stack.push(Integer.parseInt(st.nextToken()));
                    break;

                case "pop":
                    if(stack.size()==0){
                        System.out.println(-1);
                        break;
                    }else{
                        int temp = stack.pop();
                        System.out.println(temp);
                        break;
                        
                    }
                case "size":
                    System.out.println(stack.size());
                        break;
                    
                case "empty":
                    if(stack.empty()){
                        System.out.println(1);
                        break;
                        
                    }else{
                        System.out.println(0);
                        break;
                        
                    }
                case "top":
                    if(stack.size()==0){
                        System.out.println(-1);
                        break;
                        
                    }else{
                       System.out.println(stack.peek()); 
                        break;
                        
                    }
            }
        }
    }
}