package ex2;

import java.util.*;

public class Main {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();
        char c = sc.next().charAt(0);

        for (int x : solution(s, c)) {
            System.out.print(x + " ");
        }


    }

    private static int[] solution(String s, char e) {

        int[] answer = new int[s.length()];

        int p = 1000;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == e) {
                p = 0;
                answer[i] = p;
            } else {
                p++;
                answer[i] = p;
            }
        }
        p = 1000;

        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) == e) {
                p = 0;
            } else {
                p++;
                answer[i] = Math.min(answer[i], p);
            }
        }
        return answer;

    }
}
