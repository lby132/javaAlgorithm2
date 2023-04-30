package string;

import java.util.*;

public class NumberOnly {

//    설명
//
//    문자와 숫자가 섞여있는 문자열이 주어지면 그 중 숫자만 추출하여 그 순서대로 자연수를 만듭니다.
//
//    만약 “tge0a1h205er”에서 숫자만 추출하면 0, 1, 2, 0, 5이고 이것을 자연수를 만들면 1205이 됩니다.
//
//    추출하여 만들어지는 자연수는 100,000,000을 넘지 않습니다.

    public static int solution(String str) {
        int answer = 0;
        for (char x : str.toCharArray()) {
            if (x>=48 && x<=57) answer = answer * 10 + (x - 48);
        }

        return answer;
    }

    public static int solution2(String str) {
        String answer = "";
        for (char x : str.toCharArray()) {
            if (Character.isDigit(x)) answer += x;
        }

        return Integer.parseInt(answer);
    }

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        System.out.println(solution2(str));
    }


//    public static void main(String[] args) {
//        Scanner kb = new Scanner(System.in);
//        String str = kb.next();
//        System.out.println(solution(str));
//    }
//
//    public static int solution(String str) {
//
//        String reStr = str.replaceAll("[^0-9]", "");
//        String answer = "";
//        for (int i = 0; i < reStr.length(); i++) {
//            if (reStr.charAt(0) == '0') {
//                answer = reStr.substring(1);
//            } else {
//                answer = reStr.substring(0);
//            }
//        }
//
//        int i = Integer.parseInt(answer);
//
//        return i;
//    }
}



