package DSA.MODULE_3;

import java.awt.Color;
import java.awt.event.*;
import javax.swing.*;

public class BTNodeMenu extends JFrame implements ActionListener, ItemListener, KeyListener {
    private JLabel lblChoose, lblValue;
    private JTextField txtValue;
    private JComboBox cboChoose;
    private JTextArea txtAreaUp, txtAreaDown;
    private JButton btnProcess, btnClose;
    private BinaryTree tree;

    // Tree object declaration
    String hold = "", traversal = "";

    BTNodeMenu() {
        tree = new BinaryTree(); // Instantiation of a tree

        lblChoose = new JLabel("Choose");
        String menu[] = { "Add Node", "Remove Node", "Search", "Cut the Tree", "End" };

        cboChoose = new JComboBox(menu);
        txtAreaUp = new JTextArea();
        txtAreaDown = new JTextArea();
        btnProcess = new JButton("Process");
        btnClose = new JButton("Close");
        lblValue = new JLabel("Value");
        txtValue = new JTextField();
        setTitle("Binary Tree ADT Application by John Sebastian Ablay");
        setSize(400, 300);
        getContentPane().setBackground(new Color(100, 50, 90, 80));
        setLayout(null);
        txtAreaUp.setEditable(false);
        txtAreaDown.setEditable(false);
        display();
        add(txtAreaUp).setBounds(20, 20, 330, 60);
        add(new JScrollPane(txtAreaDown)).setBounds(20, 80, 330, 100);
        add(lblChoose).setBounds(20, 200, 60, 20);
        add(cboChoose).setBounds(80, 200, 150, 20);
        add(btnProcess).setBounds(240, 200, 110, 60);
        add(lblValue).setBounds(20, 230, 100, 20);
        add(txtValue).setBounds(80, 230, 150, 20);
        setLocationRelativeTo(null);
        setVisible(true);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        btnProcess.addActionListener(this);
        cboChoose.addItemListener(this);
        txtValue.addKeyListener(this);
        btnProcess.setEnabled(false);
    }

    public static void main(String[] args) {
        new BTNodeMenu();
    }

    public void actionPerformed(ActionEvent e) {
        int i = cboChoose.getSelectedIndex();
        int value = Integer.parseInt(txtValue.getText());
        if (i == 0) {
            if (tree.search(Integer.parseInt(txtValue.getText()))) {
                JOptionPane.showMessageDialog(null, "Node already exists.");
            } else {
                tree.addNode(value);
            }
        } else if (i == 1) {
            tree.deleteLast();
        } else if (i == 2) { 
            if (tree.search(Integer.parseInt(txtValue.getText()))) {
            JOptionPane.showMessageDialog(null, "Node is found.");
            } else {
                JOptionPane.showMessageDialog(null, "Node is not found.");
            }
        } else if (i == 3) { // cut the tree
            tree.clear();
        } else if (i == 4) {
            System.exit(0);
        }
        display();
        btnProcess.setEnabled(false);
    }

    public void itemStateChanged(ItemEvent e) {
        int i = cboChoose.getSelectedIndex();
        if (i == 0) {
            disable();
        } else if (i == 1) {
            disableAll();
            
        } else if (i == 2) {
            disable();
        } else if (i == 3) {
            disableAll();
            btnProcess.setEnabled(true);
        } else if (i == 4) {
            // disableAll();
            txtValue.setText("0");
            txtValue.setEditable(false);
            btnProcess.setEnabled(true);
        }
    }

    public void enable() {
        txtValue.setEditable(true);
    }

    public void disable() {
        txtValue.setEditable(true);
        btnProcess.setEnabled(true);
    }

    public void disableAll() {
        txtValue.setEditable(false);
        btnProcess.setEnabled(true);
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
        }
    }

    public void keyTyped(KeyEvent e) {
        if (e.getSource().equals(txtValue)) {
            if (!(Character.isDigit(e.getKeyChar()))) {
                e.consume();
            }
        }
    }

    /**
     * public void keyTyped(KeyEvent e) {
     * if (e.getSource().equals(txtPosition)) {
     * if (!(Character.isDigit(e.getKeyChar()))) {
     * e.consume();
     * }
     * } else if (e.getSource().equals(txtValue)) {
     * if (e.getKeyChar() == ' ' || e.getKeyChar() == '0' || e.getKeyChar() == '-')
     * {
     * JOptionPane.showMessageDialog(null, "Integers are only allowed.");
     * } else if (!(Character.isDigit(e.getKeyChar()))) {
     * e.consume();
     * }
     * }
     * }
     */

    void display() {
        // calling methods from a Binary Tree ADT
        traversal = "Level Order\t: " + tree.printLevelOrder()
                + "\nInorder\t: " + tree.printInOrder()
                + "\nPreorder\t: " + tree.traversePreOrder()
                + "\nPostorder\t: " + tree.traversePostOrder()
                + "\nInternal Nodes\t: " + tree.traverseParents()
                + "\nLeaves\t: " + tree.printLeaves();
        txtAreaDown.setText(traversal);
        hold = "Empty\t: " + tree.isEmpty() + "\tCurrent Nodes\t: " + tree.count()
                + "\nDepth\t: " + tree.depth() + "\tHeight\t: " + tree.height()
                + "\nLevel\t: " + tree.level() + "\tType\t: " + tree.treeType();

        txtAreaUp.setText(hold);
    }

}