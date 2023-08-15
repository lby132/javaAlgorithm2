package recursivetreegraph;

public class BinaryOutput {

    public static void DFS(int n) {
        if (n == 0) {
        } else {
            DFS(n/2);
            System.out.print(n % 2 + "");
        }
    }

    public static void main(String[] args) {
        DFS(11);
    }
}
