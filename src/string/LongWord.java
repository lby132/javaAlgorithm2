package string;

import java.util.Arrays;
import java.util.Scanner;

public class LongWord {

    // 한 개의 문장이 주어지면 그 문장 속에서 가장 긴 단어를 출력하는 프로그램을 작성하세요.
    // 문장속의 각 단어는 공백으로 구분됩니다.

    public String solution1(String str) {
        String answer = "";
        int m = Integer.MIN_VALUE, pos;
        while ((pos = str.indexOf(' ')) != -1) {
            String tmp = str.substring(0, pos);
            System.out.println("tmp = " + tmp);
            int len = tmp.length();
            if (len > m) {
                m = len;
                answer = tmp;
            }
            str = str.substring(pos + 1);
            System.out.println("str = " + str);
        }
        if (str.length() > m) answer = str;
        return answer;
    }


    public String solution(String str) {
        String answer = "";
        int m = Integer.MIN_VALUE;
        String[] s = str.split(" ");
        for (String x : s) {
            int len = x.length();
            if (len > m) {
                m = len;
                answer = x;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        LongWord t = new LongWord();
        Scanner kb = new Scanner(System.in);
        String str = kb.nextLine();
        System.out.println(t.solution1(str));
    }
//    public static void main(String[] args) {
//
//        Scanner sc = new Scanner(System.in);
//        String str = sc.nextLine();
//        System.out.println(word(str));
//    }
//
//    public static String word(String str) {
//
//        String[] s = str.split(" ");
//        int max = 0;
//        String answer = "";
//
//        for (String s1 : s) {
//            for (int i = 0; i < s1.length(); i++) {
//                if (s1.length() > max) {
//                    max = s1.length();
//                }
//            }
//        }
//
//        for (String s1 : s) {
//            if (s1.length() == max) {
//                answer = s1;
//                break;
//            }
//        }
//
//        return answer;
//    }
}
