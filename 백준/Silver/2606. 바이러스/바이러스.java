import java.util.*;
import java.lang.*;
import java.io.*;

class Main {

    static ArrayList<Integer>[] arr;
    static boolean[] check;
    static int count = 0;
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int n = Integer.parseInt(br.readLine());
        int m = Integer.parseInt(br.readLine());

        check = new boolean[n+1];
        arr = new ArrayList[n+1];

        		for(int i = 0; i <= n; i++) {
			arr[i] = new ArrayList<>();
		}
        
        for(int i=0; i<m; i++){
            st = new StringTokenizer(br.readLine());
            int u = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());

            arr[u].add(v);
            arr[v].add(u);
        }
         dfs(1);
        System.out.print(count);
    }
   public static void dfs(int start){
       check[start]=true;
       for(int x : arr[start]){
           if(check[x]==false){
                dfs(x);   
               count++;
       }
   }
}
}