

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        List<String>list = new ArrayList<>();
        int n = Integer.parseInt(br.readLine());
        int m = Integer.parseInt(br.readLine());
        String str = br.readLine();
        int count =0;

        for(int i=0; i<n; i++){
            sb.append("IO");
        }

        String ioi = sb.append("I").toString();


        for(int j=0; j<=m-ioi.length(); j++){
            if(ioi.equals(str.substring(j,ioi.length()+j))){
                count++;
            }
        }
        System.out.println(count);


    }
}
