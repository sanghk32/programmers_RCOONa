import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[]arr = new int[n];
        int firstNum =0;
        int endNum=0;
        for(int i=0; i<n; i++) arr[i]=i+1;
        for(int j=0; j<m; j++){
            int first = sc.nextInt();
            firstNum = first-1;
            int end = sc.nextInt();
            endNum=end-1;
            while(firstNum<endNum){
                int temp = arr[firstNum];
                arr[firstNum++]=arr[endNum];
                arr[endNum--] = temp;
            }
        }
        for(int x:arr){
            System.out.print(x+" ");
        }
    }
}
