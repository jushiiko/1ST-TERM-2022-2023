package DSA.Week1_JavaBasics2;

import java.util.*;

import javax.swing.JOptionPane;

public class Flashdrive {
    public static void main(String[] args) {
        int flashdrive = Integer.parseInt(JOptionPane.showInputDialog(null,
                "Mr Lee, how many flashdrives do you have?"));

        int gross = flashdrive / 144;
        int dozen = (flashdrive % 144) / 12;
        int remaining = (flashdrive % 12);

        JOptionPane.showMessageDialog(null, "Hi Mr. Lee, you have " + gross + " gross, " + dozen +
                " dozen, and " + remaining + " extra flash drives.");
        System.out.println("John Sebastian Ablay");

    }

}
// John Sebastian Ablay - A221