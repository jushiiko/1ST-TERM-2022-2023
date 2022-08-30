package MODULE_2;

import javax.swing.JOptionPane;

public class NumberOfSeconds {
    public static void main(String[] args) {
        int seconds;
        seconds = Integer.parseInt(JOptionPane.showInputDialog("Enter seconds: "));
        JOptionPane.showMessageDialog(null, seconds + "seconds have been converted to: " + 
        );
    }

    public static int Convert (int sec) {
        int hours = sec / 24;
        int minutes = (sec % 60) % 60;
        int seconds = sec % 60;
        return hours;

    } 
}
