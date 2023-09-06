package ex;

import java.util.Arrays;

public class SelectionSort {

    public static int[] selection_sort(int[] a) {
        int[] swap = new int[0];
        for (int i = 0; i < a.length - 1; i++) {
            int min_index = i;
            // 최솟값을 갖고있는 인덱스 찾기
            for (int j = i + 1; j < a.length; j++) {
                if (a[j] < a[min_index]) {
                    min_index = j;
                }
            }

            // i번째 값과 찾은 최솟값을 서로 교환
            swap = swap(a, min_index, i);
        }

        return swap;
    }

    public static void main(String[] args) {
        int[] a = {4, 1, 2, 6, 3, 5};
        System.out.println(Arrays.toString(selection_sort(a)));
    }

    private static int[] swap(int[] a, int min_index, int i) {
        int tmp = a[min_index];
        a[min_index] = a[i];
        a[i] = tmp;
        return a;
    }
}
