package string;

import javax.xml.stream.events.Characters;
import java.util.*;

public class ReverseChar {

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
            while (lt < rt) {
                char tmp = c[lt];
                c[lt] = c[rt];
                c[rt] = tmp;
                lt++;
                rt--;
            }
            System.out.println("c = " + Arrays.toString(c));

        }
        return "";

    }
}

//a#b!GE*T@S
