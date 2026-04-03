import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        int[]t = new int[n+1];
        int[]p = new int[n+1];
        int[]dp = new int[n+2];
        
        for(int i=1; i<=n; i++){
            st = new StringTokenizer(br.readLine());
            t[i] = Integer.parseInt(st.nextToken());
            p[i] = Integer.parseInt(st.nextToken());         
        }

        int day = 0;
        for(int i=n; i>=1; i--){
            dp[i] = dp[i+1]; 
            
            if(i+t[i]-1<=n){
                    dp[i] = Math.max(dp[i+1], p[i] + dp[i+t[i]]); 
  
            }
        }
        System.out.print(dp[1]);
    }
}