import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        Set<String> set = new HashSet<>();
        int count = 0;
        
        for(int i=0; i<n; i++){
            String str = br.readLine();
            if(!str.equals("ENTER")){
                set.add(str);
            }else if(str.equals("ENTER")){
                    if(set.size()==0){
                        continue;
                    }else{
                        count += set.size();
                        set = new HashSet<>();
                    }
                
            }
        }
       
        sb.append(set.size() + count);
        System.out.print(sb);
        
    }
}