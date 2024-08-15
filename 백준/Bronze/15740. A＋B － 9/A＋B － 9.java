

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        BigInteger bigInteger1;
        BigInteger bigInteger2;

        bigInteger1 = new BigInteger(st.nextToken());
        bigInteger2 = new BigInteger(st.nextToken());

        System.out.println(bigInteger1.add(bigInteger2));

    }
}
