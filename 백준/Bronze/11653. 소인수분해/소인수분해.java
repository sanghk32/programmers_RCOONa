

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        List<Integer> list = new ArrayList<>();
        //입력된 숫자 사이에 소인수 구하기
        for (int i = 2; i <= num; i++) {
            while (num % i == 0) {
                System.out.println(i);
                num /= i;
            }
        }
    }
}



