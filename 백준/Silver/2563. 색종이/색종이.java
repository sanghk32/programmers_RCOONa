
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        int num= Integer.parseInt(sc.nextLine());
        int[][] arr= new int[100][100];
        int sum=0;
        for(int i=0; i<num; i++){
            int x = Integer.parseInt(sc.next());
            int y = Integer.parseInt(sc.next());
            for(int j=x; j<x+10; j++){
                for (int k=y; k<y+10; k++){
                    arr[j][k]=1;
                }
            }
        }
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr.length; j++){
                if(arr[i][j]==1){
                    sum+=1;
                }
            }
        }
        System.out.println(sum);
    }
}
