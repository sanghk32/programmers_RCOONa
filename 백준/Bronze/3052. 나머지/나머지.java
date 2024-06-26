import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> arrList = new ArrayList<>();
        int b= 42;
        for(int i=0; i<10; i++){
            int a = sc.nextInt();
            a = a % b;
            if(!arrList.contains(a)){
                arrList.add(a);
            }
        }
        System.out.println(arrList.size());
    }
}
