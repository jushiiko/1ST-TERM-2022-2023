package DSA.Week1_JavaBasics2;

import java.util.*;
import javax.swing.JOptionPane;

public class DevelopmentalTask {
    public static void main(String[] args) {
        String a;
        int age = Integer.parseInt(JOptionPane.showInputDialog(null, "What is your current age?"));
        if (age <= 5) {
            a = ("Infancy and Early Childhood");
        } else if (age >= 6 && age <= 12) {
            a = ("Middle Childhood");
        } else if (age >= 13 && age <= 17) {
            a = ("Adolescence");
        } else if (age >= 18 && age <= 35) {
            a = ("Early Adulthood");
        } else if (age >= 36 && age <= 60) {
            a = ("Middle Age");
        } else {
            a = ("Later Maturity");
        }
        JOptionPane.showMessageDialog(null, " Your developmental stage is " + a);
        System.out.println("John Sebastian Ablay");

    }

}
// John Sebastian Ablay - A221