package MODULE_2;

import javax.swing.JOptionPane;

public class NumberOfSeconds {
    public static void main(String[] args) {
        int seconds;
        seconds = Integer.parseInt(JOptionPane.showInputDialog("Enter seconds: "));
        JOptionPane.showMessageDialog(null, seconds + " seconds have been converted to: " + 
        hours(seconds) + " hour/s, " + minutes(seconds) + " minute/s, and " + seconds(seconds) + " remaining second/s.");
    }

    public static int hours (int seconds) {
        int hours = seconds / 3600;
        return hours;
    }
    public static int minutes (int seconds) {
        int minutes = (seconds % 3600) / 60;
        return minutes;
    }
    public static int seconds (int seconds) {
        int seconds1 = (seconds % 3600) % 60;
        return seconds1;
    }
}
