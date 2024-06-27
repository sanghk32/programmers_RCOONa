import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = Integer.parseInt(sc.nextLine());
        String[]arr = new String[num];
        for(int i=0; i<num; i++){
            String sNum = sc.nextLine();
            arr[i] = sNum;
            
        }
        for(int j=0; j<num; j++){
            System.out.print(arr[j].charAt(0));
            System.out.print(arr[j].charAt(arr[j].length()-1));
            System.out.println();
        }

    }
}
