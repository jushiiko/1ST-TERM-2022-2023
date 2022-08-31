package MODULE_2.SET_1;

import javax.swing.JOptionPane;

public class SimpleCalculator {
    public static void main(String[] args) {
        int a, b;
        a = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter the first number"));
        b = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter the second number"));
        JOptionPane.showMessageDialog(null, "First number: " + a + "\nSecond number: " + b +
                "\nAddition: " + Addition(a, b) + "\nMultiplication: " + Multiplication(a, b) +
                "\nAverage: " + Average(a, b) + "\nSquared: " + Squared(a) + " &" + Squared(b));

    }

    public static int Addition(int x, int y) {
        int total = x + y;
        return total;
    }

    public static int Multiplication(int x, int y) {
        int total = x * y;
        return total;
    }

    public static int Average(int x, int y) {
        int total = (x + y) / 2;
        return total;
    }

    public static int Squared(int x) {
        int total = x * x;
        return total;
    }

}
