package Lesson;

import javax.swing.*;

public class electricBill {
    public static void main(String[] args) {
        String j;
        int r;
        double tb = 0;

        j = JOptionPane.showInputDialog("Enter the reading value: ");
        r = Integer.parseInt(j);

        if (r <= 50) {
            tb = (r * 0.50) * 0.20;
        }
        if (r >= 51 && r <= 150) {
            tb = (50 * .50) + ((r - 50) * 0.75) * 0.20;
        }
        if (r > 151 && r <= 250) {
            tb = (50 * 0.50) + (100 * 0.75) + ((r - 150) * 1.20) * 0.20;
        }
        if (r >= 251) {
            tb = (50 * 0.50) + (100 * 0.75) + (100 * 1.20) + ((r - 250) * 1.50) * 0.2;
        }
        JOptionPane.showMessageDialog(null, "Final bill: " + tb);
    }

}
