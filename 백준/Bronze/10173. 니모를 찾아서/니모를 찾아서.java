
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String NEMO = "NEMO";

        while (true) {
            String findNemo = sc.nextLine();
            if (findNemo.equals("EOI") == true) {
                break;
            } else {
                // findNemo 값을 대문자로 고치기
                findNemo = findNemo.toUpperCase();

                // 문자열 안에서 일치하는 값 찾기
                if (findNemo.contains(NEMO) == true) {
                    System.out.println("Found");
                } else {
                    System.out.println("Missing");
                }
            }
        }
        sc.close();
    }
}