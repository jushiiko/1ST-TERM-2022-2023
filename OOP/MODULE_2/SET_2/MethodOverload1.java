package MODULE_2.SET_2;

import javax.swing.JOptionPane;

public class MethodOverload1 {
    public static void main(String[] args) {
        int choice = Integer.parseInt(JOptionPane.showInputDialog(null,
                "Choose:\n1 to add both int values\n2 to add double values\n3 to add mixed values"));

        if (choice == 1) {
            int num1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter the first int number: "));
            int num2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter the second int number: "));
            JOptionPane.showMessageDialog(null,
                    "The total sum of " + num1 + " and " + num2 + " is: " + Addition(num1, num2));
        }
        else if (choice == 2) {
            double num1 = Double.parseDouble(JOptionPane.showInputDialog(null, "Enter the first double number: "));
            double num2 = Double.parseDouble(JOptionPane.showInputDialog(null, "Enter the second double number: "));
            JOptionPane.showMessageDialog(null,
                    "The total sum of " + num1 + " and " + num2 + " is: " + Addition(num1, num2));
        }
        else if (choice == 3) {
            int num1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter the first int number: "));
            double num2 = Double.parseDouble(JOptionPane.showInputDialog(null, "Enter the second double number: "));
            JOptionPane.showMessageDialog(null,
                    "The total sum of " + num1 + " and " + num2 + " is: " + Addition(num1, num2));
        }
        else {
           System.out.println("Invalid Input.");
        }

    }

    public static double Addition(int a, double b) {
        return a + b;

    }

    public static int Addition(int a, int b) {
        return a + b;
    }

    public static double Addition(double a, double b) {
        return a + b;
    }

}
