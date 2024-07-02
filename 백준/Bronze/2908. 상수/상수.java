import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int firstScore = Integer.parseInt(sc.next());

        int endScore = Integer.parseInt(sc.next());

        String first = String.valueOf(firstScore);
        String end = String.valueOf(endScore);

        int[] firstArr = new int[first.length()];

        int[] endArr = new int[end.length()];

        for(int i=0; i < first.length(); i++){
            int firstTemp = Integer.parseInt(String.valueOf(first.charAt(i)));
            firstArr[first.length()-1-i]=firstTemp;

            int endTemp = Integer.parseInt(String.valueOf(end.charAt(i)));
            endArr[end.length()-1-i]=endTemp;
        }
        int resultFirst = 0;
        int resultEnd = 0;

        for (int i = 0; i < firstArr.length; i++) {
            resultFirst = resultFirst * 10 +firstArr[i];
            resultEnd = resultEnd * 10 +endArr[i];
        }
        if(resultFirst>resultEnd){
            System.out.println(resultFirst);
        }else{
            System.out.println(resultEnd);
        }


    }
}
