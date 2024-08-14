

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;


public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String n = br.readLine();


        Integer[] arr = new Integer[n.length()];
        for (int i = 0; i < n.length(); i++) {
            arr[i] = Integer.parseInt(String.valueOf(n.charAt(i)));
        }

        Arrays.sort(arr, Comparator.reverseOrder());
        for (int j = 0; j < arr.length; j++) {
            System.out.print(arr[j]);
        }
    }
}
