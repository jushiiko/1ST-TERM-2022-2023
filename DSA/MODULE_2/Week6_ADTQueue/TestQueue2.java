package DSA.MODULE_2.Week6_ADTQueue;


import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class TestQueue2 {
    public static void main(String[] args) {
        System.out.println("John Sebastian Ablay");
        String menu[] = { "Enqueue", "Dequeue", "Exit" };
        String option = "", all = "";
        Queue st = new Queue();
        int data = 0;
        do {
            all =   "\nEmpty\t: " + st.isEmpty() +"\tFull\t: " + st.isFull() + 
                    "\nCapacity\t: " + st.getCapacity() +"\tCurrentSize\t: " + st.getCurrentSize() +
                    "\nPeek\t: " + st.peek() + "\tLast\t: " + st.last() +
                    "\nElements: " + st.display();
            option = JOptionPane.showInputDialog(null, new JTextArea(all + "\nSelect"), "Menu", 1, null, menu, menu[0])
                    .toString();
            switch (option) {
                case "Enqueue":
                    if (!st.isFull()) {
                        try {
                            data = Integer.parseInt(JOptionPane.showInputDialog("Enqueue: "));
                        } catch (NumberFormatException e) {
                            JOptionPane.showMessageDialog(null, "That is not a valid input.");
                            break;
                        }
                        st.enqueue(data);
                        JOptionPane.showMessageDialog(null,
                                data + " is inserted succesfully to the queue.");
                    } else {
                        JOptionPane.showMessageDialog(null, "Queue is full.");
                    }
                    break;
                case "Dequeue":
                    if (!st.isEmpty()) {
                        JOptionPane.showMessageDialog(null,
                                st.dequeue() + " is removed succesfully from the queue.");
                    } else {
                        JOptionPane.showMessageDialog(null, "Queue is empty.");
                    }
                    break;                    
            }
        } while (!option.equals("Exit"));
    }
}