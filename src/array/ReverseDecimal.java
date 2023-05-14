package array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ReverseDecimal {

//    설명
//
//    N개의 자연수가 입력되면 각 자연수를 뒤집은 후 그 뒤집은 수가 소수이면 그 소수를 출력하는 프로그램을 작성하세요.
//
//    예를 들어 32를 뒤집으면 23이고, 23은 소수이다. 그러면 23을 출력한다. 단 910를 뒤집으면 19로 숫자화 해야 한다.
//
//    첫 자리부터의 연속된 0은 무시한다.

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = kb.nextInt();
        }
        for (int x : solution(n, arr)) {
            System.out.println(x + " ");
        }
    }

    public static boolean isPrime(int num) {
        if (num == 1) return false;
        for (int i = 2; i < num; i++) {
            if (num % i == 0){
                System.out.println("num = " + num);
                System.out.println("i = " + i);
                return false;}

        }
        return true;
    }

    public static ArrayList<Integer> solution(int n, int[] arr) {
        ArrayList<Integer> answer = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int tmp = arr[i];
            int res = 0;
            while (tmp > 0) {
                res = res * 10 + tmp % 10;
                tmp = tmp / 10;
            }
            if (isPrime(res)) answer.add(res);
        }

        return answer;
    }
}
