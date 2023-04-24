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


        reverseChar(str);
    }

    public static String reverseChar(String str) {

        List<String> list = new ArrayList<>();
        for (int i = 0; i < str.length(); i++) {
            char[] c = str.toCharArray();
            int lt = 0, rt = str.length() - 1;
            boolean numeric = isNumeric(c);
            System.out.println("numeric = " + numeric);

            while (lt < rt) {

                if (numeric) {
                    System.out.println("numeric = " + numeric);
                    char tmp = c[lt];
                    c[lt] = c[rt];
                    c[rt] = tmp;
                    lt++;
                    rt--;
                } else {
                    System.out.println(" =sdfsd " );
                    continue;
                }
            }
            System.out.println("Arrays.toString(c) = " + Arrays.toString(c));

        }
        return "";

    }

    public static boolean isNumeric(char[] c) {
        for (char c1 : c) {
            if (!(c1 >= 'A' && c1 <= 'Z') && !(c1 >= 'a' && c1 <= 'z')) {
                return false;

            }
            continue;
        }
        return true;
    }
}


//a#b!GE*T@S
