import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int one = Integer.parseInt(st.nextToken());
        int two = Integer.parseInt(st.nextToken());
        int thr = Integer.parseInt(st.nextToken());
        
        int money= 0;
        
        if(one != two && two != thr && one != thr){
            if(one>two){
                if(one>thr){
                    money = one * 100;
                }
                else{
                    money = thr * 100;
                }
            }
            else {
                if(two>thr){
                    money = two*100;
                }
                else{
                    money = thr*100;
                }
            }
        }


        else{
            if(one==two&&two==thr){
                money = (10000 +(one*1000));
            }



            else {
                if ((one == two || one == thr)) {
                    money = (1000 + (one * 100));
                } else {
                    money = (1000 + (two * 100));
                }

            }

        }

    System.out.print(money);


    }
}
