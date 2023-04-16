package string;

import java.util.Scanner;

public class UpLowTrans {
    // 대문자와 소문자가 같이 존재하는 문자열을 입력받아 대문자는 소문자로 소문자는 대문자로 변환하여 출력하는 프로그램을 작성하세요.
    public String solution(String str) {
        String answer = "";
//        for (char x : str.toCharArray()) {
//            if (Character.isLowerCase(x)) answer += Character.toUpperCase(x);
//            else answer += Character.toLowerCase(x);
//        }
        // 대문자 아스키 넘버 65 ~ 90
        // 소문자 아스키 넘버 97 ~ 122
        for (char x : str.toCharArray()) {
            // 소문자 아스키 코드와 대문자 아스키 코드는 32가 차이나기 때문에 소문자 아스키 넘버에서 32를 빼주면 대문자 아스키가 되는데 숫자로 변환되어서 char를 캐스팅해주면 문자로 출력됨
            if (x >= 97 && x <= 122) answer += (char) (x - 32);
            else answer += (char) (x + 32);
        }
        return answer;
    }

    public static void main(String[] args) {
        UpLowTrans ut = new UpLowTrans();
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        System.out.println(ut.solution(str));
    }

//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        String input1 = in.next();
//        System.out.println(transUpNLow(input1));
//    }
//
//    public static String transUpNLow(String str) {
//        char[] chars = str.toCharArray();
//
//        String answer = "";
//        for (int i = 0; i < chars.length; i++) {
//            if (Character.isUpperCase(chars[i])) {
//                char c = Character.toLowerCase(chars[i]);
//                answer += c;
//            } else {
//                char c = Character.toUpperCase(chars[i]);
//                answer += c;
//            }
//        }
//        return answer;
//    }
}
