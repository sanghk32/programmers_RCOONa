

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int[] arr = new int[n];

        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        System.out.println(blackJack(arr,m));
    }
    static int blackJack(int arr[],int m){

        int n=arr.length;
        int sum =0;
        List<Integer> list = new ArrayList<>();

        for(int i=0; i<n-2; i++){
            for(int j=i+1; j<n-1; j++){
                for(int k=j+1; k<n; k++){

                    sum = arr[i]+arr[j]+arr[k];
                    if(sum>m){
                        continue;
                    }
                    list.add(sum);
                }
            }
        }
        int max=list.get(0);
        for(int i=0; i<list.size(); i++){
            if(list.get(i)<=m){
                if(max<list.get(i)){
                    max=list.get(i);
                }
            }
        }
        return max;
    }
}
