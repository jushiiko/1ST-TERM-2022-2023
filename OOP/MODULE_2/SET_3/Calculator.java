package MODULE_2.SET_3;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Calculator extends JFrame {
    JButton add, subtract, multiply, divide;
    JTextField num1, num2;
    JLabel resultValue, enterValue1, enterValue2;

    Calculator() {
        setLayout(new GridBagLayout());
        GridBagConstraints Calculator = new GridBagConstraints();

        enterValue1 = new JLabel("1st number: ");
        Calculator.fill = GridBagConstraints.HORIZONTAL;
        Calculator.gridx = 0;
        Calculator.gridy = 0;
        add(enterValue1, Calculator);

        num1 = new JTextField(10);
        Calculator.fill = GridBagConstraints.HORIZONTAL;
        Calculator.gridx = 1;
        Calculator.gridy = 0;
        Calculator.gridwidth = 3;
        add(num1, Calculator);

        enterValue2 = new JLabel("2nd number: ");
        Calculator.fill = GridBagConstraints.HORIZONTAL;
        Calculator.gridx = 0;
        Calculator.gridy = 1;
        add(enterValue2, Calculator);

        num2 = new JTextField(10);
        Calculator.fill = GridBagConstraints.HORIZONTAL;
        Calculator.gridx = 1;
        Calculator.gridx = 1;
        add(num2, Calculator);

        add = new JButton("+");
        Calculator.fill = GridBagConstraints.HORIZONTAL;
        Calculator.gridx = 0;
        Calculator.gridy = 2;
        Calculator.gridwidth = 1;
        add(add, Calculator);

        subtract = new JButton("-");
        Calculator.fill = GridBagConstraints.HORIZONTAL;
        Calculator.gridx = 1;
        Calculator.gridy = 2;
        add(subtract, Calculator);

        multiply = new JButton("*");
        Calculator.fill = GridBagConstraints.HORIZONTAL;
        Calculator.gridx = 2;
        Calculator.gridy = 2;
        add(multiply, Calculator);

        divide = new JButton("/");
        Calculator.fill = GridBagConstraints.HORIZONTAL;
        Calculator.gridx = 3;
        Calculator.gridy = 2;
        add(divide, Calculator);

        resultValue = new JLabel("");
        Calculator.fill = GridBagConstraints.HORIZONTAL;
        Calculator.gridx = 0;
        Calculator.gridy = 4;
        Calculator.gridwidth = 4;
        add(resultValue, Calculator);

        event operations = new event();
        add.addActionListener(operations);
        subtract.addActionListener(operations);
        multiply.addActionListener(operations);
        divide.addActionListener(operations);
    }

    class event implements ActionListener {
        public void actionPerformed(ActionEvent operations) {
            double number1, number2;

            try {
                number1 = Double.parseDouble(num1.getText());
            } catch (NumberFormatException e) {
                resultValue.setText("That number is not valid.");
                resultValue.setForeground(Color.BLACK);
                return;
            }
            try {
                number2 = Double.parseDouble(num2.getText());
            } catch (NumberFormatException e) {
                resultValue.setText("That number is not valid.");
                resultValue.setForeground(Color.BLACK);
                return;
            }
            String operator = operations.getActionCommand();

            if (operator.equals("+")) {
                double sum = number1 + number2;
                resultValue.setText(number1 + "+" + number2 + "=" + sum);
                resultValue.setForeground(Color.BLACK);
            }
            if (operator.equals("-")) {
                double difference = number1 - number2;
                resultValue.setText(number1 + "-" + number2 + "=" + difference);
                resultValue.setForeground(Color.BLACK);
            }
            if (operator.equals("*")) {
                double product = number1 * number2;
                resultValue.setText(number1 + "*" + number2 + "=" + product);
                resultValue.setForeground(Color.BLACK);
            }
            if (operator.equals("/")) {
                if (number2 == 0) {
                    resultValue.setText("That equation is not valid.");
                    resultValue.setForeground(Color.BLACK);
                } else {
                    double quotient = number1 / number2;
                    resultValue.setText(number1 + "/" + number2 + "=" + quotient);
                    resultValue.setForeground(Color.BLACK);
                }
            }
        }
    }

    public static void main(String args[]) {
        Calculator ob = new Calculator();
        ob.setVisible(true);
        ob.setSize(400  ,400);
        ob.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ob.setTitle("Calculator");
    }
}