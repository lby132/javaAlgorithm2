package recursivetreegraph;

public class StackFrame {

    public static void DFS(int n) {
        if (n == 0) {
            return;
        } else {
            DFS(n - 1);
            // stack은 LIFO 방식이므로 DFS가 호출될때마다 StackFrame에 쌓이고 마지막에 쌓인게 첫번째로 반환되므로 1 2 3이 출력된다.
            System.out.print(n + " ");
        }
    }

    public static void main(String[] args) {
        DFS(3);
    }
}
