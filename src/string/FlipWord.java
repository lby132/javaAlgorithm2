package string;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class FlipWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int a = 0;

        while (sc.hasNext()) {
            String str = sc.next();

            Flip(Arrays.asList(str));

            a++;
            if (a == num) break;
        }

    }

    public static String Flip(List<String> str) {

        String[] strArr;
        for (String s : str) {
            strArr = s.split("");
            System.out.println("strArr.length = " + strArr.length);
            for (int i = 0; i < s.length(); i++) {
                System.out.println("strArr = " + strArr[i]);
                //Comparator 메소드 사용하기
            }

        }


        return null;
    }


}
