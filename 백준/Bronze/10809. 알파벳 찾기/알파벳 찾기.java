import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        int[] arr = new int[26];

        for (int j = 0; j < 26; j++) {
            arr[j] = -1;
        }

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (arr[ch - 'a'] == -1) {
                arr[ch - 'a'] = i;
            }
        }
        for (int i = 0; i < 26; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
