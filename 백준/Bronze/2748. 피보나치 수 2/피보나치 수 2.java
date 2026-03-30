import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        arr = new long[n+1];
        pibo(n);
        System.out.print(arr[n]);
    }

    static long[] arr;
    static void pibo(int n){
            for(int i=0; i<=n; i++){
                if(i<2){
                    arr[i]=i;
                }else{
                    arr[i] = arr[i-2] + arr[i-1];
                }
                
                
            }
            
        }
        
    }
