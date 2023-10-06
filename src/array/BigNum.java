package array;

import java.util.ArrayList;
import java.util.Scanner;

public class BigNum {

//    설명
//
//    N개의 정수를 입력받아, 자신의 바로 앞 수보다 큰 수만 출력하는 프로그램을 작성하세요.
//
//    (첫 번째 수는 무조건 출력한다)

    public static ArrayList<Integer> solution(int n, int[] arr) {
        ArrayList<Integer> answer = new ArrayList<>();
        answer.add(arr[0]);
        for (int i = 1; i < n; i++) {
            if (arr[i] > arr[i - 1]) answer.add(arr[i]);
        }
        System.out.println("answer = " + answer);
        return answer;
    }


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

//    public static void main(String[] args) {
//        Scanner kb = new Scanner(System.in);
//        int num = kb.nextInt();
//        List<Integer> numbers = new ArrayList();
//        for (int i = 0; i < num; i++) {
//            numbers.add(kb.nextInt());
//        }
//
//        System.out.println(solution(numbers, num));
//    }
//
//    public static String solution(List<Integer> numbers, int num) {
//
//        List<Integer> arr = new ArrayList();
//        for (int number : numbers) {
//            if (number >= num) {
//                arr.add(number);
//            }
//        }
//        String answer = "";
//        for (Integer integer : arr) {
//            answer += integer + " ";
//        }
//
//        return answer;
//    }
}

//7 3 9 5 6 12