import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        Queue<Integer> queue = new LinkedList<>();

        
        for(int i=1; i<=n; i++){
            queue.offer(i);
            
        }
        
        for(int i=n; i>1; i--){
            if(queue.size()!=1){
                queue.poll();
               int temp = queue.poll();
                queue.offer(temp);
            }
        }
        System.out.println(queue.peek());
    }
}