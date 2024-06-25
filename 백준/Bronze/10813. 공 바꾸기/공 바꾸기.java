
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[n];

        for(int i=0; i<n; i++){
            arr[i]=i+1;
        }

        for(int j=0; j<m; j++){
            int first = sc.nextInt();
            int end = sc.nextInt();
            int tmp = arr[first-1];

            arr[first-1] =arr[end-1];
            arr[end-1] =tmp;

        }

        for(int i=0; i<n; i++){
            System.out.print(arr[i]+ " ");
        }
    }
}
