import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        int N = Integer.parseInt(br.readLine());
        int count = 0;
        
        while (N>=0) {
            if(N%5==0){
                count +=N/5;
                sb.append(count);
                System.out.println(sb);
                return;
            }
            N-=3;
            count++;
        }
        sb.append(-1);
        System.out.println(sb);
        }


        
    }

