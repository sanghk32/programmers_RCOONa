import java.util.*;
import java.lang.*;
import java.io.*;
import java.math.BigInteger;

class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        BigInteger big = new BigInteger("1");

        for(int i=N; i>0; i--){
            big = big.multiply(BigInteger.valueOf(i)); 
        }

        String result = big.toString();
        int count = 0;
        
        for(int i = result.length()-1; i>=0; i--){
            if(result.charAt(i) == '0'){
                count ++;
            }else{
                break;
            }
        }
        System.out.println(count);
    }
}