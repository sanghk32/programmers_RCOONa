

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine().toUpperCase();
        int[]arr = new int[26];
        int max=0;
        char temp=' ';
        for(int i=0; i<str.length(); i++){
            arr[str.charAt(i)-'A']++;
        }
        for(int j=0; j<arr.length; j++){
            if(max<arr[j]){
                max=arr[j]; //2  2
                temp=(char)(j+65);  //A B
            }else if(max==arr[j]){
                temp='?';
            }
        }
        System.out.println(temp);


    }
}
