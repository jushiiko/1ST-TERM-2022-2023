package MODULE_2.SET_2;

import javax.swing.JOptionPane;

public class OverloadSquared {
    public static void main(String[] args) {
        int choice = Integer.parseInt(JOptionPane.showInputDialog(
            "Choose:\n 1 for int value\n2 for double value"));
        if (choice == 1) {
            int num1 = Integer.parseInt(JOptionPane.showInputDialog(null, 
            "Enter the int value: "));
            JOptionPane.showMessageDialog(null, 
            "The square of " + num1 + " is: " + Squared(num1));
        }
        else if(choice == 2) {
            double num1 = Double.parseDouble(JOptionPane.showInputDialog(null, 
            "Enter the double value: "));
            JOptionPane.showMessageDialog(null, 
            "The square of " + num1 + " is: " + Squared(num1));
        }
        else {
            System.out.println("Invalid Input.");
        }

    }

    public static int Squared(int x) {
        return x * x;
    }

    public static double Squared(double x) {
        return x * x;
    }

    
    
}
