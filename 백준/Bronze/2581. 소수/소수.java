import javax.imageio.IIOException;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int m = Integer.parseInt(br.readLine());
        int n = Integer.parseInt(br.readLine());
        List<Integer>list = new ArrayList<>();
        int sum=0;
        for(; m<=n; m++){
            if(m==1){
                continue;
            }
            int x=0;
            for(int i=2; i<m; i++){
                if(m%i==0){
                    x++;
                }
            }
            if(x==0){
                sum+=m;
                list.add(m);
            }
        }

        if(list.isEmpty()){
            System.out.println(-1);
        }else{
            System.out.println(sum);
            System.out.println(list.get(0));
        }


    }

}
