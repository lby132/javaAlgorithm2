package string;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.IntStream;

public class BigNum {

//    설명
//
//    N개의 정수를 입력받아, 자신의 바로 앞 수보다 큰 수만 출력하는 프로그램을 작성하세요.
//
//    (첫 번째 수는 무조건 출력한다)


    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int num = kb.nextInt();
        List<Integer> numbers = new ArrayList();
        for (int i = 0; i < num; i++) {
            numbers.add(kb.nextInt());
        }

        System.out.println(solution(numbers, num));
    }

    public static String solution(List<Integer> numbers, int num) {

        List<Integer> arr = new ArrayList();
        for (int number : numbers) {
            if (number >= num) {
                arr.add(number);
            }
        }
        String answer = "";
        for (Integer integer : arr) {
            answer += integer + " ";
        }

        return answer;
    }
}

//7 3 9 5 6 12