package recursivetreegraph;

public class DepthFirstSearch {

    Node root;
    public void DFS(Node root) {
        if (root == null) {
        } else {
          //  System.out.print(root.data + " "); // 전위순위 출력
            DFS(root.lt);
          //  System.out.print(root.data + " "); // 중위순위 출력
            DFS(root.rt);
            System.out.print(root.data + " "); // 후위순위 출력
        }
    }

    public static void main(String[] args) {
        DepthFirstSearch tree = new DepthFirstSearch();
        tree.root = new Node(1);
        tree.root.lt = new Node(2);
        tree.root.rt = new Node(3);
        tree.root.lt.rt = new Node(4);
        tree.root.lt.rt = new Node(5);
        tree.root.rt.lt = new Node(6);
        tree.root.rt.lt = new Node(7);
        tree.DFS(tree.root);
    }
}
