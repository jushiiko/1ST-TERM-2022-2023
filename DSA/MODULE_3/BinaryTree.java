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
            return node.getData() + " " + traversePreOrder(node.getLeft()) + traversePreOrder(node.getRight());
        else
            return "";
    }



    public String traversePostOrder(Node node) {
        if (node != null)
            return traversePostOrder(node.getLeft()) + traversePostOrder(node.getRight()) + node.getData() + " ";
        else
            return ""; 
    }

    public String traverseInOrder() {
        return traverseInOrder(root);
    }

    public String traversePostOrder() {
        return traversePostOrder(root);
    }

    public String traversePreOrder() {
        return traversePreOrder(root);
    }

    public String printInOrder() {
        return traverseInOrder(root);
    }

    public String traverseParents(Node node) {
        if (node != null)
            return node.getData() + " " + traverseParents(node.getLeft()) + traverseParents(node.getRight());
        else
            return "";
    }

    public String traverseParents() {
        return traverseParents(root);
    }

    public String printLeaves(Node node) {
        if (node != null) {
            if (node.getLeft() == null && node.getRight() == null)
                return node.getData() + " ";
            else
                return printLeaves(node.getLeft()) + printLeaves(node.getRight());
        } else
            return "";
    }

    public String printLeaves() {
        return printLeaves(root);
    }

    public String depth(Node node) {
        if (node == null)
            return "0";
        else {
            int lDepth = Integer.parseInt(depth(node.getLeft()));
            int rDepth = Integer.parseInt(depth(node.getRight()));

            if (lDepth < rDepth)
                return String.valueOf(lDepth + 1);
            else
                return String.valueOf(rDepth + 1);
        }
    }

    public String depth() {
        return depth(root);
    }

    public String height(Node node) {
        if (node == null)
            return "0";
        else {
            int lHeight = Integer.parseInt(height(node.getLeft()));
            int rHeight = Integer.parseInt(height(node.getRight()));

            if (lHeight < rHeight)
                return String.valueOf(lHeight + 1);
            else
                return String.valueOf(rHeight + 1);
        }
    }

    public String height() {
        return height(root);
    }

    public String level(Node node, int level) {
        if (node == null)
            return "";
        if (level == 1)
            return node.getData() + " ";
        else if (level > 1) {
            String str = "";
            str += level(node.getLeft(), level - 1);
            str += level(node.getRight(), level - 1);
            return str;
        }
        return "";
    }

    public String level() {
        return level(root, 1);
    }

    public String treeType(Node node) {
        if (node == null)
            return "Empty Tree";
        else if (node.getLeft() == null && node.getRight() == null)
            return "Leaf Node";
        else if (node.getLeft() == null || node.getRight() == null)
            return "Half Node";
        else
            return "Full Node";
    }

    public String treeType() {
        return treeType(root);
    }
}
// end of outer class
