package string;

import com.sun.tools.javac.Main;

import java.util.Scanner;

public class StringFind {
    // 한 개의 문자열을 입력받고, 특정 문자를 입력받아 해당 특정문자가 입력받은 문자열에 몇 개 존재하는지 알아내는 프로그램을 작성하세요.

    public int solution(String str, char t) {
        int answer = 0;

        str = str.toUpperCase();
        t = Character.toUpperCase(t);

//        for (int i = 0; i < str.length(); i++) {
//            if (str.charAt(i) == t) answer++;
//        }

        for (char x : str.toCharArray()) {
            if (x == t) {
                answer++;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        StringFind t = new StringFind();
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        char c = kb.next().charAt(0);
        System.out.println(t.solution(str, c));
    }

//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//
//        String string1 = sc.nextLine();
//
//        String string2 = sc.nextLine();
//        int result = wordCnt(string1, string2);
//        System.out.println("result " + result);
//
//    }
//
//    public static int wordCnt(String string1, String string2) {
//        int sum = 0;
//        String s1 = string1.toUpperCase();
//        String s2 = string2.toUpperCase();
//        String[] strArr = s1.split("");
//
//        if (s1.contains(s2)) {
//            for (String s : strArr) {
//                if (s.equals(s2)) {
//                    sum += s.length();
//                }
//            }
//        }
//        return sum;
//    }
}
