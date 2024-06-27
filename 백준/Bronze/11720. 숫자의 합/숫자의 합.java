import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = Integer.parseInt(sc.nextLine());
        String ch = sc.nextLine();
        int sum = 0;
        for (int i = 0; i < num; i++) {
            int chNum = Integer.parseInt(String.valueOf(ch.charAt(i)));
            sum += chNum;
        }
        System.out.println(sum);
    }
}
