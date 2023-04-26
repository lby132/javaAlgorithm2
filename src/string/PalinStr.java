package string;

import java.util.Collections;
import java.util.Scanner;

public class PalinStr {
//    설명

//    앞에서 읽을 때나 뒤에서 읽을 때나 같은 문자열을 회문 문자열이라고 합니다.
//    문자열이 입력되면 해당 문자열이 회문 문자열이면 "YES", 회문 문자열이 아니면 “NO"를 출력하는 프로그램을 작성하세요.
//    단 회문을 검사할 때 대소문자를 구분하지 않습니다.

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        System.out.println(solution(str));
    }

    public static String solution(String str) {

        String answer;
        StringBuffer sb = new StringBuffer(str);
        sb.reverse();

        if (str.compareToIgnoreCase(sb.toString()) == 0) answer = "YES";
        else answer = "NO";

        return answer;
    }
}
