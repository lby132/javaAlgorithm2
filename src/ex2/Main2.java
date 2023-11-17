package ex2;

import java.util.*;

public class Main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int i = sc.nextInt();
        int[] arr1 = new int[i];
        for (int j = 0; j < i; j++) {
            arr1[j] = sc.nextInt();
        }
        int m = sc.nextInt();
        int[] b = new int[m];
        for (int j = 0; j < m; j++) {
            b[j] = sc.nextInt();
        }

        for (int x : solution(i, m, arr1, b)) {
            System.out.print(x + " ");
        }
    }


    public static ArrayList<Integer> solution(int n, int m, int[] arr, int[] b) {
        ArrayList<Integer> answer = new ArrayList<>();

        int p1 = 0, p2 = 0;
        while (p1 < n && p2 < m) {
            if (arr[p1] < b[p2]) answer.add(arr[p1++]);
            else answer.add(b[p2++]);
        }
        while (p1<n) answer.add(arr[p1++]);
        while (p2<m) answer.add(b[p2++]);

        return answer;
    }
}

