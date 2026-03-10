import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st= new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
         int m = Integer.parseInt(st.nextToken());
    int area=0;
        int x = n;
        int y = m;
        
        while (true) {
            if(n%m !=0 ){
               area=m;
               m = n%m;
               n=area;
            }else{
                System.out.println(m);
                break;
            }
        }
        System.out.println(x*y/m);    
    }
}