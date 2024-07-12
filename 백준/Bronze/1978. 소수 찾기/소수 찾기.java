import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count =0;
        // 첫 번째 입력 라인에서 숫자의 개수를 읽어들입니다.
        int num = Integer.parseInt(br.readLine());
        // 두 번째 입력 라인에서 숫자들을 읽어들입니다.
        StringTokenizer st = new StringTokenizer(br.readLine());
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < num; i++) {
            list.add(Integer.parseInt(st.nextToken()));
            if(list.get(i)==1){
                continue;
            }
            int x=0;
            for(int j=2; j<list.get(i); j++){
                if(list.get(i)%j==0){
                    x++;
                }
            }
            if(x==0){
                count++;
            }
        }
        System.out.println(count);
    }

}