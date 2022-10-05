package DSA.MODULE_3;

public class Node {
    public Node left, right;
    public int data;

    public Node() {
        left = right = null;
        data = 0;
    }

    public Node(int data) {
        left = right = null;
        this.data = data;
    }

    public void setLeft(Node LNode) {
        left = LNode;
    }

    public void setRight(Node RNode) {
        right = RNode;
    }

    public void setData(int data) {
        this.data = data;
    }

    public Node getLeft() {
        return left;
    }

    public Node getRight() {
        return right;
    }

    public int getData() {
        return data;
    }

}
