
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long n = Integer.parseInt(br.readLine());
        long sum = 1;
        for (int i = 1; i <= n; i++) {
            sum *= i;
        }
        System.out.print(sum);
    }
}
