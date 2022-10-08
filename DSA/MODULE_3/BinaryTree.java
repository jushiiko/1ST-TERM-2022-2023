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
        if (node != null) {
            if (node.getLeft() != null || node.getRight() != null)
                return node.getData() + " " + traverseParents(node.getLeft()) + traverseParents(node.getRight());
            else
                return traverseParents(node.getLeft()) + traverseParents(node.getRight());
        } else
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

    public String level(Node node) {
        if (node == null)
            return "0";
        else {
            int lLevel = Integer.parseInt(level(node.getLeft()));
            int rLevel = Integer.parseInt(level(node.getRight()));

            if (lLevel < rLevel)
                return String.valueOf(lLevel + 1);
            else
                return String.valueOf(rLevel + 1);
        }
    }

    public String level() {
        return level(root);
    }

    public boolean treeType(Node node) {

        if (node == null)
            return true;

        if (node.left == null && node.right == null)
            return true;

        if ((node.left != null) && (node.right != null))
            return (treeType(node.left) && treeType(node.right));

        return false;
    }

    public String treeType() {
        return root == null ? "Empty" : treeType(root) == true ? "Full" : "Complete";
    }

    
    private int findSmallestValue(Node root) {
        return root.getLeft() == null ? root.getData() : findSmallestValue(root.getLeft());
    }
    public void clear() {
        root = null;
    }

    public boolean search(int val) {
        if (isEmpty()) {
            return false;
        } else {
            return search(root, val);
        }
    }

    private boolean search(Node node, int val) {
        if (node.getData() == val)
            return true;
        if (node.getLeft() != null)
            if (search(node.getLeft(), val))
                return true;
        if (node.getRight() != null)
            if (search(node.getRight(), val))
                return true;
        return false;
    }

    private void delete(Node node, Node delNode) {
        if (isEmpty()) {
            String hold = "Tree is empty";
        } else {
            Queue<Node> q = new LinkedList<Node>();
            q.add(root);

            Node newNode = null;

            while (!q.isEmpty()) {
                newNode = q.peek();
                q.remove();

                if (newNode == delNode) {
                    newNode = null;
                }
                if (newNode.getRight() != null) {
                    if (newNode.getRight() == delNode) {
                        newNode.setRight(null);
                    } else
                        q.add(newNode.getRight());
                }
                if (newNode.getLeft() != null) {
                    if (newNode.getLeft() == delNode) {
                        newNode.setLeft(null);
                    } else
                        q.add(newNode.getLeft());
                }
            }
        }
    }

    private void deleteGiven(Node node, int data) {
        if (node == null)
            return;

        if (node.getLeft() == null && node.getRight() == null) {
            if (node.getData() == data) {
                node = null;
                return;
            } else {
                return;
            }
        }

        Queue<Node> q = new LinkedList<Node>();
        q.add(node);
        Node newNode = null, temp = null;

        // Do level order traversal until
        // we find key and last node.
        while (!q.isEmpty()) {
            newNode = q.peek();
            q.remove();

            if (newNode.getData() == data)
                temp = newNode;

            if (newNode.getLeft() != null)
                q.add(newNode.getLeft());

            if (newNode.getRight() != null)
                q.add(newNode.getRight());
        }

        if (temp != null) {
            int x = newNode.getData();
            delete(node, newNode);
            temp.setData(x);
        }
    }

    private int getLastNode(Node node) {
        int last = 0;
        if (isEmpty()) {
            return last;
        } else {
            Queue<Node> q = new LinkedList<Node>();
            q.add(node);

            while (!q.isEmpty()) {
                Node newNode = q.poll();
                last = newNode.getData();
                if (newNode.getLeft() != null) {
                    q.add(newNode.getLeft());
                }
                if (newNode.getRight() != null) {
                    q.add(newNode.getRight());
                }
            }
        }
        return last;
    }

    public int getLastNode() {
        return getLastNode(root);
    }

    public void deleteLast() {
        deleteGiven(root, getLastNode());
    }

    
}