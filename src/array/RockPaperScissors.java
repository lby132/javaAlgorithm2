package array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class RockPaperScissors {

    //    설명
//
//    A, B 두 사람이 가위바위보 게임을 합니다. 총 N번의 게임을 하여 A가 이기면 A를 출력하고, B가 이기면 B를 출력합니다. 비길 경우에는 D를 출력합니다.
//
//    가위, 바위, 보의 정보는 1:가위, 2:바위, 3:보로 정하겠습니다.
//
//    예를 들어 N=5이면
//
//    두 사람의 각 회의 가위, 바위, 보 정보가 주어지면 각 회를 누가 이겼는지 출력하는 프로그램을 작성하세요.
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = kb.nextInt();
        }
        for (int i = 0; i < n; i++) {
            b[i] = kb.nextInt();
        }

        for (char x : solution(n, a, b).toCharArray()) System.out.println(x);

    }
//12345678910
    public static String solution(int n, int[] a, int[] b) {

        String answer = "";
        for (int i = 0; i < n; i++) {
            if (a[i] == b[i]) answer += "D";
            else if (a[i] == 1 && b[i] == 3) answer += "A";
            else if (a[i] == 2 && b[i] == 1) answer += "A";
            else if (a[i] == 3 && b[i] == 2) answer += "A";
            else answer += "B";
        }

        return answer;
    }
}


