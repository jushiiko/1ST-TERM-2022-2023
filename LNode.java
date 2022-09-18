public class LNode {
    private int data;
    private LNode head, next;

    public LNode() {
        head = next = null;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void addAtFirst(int data) {
        LNode newNode = new LNode();
        if (isEmpty()) {
            newNode.data = data;
            newNode.next = null;
            head = newNode;
        } else {
            newNode.data = data;
            newNode.next = head;
            head = newNode;
        }
    }

    public String traverse() {
        String hold = " ";
        LNode link = head;
        if (isEmpty()) {
            hold = "List is Empty.";
        } else {
            while (link != null) {
                // hold += "|" + link.data + "|" + link.next + "|\n";
                hold += link.data + "->";
                link = link.next;
            }
        }
        return "head-> " + hold + " " + link;
    }

    public void addAtLast(int data) {
        if (isEmpty()) {
            addAtFirst(data);
        } else {
            LNode visit = head;
            while (visit.next != null) {
                visit = visit.next;
            }
            LNode newNode = new LNode();
            newNode.data = data;
            newNode.next = null;
            visit.next = newNode;
        }
    }

    public void addAtPosition(int position, int data) {
        if (isEmpty()) {
            addAtFirst(data);
        } else if (position == 0) {
            addAtFirst(data);
        } else if (position < 0 || position > currentSize()) {
            System.out.println("Position is NOT valid.");
        } else {
            LNode visit, link;
            visit = link = head;
            int ctr = 0;
            while (ctr != position) {
                visit = visit.next;
                ctr++;
            }

            while (link.next != visit) {
                link = link.next;
            }

            LNode newNode = new LNode();
            newNode.data = data;
            newNode.next = visit;
            link.next = newNode;
        }
    }

    public int currentSize() {
        int counter = 1;
        if (isEmpty()) {
            counter = -1;
        } else {
            LNode visit = head;
            while (visit.next != null) {
                visit = visit.next;
                counter++;
            }
        }
        return counter;
    }

    public String deleteAtFirst() {
        if (isEmpty()) {
            return ("List is empty.");
        } else {
            LNode link = head;
            head = link.next;
            return ("First node was deleted successfully.");
        }
    }

    public String deleteAtLast() {
        if (isEmpty()) {
            return ("List is empty.");
        } else {
            LNode link, visit;
            link = visit = head;

            while (visit.next != null) {
                visit = visit.next;
            }

            while (link.next != visit) {
                link = link.next;
            }

            link.next = null;
            return ("Last node was deleted successfully.");
        }
    }

    public void deleteAtPosition(int position) {
        if (isEmpty()) {
            System.out.println("List is empty.");
        } else if (position == 0) {
            deleteAtFirst();
        } else if (position < 0 || position >= currentSize()) {
            System.out.println(position + " is NOT valid.");
        } else {
            LNode visit, link, pointer;
            visit = link = pointer = head;

            int ctr = 0;

            while (ctr != position) {
                visit = visit.next;
                ctr++;
            }

            while (link.next != visit) {
                link = link.next;
            }

            ctr = 0;
            while (ctr != position + 1) {
                pointer = pointer.next;
                ctr++;
            }

            link.next = pointer;
        }
    }

    public boolean isFound(int data) {
        boolean found = false;
        if (isEmpty()) {
            System.out.println("List is empty.");
        } else {
            LNode link = head;

            while (link != null) {
                if (link.data == data) {
                    found = true;
                    break;
                } else {
                    link = link.next;
                }
            }
        }
        return found;
    }

}// end of class
