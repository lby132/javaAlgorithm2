package string;

import javax.xml.stream.events.Characters;
import java.util.*;

public class ReverseChar {


//    설명
//
//    영어 알파벳과 특수문자로 구성된 문자열이 주어지면 영어 알파벳만 뒤집고,
//    특수문자는 자기 자리에 그대로 있는 문자열을 만들어 출력하는 프로그램을 작성하세요.

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();


        System.out.println(reverseChar(str));
    }

    public static String reverseChar(String str) {

        String s = "";
        for (int i = 0; i < str.length(); i++) {
            char[] c = str.toCharArray();
            int lt = 0, rt = str.length() - 1;
            while (lt < rt) {
                char tmp = c[lt];
                if (!(c[lt] >= 'a' && c[lt] <= 'z') && !(c[lt] >= 'A' && c[lt] <= 'Z')) {

                } else {
                                        c[lt] = c[rt];

                }
                if (!(c[rt] >= 'A' && c[rt] <= 'Z') && !(c[rt] >= 'a' && c[rt] <= 'z')) {
                } else {
                    c[rt] = tmp;

                }
                lt++;
                rt--;
            }
            s = String.valueOf(c);
        }

        return s;

    }

}


//a#b!GE*T@S
