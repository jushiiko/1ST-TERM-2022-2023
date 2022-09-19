package DSA.MODULE_2.Week7_LinkedList;

import java.awt.Color;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.JOptionPane;

public class LNodeMenu extends JFrame implements ActionListener, ItemListener, KeyListener {
    private JLabel lblChoose, lblValue, lblPosition;
    private JTextField txtValue, txtPosition;
    private JComboBox cboChoose;
    private JTextArea txtAreaUp, txtAreaDown;
    private JButton btnProcess, btnClose;
    private LNode myNode;
    String hold = "";

    LNodeMenu() {
        myNode = new LNode();

        lblChoose = new JLabel("Choose");
        String menu[] = { "Add At First", "Add At Position", "Add At Last",
                "Delete At First", "Delete At Position", "Delete At Last",
                "Get First", "Get At Position", "Get Last", "Search" };
        cboChoose = new JComboBox(menu);
        txtAreaUp = new JTextArea();

        txtAreaDown = new JTextArea();
        btnProcess = new JButton("Process");
        btnClose = new JButton("Close");

        lblValue = new JLabel("Value");
        lblPosition = new JLabel("Position");
        txtValue = new JTextField();
        txtPosition = new JTextField();
        txtPosition.setEditable(false);

        setTitle("LinkedList Application");
        setSize(400, 300);
        getContentPane().setBackground(new Color(100, 50, 90, 80));

        setLayout(null);
        txtAreaUp.setEditable(false);
        txtAreaDown.setEditable(false);

        hold = "Empty\t: " + myNode.isEmpty() + "\tCurrent Size\t: " + myNode.currentSize();

        txtAreaUp.setText(hold);

        add(txtAreaUp).setBounds(20, 20, 330, 20);
        add(new JScrollPane(txtAreaDown)).setBounds(20, 40, 330, 100);

        add(lblChoose).setBounds(20, 140, 60, 20);
        add(cboChoose).setBounds(80, 140, 150, 20);
        add(btnProcess).setBounds(240, 140, 110, 60);

        add(lblValue).setBounds(20, 160, 100, 20);
        add(lblPosition).setBounds(20, 180, 100, 20);

        add(txtValue).setBounds(80, 160, 150, 20);
        add(txtPosition).setBounds(80, 180, 150, 20);

        setLocationRelativeTo(null);
        setVisible(true);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);

        btnProcess.addActionListener(this);
        cboChoose.addItemListener(this);
        txtPosition.addKeyListener(this);
        txtValue.addKeyListener(this);
        btnProcess.setEnabled(false);
    }

    public static void main(String[] args) {
        new LNodeMenu();
    }

    public void actionPerformed(ActionEvent e) {
        // Your code to perform each operation of the List (Menu)
    }

    public void itemStateChanged(ItemEvent e) {
        int i = cboChoose.getSelectedIndex();
        if (i == 0) {
            disable();
        } else if (i == 1) {
            enable();
        } else if (i == 2) {
            disable();
        } else if (i == 3) {
            disableAll();
            btnProcess.setEnabled(true);
        } else if (i == 4) {
            disableAll();
            btnProcess.setEnabled(true);
            txtPosition.setEditable(true);
        } else if (i == 5) {
            disableAll();
            btnProcess.setEnabled(true);
        } else if (i == 6) {
            btnProcess.setEnabled(true);
            disableAll();
        } else if (i == 7) {
            enable();
            btnProcess.setEnabled(true);
            txtValue.setEditable(false);
        } else if (i == 8) {
            disableAll();
            btnProcess.setEnabled(true);
        } else if (i == 9) {
            disable();
            btnProcess.setEnabled(true);
        }
    }

    public void enable() {
        txtValue.setEditable(true);
        txtPosition.setEditable(true);
    }

    public void disable() {
        txtValue.setEditable(true);
        txtPosition.setEditable(false);
    }

    public void disableAll() {
        txtValue.setEditable(false);
        txtPosition.setEditable(false);
    }

    public void keyPressed(KeyEvent arg0) {
    }

    public void keyReleased(KeyEvent e) {
        if (e.getSource().equals(txtValue)) {
            if (txtValue.getText().isEmpty()) {
                btnProcess.setEnabled(false);
            } else {
                btnProcess.setEnabled(true);
            }
        } else if (e.getSource().equals(txtPosition)) {
            if (txtPosition.getText().isEmpty()) {
                btnProcess.setEnabled(false);
            } else {
                btnProcess.setEnabled(true);
            }
        }
    }

    public void keyTyped(KeyEvent e) {
        if (e.getSource().equals(txtPosition)) {
            if (!(Character.isDigit(e.getKeyChar()))) {
                e.consume();
            }
        } else if (e.getSource().equals(txtValue)) {
            if (!(Character.isAlphabetic(e.getKeyChar()))) {
                e.consume();
            }
        }
    }

}
// end of class
