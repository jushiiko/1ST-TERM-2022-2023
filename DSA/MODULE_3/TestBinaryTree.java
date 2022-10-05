package DSA.MODULE_3;

public class TestBinaryTree {
    public static void main(String args[]) {
        System.out.println("Test run by : John Sebastian Ablay");
        BinaryTree tree = new BinaryTree();
        Node root = new Node();
        root = tree.getRoot();
        System.out.println("---Before Adding Nodes---");
        System.out.println("Empty\t\t: " + tree.isEmpty());
        System.out.println("Number of Nodes\t: " + tree.count());
        System.out.println("Level Order\t: " + tree.printLevelOrder());
        System.out.println("Traverse Order\t: " + tree.traverseInOrder(root));

        // adding Node to a tree
        tree.addNode(12);
        tree.addNode(40);
        tree.addNode(50);
        System.out.println("---After Adding 3 Nodes---");
        System.out.println("Empty\t\t: " + tree.isEmpty());
        System.out.println("Number of Nodes\t: " + tree.count());
        System.out.println("Level Order\t: " + tree.printLevelOrder());
        System.out.println("Traverse Order\t: " + tree.traverseInOrder(root));
        // adding Node to a tree
        tree.addNode(25);
        tree.addNode(30);
        tree.addNode(10);
        System.out.println("---After Adding a few more Nodes---");
        System.out.println("Empty\t\t: " + tree.isEmpty());
        System.out.println("Number of Nodes\t: " + tree.count());
        System.out.println("Level Order\t: " + tree.printLevelOrder());
        System.out.println("Traverse Order\t: " + tree.traverseInOrder(root));
    } // end of main
} // end of class
