package DSA.MODULE_2.Week7_LinkedList;

import javax.swing.JOptionPane;

public class LNode<Object> { //John Ablay - A221
    private Object data;
    private LNode next;
    private LNode head;

    public void error_message(String msg) {
        JOptionPane.showMessageDialog(null, msg, "Error", JOptionPane.ERROR_MESSAGE);
    }

    public LNode() {
        next = head = null;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void addAtFirst(Object value) {
        LNode newNode = new LNode();

        if (isEmpty()) {
            newNode.data = value;
            newNode.next = null;
            head = newNode;

        } else {
            newNode.data = value;
            newNode.next = head;

            head = newNode;
        }
    }

    public void addAtLast(Object value) {
        if (isEmpty()) {
            addAtFirst(value);
        } else {

            LNode link = head;
            while (link.next != null) {
                link = link.next;
            }

            LNode newNode = new LNode();
            newNode.data = value;
            newNode.next = null;
            link.next = newNode;
        }
    }

    public void addAtPosition(Object value, int position) {
        if (isEmpty()) {
            error_message("List is EMPTY. Node is added at the beginning.");
            addAtFirst(value);
        } else if (position == 0) {
            JOptionPane.showMessageDialog(null, "Node is added at the beginning");
            addAtFirst(value);
        } else if (position < 0 || position > currentSize() + 1) {
            error_message(position + " is NOT valid");
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
            newNode.data = value;
            newNode.next = visit;
            link.next = newNode;
        }
    }

    public void addInMiddle(Object value) {
        int position = 0;

        if (currentSize() % 2 == 0) {
            position = (currentSize() / 2) + 1;
        } else if (currentSize() % 2 == 1) {
            position = (currentSize() / 2) + 2;
        }

        if (isEmpty()) {
            error_message("List is EMPTY. Node is added at the beginning.");
            addAtFirst(value);
        } else if (position == 0) {
            JOptionPane.showMessageDialog(null, "Node is added at the beginning");
            addAtFirst(value);
        } else if (position < 0 || position > currentSize() + 1) {
            error_message(position + " is NOT valid");
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
            newNode.data = value;
            newNode.next = visit;
            link.next = newNode;
        }
    }

    public void deleteAtFirst() {
        if (isEmpty()) {
            error_message("Deleting Not Allowed. Linked list is empty.");
        } else {
            LNode link = head;
            head = link.next;
            System.out.println("Deleting is Successful !");
        }
    }

    public void deleteAtLast() {
        if (isEmpty()) {
            error_message("Deleting Not Allowed. Linked list is empty");
        } else {
            LNode visit, link;
            visit = link = head;
            while (visit.next != null) {
                visit = visit.next;
            }
            while (link.next != visit) {
                link = link.next;
            }
            link.next = null;
            System.out.println("Deleting Successful !");
        }
    }

    public void deleteAtPosition(int position) {
        if (isEmpty()) {
            error_message("The list is empty. Try to add a value");
        } else if (position == 0) {
            deleteAtFirst();
        } else if (position < 0 || position > currentSize()) {
            error_message("Position is NOT valid");
        } else if (position == currentSize()) {
            deleteAtLast();
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

    public void deleteInMiddle() {
        int position = 0;

        if (currentSize() % 2 == 0) {
            position = (currentSize() / 2);
        } else if (currentSize() % 2 == 1) {
            position = (currentSize() / 2) + 1;
        }

        if (isEmpty()) {
            error_message("The list is empty. Try to add a value");
        } else if (position == 0) {
            deleteAtFirst();
        } else if (position < 0 || position > currentSize()) {
            error_message("Position is NOT valid");
        } else if (position == currentSize()) {
            deleteAtLast();
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

    public void deleteValue(Object value) {
        deleteAtPosition(indexAt(value));
    }

    public String traverse() {
        if (isEmpty()) {
            return "List is empty";
        } else {
            String hold = "";
            LNode link = head;

            while (link != null) {
                hold += " | " + link.data + " | " + link.next + " | \n";
                link = link.next;
            }
            return "head Node | " + head + "\n" + hold;
        }
    }

    public int currentSize() {
        int counter = 0;
        if (isEmpty()) {
            error_message("List is empty");
        } else {
            LNode link = head;
            while (link.next != null) {
                link = link.next;
                counter++;
            }
        }
        return counter;
    }

    public boolean isFound(Object data) {
        boolean found = false;
        if (isEmpty()) {
            System.out.println("List is empty");
        } else {
            LNode link = head;
            while (link != null) {
                if (link.data.equals(data)) {
                    found = true;
                    break;
                } else {
                    link = link.next;
                }
            }
        }
        return found;
    }

    public Object getFirst() {
        if (isEmpty()) {
            System.err.println("Stack is empty");
            return null;
        } else {
            return (Object) ("Found: " + head.data);
        }
    }

    public Object getLast() {
        if (isEmpty()) {
            error_message("The list is empty");
        }
        LNode temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        return (Object) ("Found: " + temp.data);

    }

    public Object getAtPosition(int position) {
        if (isEmpty()) {
            error_message("The list is empty");
        } else if (position < 0 || position > currentSize()) {
            error_message("Position is NOT valid");
        } else {
            LNode temp = head;
            int ctr = 0;
            while (ctr != position) {
                temp = temp.next;
                ctr++;
            }
            return (Object) ("Found: " + temp.data);
        }
        return null;
    }

    public Object getInMiddle(int position) {
        if (isEmpty()) {
            error_message("The list is empty");
        } else if (position < 0 || position >= currentSize()) {
            error_message("Position is NOT valid");
        } else {
            LNode temp = head;
            int ctr = 0;
            while (ctr != position - 1) {
                temp = temp.next;
                ctr++;
            }
            return (Object) temp.data;
        }
        return null;
    }

    public int indexAt(Object value) {
        int ctr = 0;
        if (isEmpty()) {
            error_message("List is empty.");
            return -1;
        } else {
            LNode link = head;

            while (link != null) {
                if (link.data.equals(value)) {
                    return ctr;
                } else {
                    System.out.println("count");
                    link = link.next;
                    ctr++;
                }
            }

            return -1;
        }
    }

}
