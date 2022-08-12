// a java application that accepts two inputs using GUI
import javax.swing.*;
public class SampleInOut2 {
    public static void main(String[] args) {
        String j;
        int x1, x2;
        int sum = 0;
        j = JOptionPane.showInputDialog("Enter the first number: ");
        x1 = Integer.parseInt(j);
        j = JOptionPane.showInputDialog("Enter the second number: ");
        x2 = Integer.parseInt(j);
        sum = x1 + x2;
        JOptionPane.showMessageDialog(null, "The sum is " + sum);
    }
}
