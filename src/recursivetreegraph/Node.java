package recursivetreegraph;

public class Node {
    int data;
    recursivetreegraph.Node lt, rt;

    public Node(int val) {
        data = val;
        lt = rt = null;
    }
}
