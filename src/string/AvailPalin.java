package string;

import java.util.Arrays;
import java.util.Scanner;

public class AvailPalin {

//    설명
//
//    앞에서 읽을 때나 뒤에서 읽을 때나 같은 문자열을 팰린드롬이라고 합니다.
//
//    문자열이 입력되면 해당 문자열이 팰린드롬이면 "YES", 아니면 “NO"를 출력하는 프로그램을 작성하세요.
//
//    단 회문을 검사할 때 알파벳만 가지고 회문을 검사하며, 대소문자를 구분하지 않습니다.
//    알파벳 이외의 문자들의 무시합니다.

//    예시     found7, time: study; Yduts; emit, 7Dnuof

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        String str = kb.nextLine();
        System.out.println(solution(str));
    }

        public static String solution(String s) {
        String answer = "NO";
        //[^A-Z] = 대문자 A-Z가 아닌것들
        s = s.toUpperCase().replaceAll("[^A-Z]", "");
        String tmp = new StringBuilder(s).reverse().toString();
        if (s.equals(tmp)) answer = "YES";

        return answer;
    }


//    public static void main(String[] args) {
//        Scanner kb = new Scanner(System.in);
//        String str = kb.next();
//        System.out.println(solution(str));
//    }
//
//    public static String solution(String str) {
//
//        String answer = "NO";
//        String[] strArr = {"found7", "time:", "study;"};
//        for (String s : strArr) {
//            String result = new StringBuffer(s).reverse().toString();
//            String match = "[^\uAC00-\uD7A30-9a-zA-Z]";
//            String s1 = result.replaceAll(match, "");
//            String s2 = str.replaceAll(match, "");
//
//            if (s1.equalsIgnoreCase(s2)) {
//                answer = "YES";
//            }
//        }
//
//        return answer;
//    }

}
