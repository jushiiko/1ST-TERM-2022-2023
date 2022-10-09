/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
import javax.swing.JFrame;

/**
 *
 * @author Ablay, John Sebastian C.
 * @author Marquez, Marc Steven Q.
 * @author Panggoy, Julia Coleene B.
 */
public class ExpensesCalculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        ExpensesCalculatorGUI jgui = new ExpensesCalculatorGUI();
        jgui.setVisible(true);
        jgui.pack();
        jgui.setLocationRelativeTo(null);
        jgui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

}
