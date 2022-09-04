package DSA.MODULE_2.Week5_ADTStack;

import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class TestStack {
    public static void main(String[] args) {
        String menu[] = { "Push", "Pop", "Set Capacity", "Search", "Clear", "Exit" };
        String option = "", all = "";
        Stack st = new Stack(2);
        int data = 0;
        do {
            all = "\nElements\t: " + st.display() +
                    "\nCapacity\t: " + st.getCapacity() + "\nCount\t: " + st.size() +
                    "\tEmpty : " + st.isEmpty() + "\tFull : " + st.isFull() +
                    "\nFirst\t: " + st.first() + "\tLast : " + st.last() +
                    "\nTop\t: " + st.top() + "\tPeek : " + st.peek();
            option = JOptionPane.showInputDialog(null, new JTextArea(all + "\nSelect"), "Menu", 1, null, menu, menu[0])
                    .toString();
            switch (option) {
                case "Push":
                    if (!st.isFull()) {
                        data = Integer.parseInt(
                                JOptionPane.showInputDialog("Push: "));
                        st.push(data);
                        JOptionPane.showMessageDialog(null,
                                data + " is inserted succesfully to the stack.");
                    } else {
                        JOptionPane.showMessageDialog(null, "Stack is full.");
                    }
                    break;
                case "Pop":
                    if (!st.isEmpty()) {
                        JOptionPane.showMessageDialog(null,
                                st.pop() + " is removed succesfully from the stack.");
                    } else {
                        JOptionPane.showMessageDialog(null, "Stack is empty.");
                    }
                    break;
                case "Set Capacity":
                    int capacity = Integer.parseInt(
                            JOptionPane.showInputDialog("Set Capacity: "));
                    st.setCapacity(capacity);
                    break;
                case "Search":
                    if (st.isEmpty()) {
                        JOptionPane.showMessageDialog(null, "Stack is empty.");
                    } else {
                        data = Integer.parseInt(
                                JOptionPane.showInputDialog("Search: "));
                        st.search(data);
                    }
                    break;
                case "Clear":
                    JOptionPane.showMessageDialog(null, st.clear());
                    break;
            }
        } while (!option.equals("Exit"));
    }
}