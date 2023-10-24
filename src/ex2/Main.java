package ex2;

import java.util.*;

public class Main {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int i = sc.nextInt();
        int[][] arr = new int[i][i];
        for (int j = 0; j < i; j++) {
            for (int k = 0; k < i; k++) {
                arr[j][k] = sc.nextInt();
            }
        }

//        System.out.println(solution(i, arr));
        solution(i, arr);
    }

    private static int solution(int n, int[][] arr) {

        int answer = Integer.MIN_VALUE;
        for (int i = 1; i < n; i++) {
            for (int j = 1; j < n; j++) {
                if (arr[i][j] > arr[j][i - 1] && arr[i][j] > arr[j - 1][i]) {
                    System.out.print(arr[i][j] + " ");
                }
            }
            System.out.println();
        }

        return answer;
    }
}


