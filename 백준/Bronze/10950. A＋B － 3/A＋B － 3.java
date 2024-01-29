import java.util.Scanner;
public class Main {
	   public static void main(String args[]) {
		   Scanner scn = new Scanner(System.in);
		   int n = scn.nextInt();
		   int arr[] = new int[n]; 
		   
		   for(int i = 0; i<n; i++) {
			   int a = scn.nextInt();
			   int b = scn.nextInt();
			   
			   arr[i] = a+b;
		   }
		   scn.close();
		   for(int k:arr) {
			   System.out.println(k);
		   }
	      
	}
}