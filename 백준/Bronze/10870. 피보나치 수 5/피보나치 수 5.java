import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int count = 0;

        for(int i=0; i<=n; i++){
           count = recursion(i);
        }
        System.out.print(count);
        
    }
    static int recursion(int n){
            if(n<2){
                return n;
            }
            return recursion(n-1) + recursion(n-2);    
    }
}