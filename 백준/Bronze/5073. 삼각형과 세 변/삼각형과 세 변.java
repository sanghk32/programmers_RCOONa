

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        while (true) {
            st = new StringTokenizer(br.readLine());
            List<Integer> li = new ArrayList<>();

            while (st.hasMoreTokens()) {
                li.add(Integer.parseInt(st.nextToken()));
            }

            // 종료 조건: 0 0 0 입력 시 프로그램 종료
            if (li.get(0) == 0 && li.get(1) == 0 && li.get(2) == 0) {
                break;
            }

            Collections.sort(li);

            // 삼각형이 될 수 없는 경우 (삼각형 부등식 위반)
            if (li.get(2) >= (li.get(0) + li.get(1))) {
                sb.append("Invalid").append("\n");
            }
            // 정삼각형 (Equilateral)
            else if (li.get(0).equals(li.get(1)) && li.get(1).equals(li.get(2))) {
                sb.append("Equilateral").append("\n");
            }
            // 이등변삼각형 (Isosceles)
            else if (li.get(0).equals(li.get(1)) || li.get(1).equals(li.get(2))) {
                sb.append("Isosceles").append("\n");
            }
            // 일반삼각형 (Scalene)
            else {
                sb.append("Scalene").append("\n");
            }

            // 즉시 출력 후 StringBuilder 초기화
            System.out.print(sb.toString());
            sb.setLength(0);
        }
    }
}
