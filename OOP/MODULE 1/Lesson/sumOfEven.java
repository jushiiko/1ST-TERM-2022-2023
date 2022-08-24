package Lesson;

import javax.swing.*;

public class sumOfEven {
    public static void main(String[] args) {
        String j;
        int x, y, sum = 0;

        j = JOptionPane.showInputDialog("Enter the first lower limit: ");
        x = Integer.parseInt(j);
        j = JOptionPane.showInputDialog("Enter the upper limit: ");
        y = Integer.parseInt(j);

        if (x <= y) {
            for (int c = x; c <= y; c++) {
                if (c % 2 == 0)
                    sum += c; // sum = sum + c;
            }
            JOptionPane.showMessageDialog(null, "The sum is: " + sum);

        } else {
            JOptionPane.showMessageDialog(null, "First input must be lower.");
        }

    }
}