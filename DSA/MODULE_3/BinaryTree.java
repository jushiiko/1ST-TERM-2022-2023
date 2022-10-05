package DSA.MODULE_3;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryTree {

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

    private Node root;

    public BinaryTree() {
        root = null;
    }

    public boolean isEmpty() {
        return root == null;
    }

    public Node getRoot() {
        return root;
    }

    public void addNode(int data) {
        root = add(root, data);
    }

    public Node add(Node node, int data) {
        if (isEmpty()) {
            root = new Node(data);
        } else {
            Queue<Node> q = new LinkedList<Node>();
            q.add(node);

            while (!q.isEmpty()) {
                node = q.peek();
                q.remove();
                if (node.getLeft() == null) {
                    node.setLeft(new Node(data));
                    break;
                } else
                    q.add(node.getLeft());

                if (node.getRight() == null) {
                    node.setRight(new Node(data));
                    break;
                } else
                    q.add(node.getRight());
            } // end of loop
        }
        return root; // end of else

    }// end of add method

    /** Sets the Left Node of a tree */
    private String printLevelOrder(Node node) {
        String hold = "";
        if (isEmpty())
            hold = "Tree is empty";
        else {
            Queue<Node> q = new LinkedList<Node>();
            q.add(node);
            while (!q.isEmpty()) {
                Node newNode = q.poll();
                // poll() means remove the present Node
                hold += newNode.data + " ";
                if (newNode.left != null)
                    q.add(newNode.left);
                if (newNode.right != null)
                    q.add(newNode.right);
            } // end of while loop
        } // end of else
        return hold;
    }

    public String printLevelOrder() {
        return printLevelOrder(root);
    }

    // end of if

    public int count() {
        return count(root);
    }

    private int count(Node node) {
        if (node == null)
            return 0;
        else {
            int ctr = 1;
            ctr += count(node.getLeft());
            ctr += count(node.getRight());
            return ctr;
        }
        // end of if
    }

    public String traverseInOrder(Node node) {
        if (node != null)
            return traverseInOrder(node.getLeft()) + node.getData() + " " + traverseInOrder(node.getRight());
        else
            return "";
    }

    public String traversePreOrder(Node node) {
        if (node != null)
            return node.getData() + " " + traverseInOrder(node.getLeft()) + traverseInOrder(node.getRight());
        else
            return "";
    }

    public String traversePostOrder(Node node) {
        if (node != null)
            return traverseInOrder(node.getLeft()) + traverseInOrder(node.getRight()) + node.getData() + " ";
        else
            return "";
    }
}
// end of outer class
