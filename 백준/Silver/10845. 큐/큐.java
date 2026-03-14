import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        Queue<Integer> q = new LinkedList<>();
        
        int n = Integer.parseInt(br.readLine());
        
        for(int i=0; i<n; i++){
            st = new StringTokenizer(br.readLine());
           String str = st.nextToken();
            switch(str){
                case "push": q.add(Integer.parseInt(st.nextToken()));
                    break;
                case "pop" : if(q.size()==0) {
                    System.out.println(-1);
                    break;
                }else{
                    int temp = q.poll();
                    System.out.println(temp);
                    break;
                }
                case "size" : System.out.println(q.size());
                    break;
                case "empty" : if(q.isEmpty()){
                    System.out.println(1);
                    break;
                }else{
                    System.out.println(0);
                    break;
                    
                }
                case "front" : if(q.size()==0){
                    System.out.println(-1);
                    break;
                }else{
                    System.out.println(q.peek());
                    break;
                }
                case "back" : if(q.size()==0){
                    System.out.println(-1);
                    break;
                }else{
                    int box = q.size();
                    System.out.println(((LinkedList<Integer>) q).getLast());

                    break;
                }
                
            }
        }
       
        
        
    }
}