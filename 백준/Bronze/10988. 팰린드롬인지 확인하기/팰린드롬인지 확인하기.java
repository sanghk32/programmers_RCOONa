
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        StringBuffer sb = new StringBuffer(str);
        String reverse = String.valueOf(sb.reverse());


        if(str.equals(reverse)){
            System.out.println(1);
        }else{
            System.out.println(0);
        }


    }
}
