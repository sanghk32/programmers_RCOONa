

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt(); 

        for (int i = 0; i < num; i++) {
            int repeat = sc.nextInt(); 
            String str = sc.next(); 
            char[] arr = new char[str.length() * repeat]; 

            int index = 0;
            for (int j = 0; j < str.length(); j++) {
                char temp = str.charAt(j);

                for (int k = 0; k < repeat; k++) {
                    arr[index++] = temp; 
                }
            }
            System.out.println(arr); 
        }

        sc.close();
    }
}
