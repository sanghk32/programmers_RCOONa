

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num1 = Integer.parseInt(br.readLine());
        int num2= Integer.parseInt(br.readLine());
        int num3 = Integer.parseInt(br.readLine());

        int sum= num1+num2+num3;

        if(num1==60&&num2==60&&num3==60){
            System.out.println("Equilateral");
        }else if(sum==180){
            if(num1==num2){
                System.out.println("Isosceles");
            }else if(num2==num3){
                System.out.println("Isosceles");
            }else if(num3==num1){
                System.out.println("Isosceles");
            }else{
                System.out.println("Scalene");
            }
        }else{
            System.out.println("Error");
        }

    }
}
