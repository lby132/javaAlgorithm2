package string;

import java.util.*;

public class FlipWord {

//    설명
//
//    N개의 단어가 주어지면 각 단어를 뒤집어 출력하는 프로그램을 작성하세요.

    public ArrayList<String> solution(int n, String[] str) {

        ArrayList<String> answer = new ArrayList<>();

        for (String s : str) {
            String tmp = new StringBuilder(s).reverse().toString();
            answer.add(tmp);
        }

        return answer;
    }

    public ArrayList<String> solution1(int n, String[] str) {

        ArrayList<String> answer = new ArrayList<>();

        for (String x : str) {
            char[] s = x.toCharArray();
            int lt = 0, rt = x.length() - 1;
            while (lt < rt) {
                char tmp = s[lt];
                s[lt] = s[rt];
                s[rt] = tmp;
                lt++;
                rt--;
            }
            String tmp = String.valueOf(s);
            answer.add(tmp);
        }

        return answer;
    }

    public static void main(String[] args) {
        FlipWord t = new FlipWord();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        String[] str = new String[n];
        for (int i = 0; i < n; i++) {
            str[i] = kb.next();
        }
        for (String x : t.solution1(n, str)) {
            System.out.println(x);
        }
    }



//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//
//        int num = sc.nextInt();
//        int a = 0;
//
//        while (sc.hasNext()) {
//            String str = sc.next();
//
//            System.out.println(Flip(Arrays.asList(str)));
//
//            a++;
//            if (a == num) break;
//        }
//    }
//
//    public static String Flip(List<String> str) {
//
//        Collections.reverse(str);
//
//        String[] strArr;
//        String answer = "";
//        for (String s : str) {
//            strArr = s.split("");
//            for (int i = s.length() - 1; i > -1; i--) {
//                answer += strArr[i];
//            }
//
//        }
//
//        return answer;
//    }


}
