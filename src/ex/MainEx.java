package ex;

import com.sun.source.tree.Tree;

import java.util.*;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class MainEx {

    public static void main(String[] args) {
        final Scanner sc = new Scanner(System.in);

        final int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        final int n1 = sc.nextInt();
        int[] arr1 = new int[n1];
        for (int i = 0; i < n1; i++) {
            arr1[i] = sc.nextInt();
        }

        System.out.println(solution(n, arr, n1, arr1));

    }

    public static ArrayList<Integer> solution(int n, int[] arr, int m, int[] arr1) {
        final ArrayList<Integer> answer = new ArrayList<>();

        int p1 = 0, p2 = 0;

        while (p1 < n && p2 < m) {
            if (arr[p1] < arr1[p2]){
                answer.add(arr[p1++]);
            } else {
                answer.add(arr1[p2++]);
            }
        }

        while (p1 < n) answer.add(arr[p1++]);
        while (p2 < m) answer.add(arr1[p2++]);

        return answer;
    }
}
//8
//130 135 148 140 145 150 150 153