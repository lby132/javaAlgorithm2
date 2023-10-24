package ex2;

import java.util.ArrayList;
import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int i = sc.nextInt();
        int[] arr = new int[i];
        for (int j = 0; j < i; j++) {
            arr[j] = sc.nextInt();
        }


        for (int x : solution(i, arr)) {
            System.out.print(x + " ");
        }
    }

    public static boolean isPrime(int n) {
        if (n == 1) return false;
        for (int i = 2; i < n; i++) {
            if (n % i == 0) return false;
        }

        return true;
    }

    public static ArrayList<Integer> solution(int n, int[] arr) {

        ArrayList<Integer> answer = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int reverse = 0;
            while (arr[i] != 0) {
                int dig = arr[i] % 10;
                reverse = reverse * 10 + dig;
                arr[i] /= 10;
            }

            if (isPrime(reverse)) {
                answer.add(reverse);
            }
        }

        return answer;
    }

}
