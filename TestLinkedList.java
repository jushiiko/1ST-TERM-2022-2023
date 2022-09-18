public class TestLinkedList {
    public static void main(String[] args) {
        LNode ll = new LNode();

        System.out.println("Empty\t\t: " + ll.isEmpty());
        System.out.println("Current Size\t: " + ll.currentSize());
        
        ll.addAtFirst(7);

        System.out.println("Empty\t\t: " + ll.isEmpty());
        System.out.println("Current Size\t: " + ll.currentSize());
        // System.out.println(ll.traverse());

        ll.addAtFirst(5);
        ll.addAtFirst(3);
        System.out.println(ll.traverse());

        ll.addAtLast(12);
        ll.addAtLast(15);
        System.out.println(ll.traverse());

        System.out.println("Empty\t\t: " + ll.isEmpty());
        System.out.println("Current Size\t: " + ll.currentSize());

        ll.addAtPosition(7, 50);
        System.out.println(ll.traverse());

        /**
        System.out.println(ll.deleteAtFirst());
        System.out.println(ll.traverse());

        System.out.println(ll.deleteAtLast());
        System.out.println(ll.traverse());
        */

        ll.deleteAtPosition(5);
        System.out.println(ll.traverse());

        System.out.println("Found\t\t: " + ll.isFound(90));

    }
}//end of class
