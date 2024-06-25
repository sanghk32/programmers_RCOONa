import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < m; i++) {
            int start = sc.nextInt();
            int end = sc.nextInt();
            int value = sc.nextInt();


            for (int j = start-1; j < end; j++) {
                arr[j] = value;
            }


        }

        for(int x:arr){
            System.out.print(x+" ");
        }


    }
}
